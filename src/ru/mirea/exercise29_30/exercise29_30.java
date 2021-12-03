package ru.mirea.exercise29_30;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Objects;
import java.util.stream.Stream;

public class exercise29_30 {
    public static void main(String[] args) {
        HashMap<String, Integer> result = new HashMap<>();
        // Создаем словарь с ключом - слово, и значением - кол-во повторений.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        br.lines()
                .flatMap(l -> Stream.of(l.split("[\\p{Punct}\\s]+")))
                .map(String::toLowerCase)
                .forEach(w -> {
                    if (result.containsKey(w)) result.put(w, result.get(w) + 1);
                    else result.put(w, 1);
                });
        // Сортируем отображение по количеству слов в обратном порядке, по словам в лексиграфическом
        // и выводим первых 10 элементов
        result.entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    if (Objects.equals(e1.getValue(), e2.getValue())) return e1.getKey().compareTo(e2.getKey());
                    else return e2.getValue().compareTo(e1.getValue());
                })
                .limit(10)
                .forEach(e -> System.out.println(e.getKey()));
    }
}

