package com.company.checkers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeralSystemCheck {



    public static int checkSystem() {
        Scanner scanner = new Scanner(System.in);


        int number=0;
        while (true) {
            try {
                System.out.println("В какой системе счисления вы будете вводить число ?");
                number = scanner.nextInt();


            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Введите пожалуйста число");

                continue;


            }


            if (number < 2 || number > 16) {
                System.out.println("Я пока не могу выполнять вычисления в данной системе счисления, \n" +
                        "пожалуйста введите число в заданом диапазоне (2-16)");
                scanner.nextLine();

                continue;



            }else {return number;}
        }

    }
}
