package ru.mirea.exercise21_22.section1;

public class Main {
    public static void main(String[] args) {
        NumberFactory numberFactory = new ComplexNumberFactory();
        Number number = new ComplexNumber();
        SumNumber sumNumber = new SumComplexNumber();

        System.out.println("Общий вид комплексного числа: ");
        number.printNumber();

        System.out.println("Сумма комплексного числа: ");
        sumNumber.printSumNumber();

    }
}
