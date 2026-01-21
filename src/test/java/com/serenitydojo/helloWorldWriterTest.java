package com.serenitydojo;

import org.junit.Test;

public class helloWorldWriterTest {

    @Test
    public void shouldWriteHelloWorldToTheConsole(){
        HelloWorldWriter writer = new HelloWorldWriter();

        writer.writeHelloWorld();
    }

}
