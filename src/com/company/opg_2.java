package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class opg_2 {
    public static void main(String[] args) {
        File file =new File("data/DMI.txt");
        try {

            Scanner sc = new Scanner(file);
            String linje;
            String[] ordListe;
            int int1;
            int total = 0;
            int gennemsnit = 0;

            while (sc.hasNext()){
                linje = sc.nextLine();
                ordListe= linje.split(" ");
            int1 = Integer.parseInt(ordListe[1]);
            total = int1 + total;
        }
            gennemsnit= total/7;
/*
            String linje2 = sc.nextLine();
            String[] ordListe2 = linje2.split(" ");
            int int2 = Integer.parseInt(ordListe2[1]);

            String linje3 = sc.nextLine();
            String[] ordListe3 = linje3.split(" ");
            int int3 = Integer.parseInt(ordListe3[1]);

            String linje4 = sc.nextLine();
            String[] ordListe4 = linje4.split(" ");
            int int4 = Integer.parseInt(ordListe[1]);

            String linje5 = sc.nextLine();
            String[] ordListe5 = linje5.split(" ");
            int int5 = Integer.parseInt(ordListe5[1]);

            String linje6 = sc.nextLine();
            String[] ordListe6 = linje6.split(" ");
            int int6 = Integer.parseInt(ordListe6[1]);

            String linje7 = sc.nextLine();
            String[] ordListe7 = linje7.split(" ");
            int int7 = Integer.parseInt(ordListe7[1]);

            int total = int1+int2+int3+int4+int5+int6+int7;
            int gennemsnit = total/7;*/
            System.out.println("gennemsnit temperaturen er " + gennemsnit);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
