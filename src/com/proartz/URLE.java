package com.proartz;

import java.net.*;
import java.io.*;


public class URLE {
    public static void main(String[] args) throws Exception {
        URL oracle = new URL("http://wp.pl/");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));

        String inputLine;
        while((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}