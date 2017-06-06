package com.shurda.andrey.se.Lab1_8.testurlconnect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Create new project called TestURLConnection. Add package “com.brainacad.oop.testurlconnect”.
 * Create a class Main with a main() method, which:
 * 1) Defines a resource type URL ("http://www.brainacad.com");
 * 2) Establishes with him the type of connection URLConnection;
 * 3) Opens a stream for reading and outputs the result.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://mainacad.com/");
        URLConnection urlConnection = url.openConnection();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String inputLine;
        while ((inputLine = bufferedReader.readLine()) != null) {
            System.out.println(inputLine);
        }
        bufferedReader.close();
    }
}
