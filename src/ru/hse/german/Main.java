package ru.hse.german;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 1 если вы хотите переводить сантиметры в дюймы и 2 если дюймы в сантиметры: ");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int number = scanner.nextInt();
            while (!(number == 1 || number ==2)){
                System.out.println("вы ввели не число 1 или 2");
                number = scanner.nextInt();
            }
            if(number == 1){
                System.out.println("Введите действительное число:");
                if(scanner.hasNextDouble()){
                    double ans = scanner.nextDouble();
                    System.out.println(ans / 2.54);
                }
                else{
                    System.out.println("Вы ввели не число");
                }
            }
            else{
                System.out.println("Введите действительное число");
                if(scanner.hasNextDouble()){
                    double ans = scanner.nextDouble();
                    System.out.println(ans * 2.54);
                }
                else{
                    System.out.println("Вы ввели не число");
                }
            }
        }
        if(!scanner.hasNextInt()) System.out.println("Вы ввели не число");
    }
}