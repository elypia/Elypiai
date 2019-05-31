package com.elypia.elypiai.urbandictionary.test;

import com.elypia.elypiai.common.test.TestUtils;
import com.elypia.elypiai.urbandictionary.DefineResult;
import com.elypia.elypiai.urbandictionary.Definition;
import com.elypia.elypiai.urbandictionary.UrbanDictionary;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.io.IOException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

public class UrbanDictionaryTest {

    private static MockWebServer server;
    private static UrbanDictionary ud;

    @BeforeEach
    public void beforeEach() throws IOException {
        server = new MockWebServer();
        server.start();
        ud = new UrbanDictionary(new URL("http://localhost:" + server.getPort()));
    }

    @AfterEach
    public void afterEach() throws IOException {
        server.close();
    }

    @Test
    public void createNormalInstance() {
        assertDoesNotThrow((Executable)UrbanDictionary::new);
    }

    @Test
    public void parseResults() throws IOException {
        server.enqueue(new MockResponse()
            .setBody(TestUtils.read("define_jen"))
        );
        DefineResult result = ud.define("jen").completeGet();

        assertAll("Ensure Parsing Result Data Correctly",
            () -> assertEquals(0, result.getSounds().size()),
            () -> assertEquals(7768484, result.getDefinition(false).getDefinitionId()),
            () -> assertEquals(7768484, result.getDefinition().getDefinitionId()),
            () -> assertFalse(result.getDefinitions().isEmpty()),
            () -> assertEquals(0, result.getSounds(5).size())
        );
    }

    @Test
    public void parseDefinition() throws IOException {
        server.enqueue(new MockResponse()
            .setBody(TestUtils.read("define_jen"))
        );
        Definition definition =  ud.define("jen").completeGet().getDefinitions(true).get(0);

        assertAll("Ensure Parsing Result Data Correctly",
            () -> assertEquals("Gorgeous, amazing, perfect everything. The girl who has always been my best friend, the girl who I should've been chasing this [whole time]. I love her. <[333]\r\n\r\n- [Sugarlips]", definition.getDefinition()),
            () -> assertEquals("http://jen.urbanup.com/1859201", definition.getPermaLink()),
            () -> assertEquals(2274, definition.getThumbsUp()),
            () -> assertEquals("mikev²", definition.getAuthor()),
            () -> assertEquals("Jen", definition.getWord()),
            () -> assertEquals(1859201, definition.getDefinitionId()),
            () -> assertNull(definition.getCurrentVote()),
            () -> assertEquals("Jen was always my friend, then [best friend], then [lover], now [my love].", definition.getExample()),
            () -> assertEquals(1161, definition.getThumbsDown())
        );
    }

    @Test
    public void parseResultsFuck() throws IOException {
        server.enqueue(new MockResponse()
            .setBody(TestUtils.read("define_fuck"))
        );

        DefineResult result = ud.define("fuck").completeGet();
        assertAll("Ensure Parsing Result Data Correctly",
            () -> assertFalse(result.getSounds().isEmpty()),
            () -> assertFalse(result.getDefinitions().isEmpty()),
            () -> assertEquals(5, result.getSounds(5).size())
        );
    }

    @Test
    public void parseNoResults() throws IOException {
        server.enqueue(new MockResponse()
            .setBody(TestUtils.read("define_no-definitions"))
        );

        DefineResult result = ud.define("iohwefiwhofhweohfowief").completeGet();
        assertAll("Ensure Parsing No Result Data Correctly",
            () -> assertTrue(result.getSounds().isEmpty())
        );
    }
}
