package com.shurda.andrey.Lab2_9.com.brainacad.oop.teststring1.com.brainacad.oop.teststring2;

import java.util.StringTokenizer;

/**
 * Created by User on 04.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        String myStr1="Cartoon";
        String myStr2="Tomcat";


        StringTokenizer s = new StringTokenizer(myStr1, myStr2);
        while (s.hasMoreElements()) {
            System.out.print(s.nextElement()+" ");
        }

        }
    }
