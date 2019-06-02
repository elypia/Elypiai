package com.elypia.elypiai.nanowrimo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;

public class WordCountEntry {

    @XmlElement(name = "wc")
    private int wordcount;

    @XmlElement(name = "wcdate")
    @XmlJavaTypeAdapter(NanoDateAdapater.class)
    private Date date;

    public int getWordcount() {
        return wordcount;
    }

    public Date getDate() {
        return date;
    }
}
