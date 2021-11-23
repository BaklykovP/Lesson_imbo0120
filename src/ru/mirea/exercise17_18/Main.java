package ru.mirea.exercise17_18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Пункт первый
        section1();
        //Пункт второй
        section2();
        //Пункт третий
        section3();

    }

    private static void section1() {
        String regex = "abcdefghijklmnopqrstuv18340";
        String input = "abcdefghijklmnoasdfasdpqrstuv18340";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(input);
        if(m1.matches())
            System.out.println("Текст одинаковый");
        else
            System.out.println("Текст не совпадает"); // <------
    }

    private static void section2() {
        String regex = "[a-fA-F0-9]{2}:[a-fA-F0-9]{2}:[a-fA-F0-9]{2}:[a-fA-F0-9]{2}:[a-fA-F0-9]{2}:[a-fA-F0-9]{2}";
        String input = "AE:AC:6A:56:76:54";
        Pattern p2 = Pattern.compile(regex);
        Matcher m2 = p2.matcher(input);
        if(m2.matches())
            System.out.println("MAC-адрес"); // <------
        else
            System.out.println("не MAC-адрес");
    }

    private static void section3() {
        String input = "23.21 USD, 14 RUR, 81 UDD, 125 EU,  41.96 AMM";
        String regex = "[0-9 .]* (RUR|USD|EU)";
        Pattern p3 = Pattern.compile(regex);
        Matcher m3 = p3.matcher(input);
        while(m3.find()){
            System.out.print(m3.group() + ", ");
        }
    }


}
