package com.futurecollars;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        boolean runApp = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Podaj jaką operację chcesz wykonać na 2 liczbach: ");
            System.out.println(" 1 - dodać; 2 - odjąć; 3 - pomnożyć; 4 - podzielić");
            System.out.println(" 0 - zakończyć działanie kalkulatora \n");
            int option = scanner.nextInt();
            if (option == 0) {
                runApp = false;
                System.out.println("Działanie kalkutatora zostało zakończone");
            } else {
                System.out.println(" Podaj pierwszą liczbę: ");
                int nr1 = scanner.nextInt();
                System.out.println(" Podaj drugą liczbę: ");
                int nr2 = scanner.nextInt();
                System.out.println("Wynik: " + runCalculator(option, nr1, nr2));
            }
        } while (runApp);
    }

    public static String runCalculator(int option, int nr1, int nr2) {

        switch (option) {
            case 1:
                return String.valueOf(add(nr1, nr2));
            case 2:
                return String.valueOf(subtract(nr1, nr2));

            case 3:
                return String.valueOf(multiply(nr1, nr2));

            case 4:
                return divide(nr1, nr2);

            default:
                return "Błędnie podana opcja";
        }

    }

    private static int add(int nr1, int nr2) {
        return nr1 + nr2;
    }

    private static int subtract(int nr1, int nr2) {
        return nr1 - nr2;
    }

    private static int multiply(int nr1, int nr2) {
        return nr1 * nr2;

    }

    private static String divide(int nr1, int nr2) {
        if (nr2 == 0) {
            return "Dzielenie przez zero jest niewykonalne";
         } else {
            return String.valueOf(nr1 / nr2);
        }
    }
}



