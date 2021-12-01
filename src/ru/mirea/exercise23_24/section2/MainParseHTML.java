package ru.mirea.exercise23_24.section2;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MainParseHTML {

    public static void main(String[] args) throws IOException {
        List<Image> imageList = new ArrayList<>();

        Document doc = Jsoup.connect("https://www.mirea.ru/").get();

        Elements links = doc.select("img");

        for (Element link : links) {
            String absHref = link.attr("abs:src");
            if (!absHref.equals(""))
                imageList.add(new Image(absHref));
        }

        // Выводим список фотографий
        for (Image imageLink : imageList) {
            System.out.println(imageLink);
        }

        // Скачивает файл по url
        int i = 0;
        for (Image image : imageList) {
            String fileName = "src\\ru\\mirea\\exercise23_24\\section2\\images\\" + i + "image.jpg";
            downloadImages(image.getUrl(), fileName);
            ++i;
        }
    }

    static boolean downloadImages(String url, String name) {
        try (InputStream in = URI.create(url).toURL().openStream()) {
            Files.copy(in, Paths.get(name));
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
