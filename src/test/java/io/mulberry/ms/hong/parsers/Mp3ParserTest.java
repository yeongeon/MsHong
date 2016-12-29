package io.mulberry.ms.hong.parsers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

import static org.junit.Assert.*;

public class Mp3ParserTest {
    private Mp3Parser parser;

    @Before
    public void setUp() throws Exception {
        String path = Mp3ParserTest.class.getResource("/mp3/speakingsamplepart1recording.mp3").getPath();
        parser = new Mp3Parser(path);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void parse() throws Exception {
        OutputStream outputStream = new ByteArrayOutputStream();
        parser.parse(outputStream);
    }

}