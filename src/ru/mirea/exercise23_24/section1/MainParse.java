package ru.mirea.exercise23_24.section1;


import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;


public class MainParse {
    public static void main(String[] args) throws IOException, CsvException {
        Scanner sc = new Scanner(System.in);
        String path = "src\\ru\\mirea\\exercise23_24\\section1\\movementsList.csv";

        while (true) {
            System.out.println("""
                    Что хотите получить:
                    1.Полную таблицу рассходов;
                    2.Полную таблицу приходов;
                    3.Общая сумма расходов и приходов;
                    4.Выход;""");

            System.out.print("Ответ: ");

            int command = sc.nextByte();
            CSVReader reader = new CSVReader(new FileReader(path));

            if (command == 1) {
                System.out.println("Таблица расходов с датами:");
                getExpenses(reader);
            } else if (command == 2) {
                System.out.println("Таблица приходов с датами:");
                getIncome(reader);
            } else if (command == 3) {
                getSumExpensesAndIncome(reader);
            } else if (command == 4)
                break;
            else
                System.out.println("Такой команды не существует.");

            System.out.println();
        }

        System.out.println("CSV reader complete;");

    }

    static void getExpenses(CSVReader reader) throws CsvValidationException, IOException {
        String[] csvValueExpenses;
        boolean flagExpenses = true;

        while ((csvValueExpenses = reader.readNext()) != null) {
            if (flagExpenses) {
                System.out.println(csvValueExpenses[7]);
                flagExpenses = false;
            } else {
                if (!Objects.equals(csvValueExpenses[7], "0"))
                    System.out.println("Дата: " + csvValueExpenses[3] + "\tРасход: " + csvValueExpenses[7]);
            }
        }
    }

    static void getIncome(CSVReader reader) throws CsvValidationException, IOException {
        String[] csvValueIncome;
        boolean flagIncome = true;

        while ((csvValueIncome = reader.readNext()) != null) {
            if (flagIncome) {
                System.out.println(csvValueIncome[6]);
                flagIncome = false;
            } else {
                if (!Objects.equals(csvValueIncome[6], "0"))
                    System.out.println("Дата: " + csvValueIncome[3] + "\tПриход: " + csvValueIncome[6]);
            }
        }
    }

    static void getSumExpensesAndIncome(CSVReader reader) throws CsvValidationException, IOException {
        String[] csvValue;
        double sumExpenses = 0;
        double sumIncome = 0;
        boolean flag = true;

        while ((csvValue = reader.readNext()) != null) {
            if (flag)
                flag = false;
            else {
                sumExpenses += Double.parseDouble(csvValue[7]); //Сумма расходов
                sumIncome += Double.parseDouble(csvValue[6]); //Сумма приходов}
            }
        }

        System.out.println("Сумма расходов: " + sumExpenses + ";\n" +
                "Сумма приходов: " + sumIncome + ';');
    }


}