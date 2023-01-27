package org.example;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        URL personalSite = new URL("http://ldbn.escuelaing.edu.co:80/respuestasexamenes.txt?edad=15#getRef--");

        System.out.println(personalSite.getProtocol());
        System.out.println(personalSite.getAuthority());
        System.out.println(personalSite.getHost());
        System.out.println(personalSite.getPort());
        System.out.println(personalSite.getPath());
        System.out.println(personalSite.getQuery());
        System.out.println(personalSite.getFile());
        System.out.println(personalSite.getRef());

        //System.out.println("Hello world!");
    }
}