package ru.mirea.exercise25_26;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Exercise25_26 {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) throws IOException {
        List<MetroLine> metroLinesList = new ArrayList<>();
        List<MetroStation> metroStationList = new ArrayList<>();

        ParseHTML(metroLinesList, metroStationList);

        Metro MoscowMetro = new Metro(metroLinesList,metroStationList);
        String json = GSON.toJson(MoscowMetro);


        writeInfoToFile(json);


        System.out.println(json);
        System.out.println();
    }

    private static void writeInfoToFile(String json) throws IOException {
        File file = new File("src\\ru\\mirea\\exercise25_26\\res\\metroMoscowInfo.txt");

        if(!file.exists())
            file.createNewFile();

        PrintWriter pw = new PrintWriter(file);
        pw.println(json);
    }


    private static void ParseHTML(List<MetroLine> metroLinesList, List<MetroStation> metroStationList) throws IOException {
        Document doc = Jsoup.connect("https://www.moscowmap.ru/metro.html#lines").maxBodySize(0).get();
        // выбираем инфу про метро
        Element mainElement = doc.select("div[id=metrodata]").first();


        //Взяли код Соколинная гора
        Elements metroLinesInfo = mainElement.select("span");


        String numberLineMetro = "";
        for (Element elementLines : metroLinesInfo) {

            if (!elementLines.select("span[class^=js-metro-line]").text().equals("")) {
                String nameLineMetro = elementLines.select("span[class^=js-metro-line]").text();
                numberLineMetro = elementLines.attr("data-line");
                metroLinesList.add(new MetroLine(nameLineMetro, numberLineMetro));
            } else if (!elementLines.select("span[class=name]").text().equals("")) {
                String nameStationMetro = elementLines.select("span[class=name]").text();
                metroStationList.add(new MetroStation(nameStationMetro, numberLineMetro));
            }
        }
    }
}


