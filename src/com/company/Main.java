package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // opgave 3.3
        int userSec;
        int hours;
        int minutes;
        int seconds;

        Scanner userTal = new Scanner(System.in);
        System.out.println("please enter the number in seconds");
        userSec = userTal.nextInt();

        hours = userSec/3600;
        minutes = userSec%3600/60;
        seconds = userSec%3600%60;

        System.out.print(userSec+" seconds = ");
        System.out.print(hours+" hours, ");
        System.out.print(minutes+" minutes, ");
        System.out.print(seconds+" seconds");
    }
}
