package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double ergebnis;
        double zahl1;
        double zahl2;

        Scanner input = new Scanner(System.in);

        System.out.println("Bitte eine Zahl1 eingeben:");
        zahl1 = input.nextDouble();

        System.out.println("Bitte eine Zahl2 eingeben:");
        zahl2 = input.nextDouble();

        ergebnis = zahl1 + zahl2;
        ergebnis = Math.floor(ergebnis * 100)/100;

        System.out.println("Die Summe von " + zahl1 + " und " + zahl2 + " lautet: " + ergebnis);

    }
}
