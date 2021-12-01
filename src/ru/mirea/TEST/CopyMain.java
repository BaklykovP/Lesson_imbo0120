package ru.mirea.TEST;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class CopyMain {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("http://jsoup.org").get();

        Element link = doc.select("a").first();
        String relHref = link.attr("href"); // == "/"
        String absHref = link.attr("abs:href"); // "http://jsoup.org/"

        System.out.println(relHref);

        System.out.println(absHref);
    }
}
