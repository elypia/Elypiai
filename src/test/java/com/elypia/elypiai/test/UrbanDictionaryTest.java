package com.elypia.elypiai.test;

import com.elypia.elypiai.urbandictionary.UrbanDefinition;
import com.elypia.elypiai.urbandictionary.UrbanDictionary;
import com.elypia.elypiai.urbandictionary.UrbanResult;
import com.elypia.elypiai.urbandictionary.data.UrbanResultType;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UrbanDictionaryTest {

    @Test
    public void urbanDictionaryTest() {
        UrbanDictionary ud = new UrbanDictionary();
        assertNotNull(ud);
    }

    @Test
    public void testParsingDefinition() {
        String json = "{\"tags\":[\"jennifer\",\"jennifer\",\"jenny\",\"jenny\",\"jennings\",\"jennings\",\"jenn\",\"jenn\",\"jens\",\"jens\"],\"result_type\":\"exact\",\"list\":[{\"definition\":\"Gorgeous, amazing, perfect everything. The girl who has always been my best friend, the girl who I should've been chasing this whole time. I love her. <333\\r\\n\\r\\n- Sugarlips\",\"permalink\":\"http://jen.urbanup.com/1859201\",\"thumbs_up\":2269,\"author\":\"mikev²\",\"word\":\"Jen\",\"defid\":1859201,\"current_vote\":\"\",\"example\":\"Jen was always my friend, then best friend, then lover, now my love.\",\"thumbs_down\":1160},{\"definition\":\"The best thing that ever happened to me, My favorite mistake, the one who got away. The angel to my nightmares, You awake every morning, thinking of your love, having dreams of them all night, the pain of separation searing your heart every time a site or smell brings back the nostalgia of your last encounter. Daydreaming, constantly thinking \\\"I wish they were here so I could share this moment\\\" even when watching Family Guy or walking the dog. The consuming fire within the heart for even one more moment with ones love that defies rational thought, knowing full well, one moment would never be enough, yearning for eternity together. The only girl I truly love and will always miss.... You Know Who You Are...\",\"permalink\":\"http://jen.urbanup.com/4297504\",\"thumbs_up\":1228,\"author\":\"Asehole\",\"word\":\"Jen\",\"defid\":4297504,\"current_vote\":\"\",\"example\":\"Where is Jen I really miss her.... :(\",\"thumbs_down\":577},{\"definition\":\"Highly intelligent, attractive, and creative. Witty and usually sarcastic. Compassionate & very loyal once you win her over -- warning, she will hold her own and do what's necessary if you prove incapable of being a healthy asset to her life. Ah, and certainly not least she is also very sensual... you'd be damn lucky to get her in bed let alone find a place in her heart.\",\"permalink\":\"http://jen.urbanup.com/6324374\",\"thumbs_up\":912,\"author\":\"nutty duck\",\"word\":\"Jen\",\"defid\":6324374,\"current_vote\":\"\",\"example\":\"\\\"Jen is the woman of my dreams.\\\"\",\"thumbs_down\":289},{\"definition\":\"Cool guy\",\"permalink\":\"http://jens.urbanup.com/259888\",\"thumbs_up\":584,\"author\":\"tiziliAN\",\"word\":\"Jens\",\"defid\":259888,\"current_vote\":\"\",\"example\":\"Dude! That guy's awesome! Is his name Jens?\",\"thumbs_down\":244},{\"definition\":\"The Ulimate Sex Maskine...\",\"permalink\":\"http://jens.urbanup.com/1532801\",\"thumbs_up\":531,\"author\":\"Morradi\",\"word\":\"jens\",\"defid\":1532801,\"current_vote\":\"\",\"example\":\"Jens is The Ulimate Sexmaskin ever... \",\"thumbs_down\":305},{\"definition\":\"An amazing girl like no other that can make you smile in any situation and gives you a reason to wake up in the morning. She is amazing and epicly beastly, therefore, making her the greatest person on Earth. Someone who you could spend the rest of your life with, and makes everyday new, and amazing.\",\"permalink\":\"http://jen.urbanup.com/4652877\",\"thumbs_up\":632,\"author\":\"Psyekcho\",\"word\":\"Jen\",\"defid\":4652877,\"current_vote\":\"\",\"example\":\"Anonymous1: The cow howls at sunrise, as the hazelnut of sacks gallops through the forest.\\n\\nAnonymous2: Dude, that was so Jen.\\n\\nAnonymous1: Awesome, huh?\\r\\nAnonymous2: Well, I DID say Jen didn't I?\",\"thumbs_down\":451},{\"definition\":\"A real down-to-earth and funny female. She is nice to talk to and not judgemental. She has a neat way of reasoning w/ life. Always helpful, kind, generous and funny. And to top it off. She's a great cook!!!\",\"permalink\":\"http://jen.urbanup.com/5925782\",\"thumbs_up\":325,\"author\":\"polishedgemajewel\",\"word\":\"Jen\",\"defid\":5925782,\"current_vote\":\"\",\"example\":\"I was grocery shopping earlier. I couldn't find the taco section due to them rearranging the whole store. And this gal saw I was stumped and told me where it was. You must've ran into a Jen.\",\"thumbs_down\":172},{\"definition\":\"A unique sweetheart by being extremely understanding, open & honest. Her generosity makes a heart of gold & beautiful soul. A reason why people like her, even the wrong ones which she has a long history of rising above. Orderly, assertive, wilful & passionate, she has tons of life experience learning from mistakes and hard work to become genuine & independent. It is because of this that she carries a deeply quiet confidence & truth.\\r\\nThis is how she raises unspoiled & caring children, placing value in raising fewer but more well rounded human beings. She's intelligent, knows all your secrets & will know when you try to slyly insult her. She knows how to have more fun than your prude girlfriend because she's pure fucking magic & free of inhibitions, which most people are not mature enough to handle.\",\"permalink\":\"http://jen.urbanup.com/7768484\",\"thumbs_up\":151,\"author\":\"RebelQueen11\",\"word\":\"Jen\",\"defid\":7768484,\"current_vote\":\"\",\"example\":\"Jen wants you to be your own awesome self!!!\",\"thumbs_down\":25},{\"definition\":\"Most likely the best name to have, ... ever.\\r\\nIf you haven't been blessed with this name,\\r\\nits ok. You'll get over it :D\\r\\n\\r\\n(and if this isn't your name or your friend/significant other's name then why would you waste your time and effort looking it up?)\",\"permalink\":\"http://jen.urbanup.com/2858349\",\"thumbs_up\":776,\"author\":\"Xx.your_favorite_bitch.xX\",\"word\":\"Jen\",\"defid\":2858349,\"current_vote\":\"\",\"example\":\"Are you serious? Your name's Jen?! Fuck, you are one lucky little bitch! =D\\r\\n\\r\\nor\\r\\n\\r\\nI wish my name was Jen...\",\"thumbs_down\":651},{\"definition\":\"A woman of unparalleled beauty, whose smile lights up a room, and whose laugh warms my heart. She is open, funny, friendly, and utterly breathtaking. She thrills me in new ways each day and in each moment together. I will never get tired of her, for its enough simply to be with someone so incredible and amazing. She may be eternities away, yet still my heart still stops each time I look into her eyes. She is my only thought. My one person and my other half. My dream and my fantasy. Every moment apart is blissful agony; knowing what we have and what it could be. The only one worth waiting for. The best thing ever and forever.\",\"permalink\":\"http://jen.urbanup.com/5121528\",\"thumbs_up\":413,\"author\":\"dvn321\",\"word\":\"jen\",\"defid\":5121528,\"current_vote\":\"\",\"example\":\"Surfer : aah sick barrel dude, that s must make you feel on top of the world, best wave ever!\\n\\nMe : yeah bru, it was a total jen\",\"thumbs_down\":304}],\"sounds\":[]}";
        JSONObject object = new JSONObject(json);
        UrbanResult result = new UrbanResult(object, "jen");

        assertAll("Ensure Parsing Result Data Correctly",
            () -> assertEquals("jen", result.getSearchTerm()),
            () -> assertEquals(UrbanResultType.EXACT, result.getResultType()),
            () -> assertEquals(0, result.getSounds().length)
        );

        UrbanDefinition definition = result.getResult(false);

        assertAll("Ensure Parsing Result Data Correctly",
            () -> assertEquals("Gorgeous, amazing, perfect everything. The girl who has always been my best friend, the girl who I should've been chasing this whole time. I love her. <333\r\n\r\n- Sugarlips", definition.getDefinition()),
            () -> assertEquals("http://jen.urbanup.com/1859201", definition.getPermaLink()),
            () -> assertEquals(2269, definition.getThumbsUp()),
            () -> assertEquals("mikev²", definition.getAuthor()),
            () -> assertEquals("Jen", definition.getWord()),
            () -> assertEquals(1859201, definition.getDefinitionId()),
            () -> assertEquals(null, definition.getCurrentVote()),
            () -> assertEquals("Jen was always my friend, then best friend, then lover, now my love.", definition.getExample()),
            () -> assertEquals(1160, definition.getThumbsDown())
        );
    }
}
