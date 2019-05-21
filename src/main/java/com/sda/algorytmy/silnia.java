package com.sda.algorytmy;

import java.util.Scanner;

public class silnia {

        public static void main (String[]args ){

            Scanner scanner = new Scanner(System.in);

            int silnia = scanner.nextInt();

            int wynik = 1;

            for (int i = 1; i <= silnia; i++) {

                wynik = wynik * i;

            }

            System.out.println("Silnia z: " + silnia + "!" + " wynosi: " + wynik);

        }

    }