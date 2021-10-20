package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class opg_1 {

    public static void main(String[] args) {
        File file =new File("data/demo.txt");
        try {
            Scanner sc = new Scanner(file);
            String linje;
            String[] ordListe;

            while (sc.hasNext()) {
                linje = sc.nextLine();
                ordListe = linje.split(" ");
                for (int i = 0; i < ordListe.length; i++) {
                    if (ordListe[i].length() > 5) {
                        System.out.print(ordListe[i].toUpperCase() + " ");
                    } else {
                        System.out.print(ordListe[i] + " ");
                    }
                }
                System.out.println("");
            }
            /*linje = sc.nextLine();
            String[] ordListe2 = linje.split(" ");
            for (int i = 0; i < ordListe2.length; i++) {
                if (ordListe2[i].length() > 5){
                    System.out.print(ordListe2[i].toUpperCase()+ " ");
                }else {
                    System.out.print(ordListe2[i]+ " ");
                }
            }*/
        } catch (FileNotFoundException e) {
            System.out.println("Kaffepause " + e.getMessage());
        }
    }
}
