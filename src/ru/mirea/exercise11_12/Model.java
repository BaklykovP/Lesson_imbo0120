package ru.mirea.exercise11_12;
public class Model {
    public double calculation(double a, double b, String operator) {
        switch (operator) {
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                if (b == 0) return 0;
                else return Math.ceil((a / b) * Math.pow(10, 4)) / Math.pow(10, 4);
            default:
                System.out.println("Неизвестный оператор" + operator);
                return 0;
        }
    }
    public String mathematicalExample(String a, String b, String operator){
        return (a + operator + b);
    }
}
