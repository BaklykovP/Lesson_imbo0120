package ru.mirea.exercise21_22.section3;

import java.util.Scanner;

public class ProjectDocument {
    public static void main(String[] args) {
        ICreateDocument iCreateDocument = new TextCreateDocument();

        Scanner sc = new Scanner(System.in);
        int command;

        // консольная имитация меню программы у текстового редактора
        while (true) {
            System.out.println("""
                    Какой пункт нажат:
                    1. File -> New;
                    2. File -> Open;
                    3. File -> Save;
                    4. File -> Exit;
                    """);

            command = sc.nextInt();

            if (command == 1) {
                System.out.println("Создание нового редактора текса...\n");
                IDocument textDocument = iCreateDocument.createNew();
                textDocument.printFunctions();
            } else if (command == 2) {
                System.out.println("Открытие редактора текса...\n");
                IDocument textDocument = iCreateDocument.createOpen();
                textDocument.printFunctions();
            } else if (command == 3)
                System.out.println("Файл сохранен\n");
            else if (command == 4) {
                System.out.println("Выход из редактора...\n");
                break;
            } else
                System.out.println("Такой команды не существует, попробуйте снова.\n");
        }
    }
}
