package ru.mirea.exercise19_20;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        List<String> alphabet = new ArrayList(Arrays.asList("А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"));
        List<String> numberPlates = new ArrayList<>();
        System.out.print("Сколько номеров сгенерировать: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; ++i)
            numberPlates.add(getNumberPlate(alphabet));

        System.out.println("ДО: " + numberPlates);

        System.out.print("Какой номер нужно найти: ");
        String checkNumberPlates = sc.next();

        checkContainArray(checkNumberPlates, numberPlates);

        checkCollectionsBinarySearch(checkNumberPlates, numberPlates);

        setHashСontains(checkNumberPlates, numberPlates);

        setTreeСontains(checkNumberPlates, numberPlates);

    }

    //прямым перебором по ArrayList, (array.contains())
    private static void checkContainArray(String checkNumberPlates, List<String> numberPlates){
        String stateArray;
        long start = System.nanoTime();

        if(numberPlates.contains(checkNumberPlates))
            stateArray = "найден";
        else
            stateArray = "не найден";
        System.out.printf("Поиск перебором: номер %s, поиск занял %d нс;\n", stateArray, (System.nanoTime() - start));
    }

    private static void checkCollectionsBinarySearch(String checkNumberPlates, List<String> numberPlates){
        // Копируем значение основного списка номеров, что не менять его значения
        List<String> numberPlatesCopy = new ArrayList<>(numberPlates);
        Collections.sort(numberPlatesCopy);

        String stateBinary;
        long start = System.nanoTime();

        int t = Collections.binarySearch(numberPlatesCopy, checkNumberPlates);
        if(t == -1)
            stateBinary = "найден";
        else
            stateBinary = "не найден";
        System.out.printf("Бинарный поиск: номер %s, поиск занял %d нс;\n", stateBinary, (System.nanoTime() - start));
    }

    private static void setHashСontains(String checkNumberPlates, List<String> numberPlates){
        HashSet<String> hashNumberPlates = new HashSet<>(numberPlates);

        String stateHash;
        long start = System.nanoTime();

        if(hashNumberPlates.contains(checkNumberPlates))
            stateHash = "найден";
        else
            stateHash = "не найден";
        System.out.printf("Поиск в HashSet: номер %s, поиск занял %d нс;\n", stateHash, (System.nanoTime() - start));
    }

    private static void setTreeСontains(String checkNumberPlates, List<String> numberPlates){
        TreeSet<String> TreeNumberPlates = new TreeSet<>(numberPlates);

        String stateTree;
        long start = System.nanoTime();

        if(TreeNumberPlates.contains(checkNumberPlates))
            stateTree = "найден";
        else
            stateTree = "не найден";
        System.out.printf("Поиск в TreeSet: номер %s, поиск занял %d нс;\n", stateTree, (System.nanoTime() - start));
    }



    private static String getNumberPlate(List<String> alphabet) {
        Random random0 = new Random();
        return alphabet.get(random0.nextInt(alphabet.size())) + getRandomDigitOrNumber(true) +
                getRandomDigitOrNumber(true) + getRandomDigitOrNumber(true) +
                alphabet.get(random0.nextInt(alphabet.size())) + alphabet.get(random0.nextInt(alphabet.size())) +
                getRandomDigitOrNumber(false);
    }


    private static String getRandomDigitOrNumber(boolean flag) {
        Random random1 = new Random();
        if (flag)
            // Генерация случайного числа от 0 до 9(включая 9)
            return Integer.toString(random1.nextInt(10));
        else {
            // Генерация случайного числа от 1 до 99(включая 99), если число от 1до 9, то добавляем в начало 0
            int t = 1 + random1.nextInt(100 - 1);
            if (t < 10)
                return "0" + t;
            else
                return Integer.toString(t);
        }
    }

}
