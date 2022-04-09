package com.company.checkers;

import java.util.Scanner;

public class ConvertAndCheck {
    public static void check() {
        Scanner scanner = new Scanner(System.in);
        String str = "0123456789ABCDEF";
        StringBuffer fin= new StringBuffer(" ");


        int num = 0;
        int numeral = NumeralSystemCheck.checkSystem();
        int lastnumeral = NumeralSystemCheck.checkSystem();

        System.out.println("Введите число в нужной системе счисления");
        String number = scanner.nextLine();
        number = number.toUpperCase();


        for (int i = 0; i != number.length();) {

            if (str.indexOf(number.charAt(i)) > numeral - 1) {
                System.out.println("Одно из значений превышает систему счисления , которую вы вводили" + number.charAt(i));

                i++;
                number=scanner.nextLine();





            }else {
                for (int j = number.length()-1; j >= 0; j--) {

                    num=num+str.indexOf(number.charAt(j))*pow(numeral,i);
                    i++;




                }

            }


        }

        if (lastnumeral != 10) {
            while (num / lastnumeral > lastnumeral){
                fin.insert(fin.length(), str.charAt(num % lastnumeral));
                num = num / lastnumeral;
            }
            fin.insert(fin.length(), str.charAt(num % lastnumeral));
            fin.insert(fin.length(), str.charAt(num / lastnumeral));
            fin=fin.reverse();

        }else {
            fin=fin.insert(0,num);
        }

        System.out.println("Число"+number+" в "+lastnumeral+"системе счисления равно="+fin);





        }





    public static int pow(int value, int powValue) {
        int result = 1;
        for (int i = 1; i <= powValue; i++) {
            result = result * value;
        }
        return result;


    }
}



