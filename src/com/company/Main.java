package com.company;

import java.util.Scanner;

/*
*User inputs time in 24-hour clock format.Program outputs it into both 12-hour and 24-hour clock format.
* Also program calculates number of seconds passed since midnight.Validation is considered.
* Practical Work 1
* 10.10.2021
* @Ketevan Kavtaradze
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Please use 24-hour format. Represent values according to an example: HH:MM:SS");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the hour ");
        String hour = input.nextLine();
        System.out.println("Please enter the minute ");
        String minute = input.nextLine();
        System.out.println("Please enter the second  ");
        String second = input.nextLine();

        int hInt=Integer.parseInt(hour);
        int mInt=Integer.parseInt(minute);
        int sInt=Integer.parseInt(second);

        // if statements validate input
        if (hour.length()==2 && minute.length()==2 && second.length()==2){
            if(0 <= hInt && hInt<=23 && mInt>=0 && mInt <=59 && sInt>=0 && sInt<=59) {
                //Print 24-hour clock format
                System.out.println("24-hour clock format: " + hour + ": " + minute + ": " + second);
                //Convert into 12-hour clock format
                if (hInt >= 13 && hInt <= 23) {
                    int hInt2 = hInt - 12;
                    System.out.println("12-hour clock format:" + hInt2 + ": " + minute + ": " + second);
                } else {
                    System.out.println("12-hour clock format:" + hInt + ": " + minute + ": " + second);
                }
                System.out.println("Number of seconds passed since midnight: " + (hInt * 3600 + mInt * 60 + sInt));
            }
            //Output if value is not valid
            else System.out.print("Invalid input");
        }
        //Output if format is incorrect
        else System.out.print("Every value must be 2-digit");

    }
}
