package ru.mirea.practice1;

public class practice1_3 {

        public static void main(String[] args) {

            int array[] = {1, 2, 4, 5, 6};
            int sum1 = 0, sum2 = 0, sum3 = 0, i = 0;

            //the first option
            for(int var: array){
                sum1+=var;
            }

            System.out.println("sum1 = " + sum1);

            //the second option
            while(i < array.length){
                sum2 += array[i];
                ++i;
            }
            i = 0;
            System.out.println("sum2 = " + sum2);

            //the third option
            do{
                sum3 += array[i];
                ++i;
            } while(i < array.length);
            System.out.println("sum3 = " + sum3);
        }
}
