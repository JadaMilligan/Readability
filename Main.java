package com.company;

import java.util.Scanner;

public class Main {
    // sept 16th lesson
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String testpassage;
        System.out.print("Enter Text: ");
        testpassage= read.nextLine();
        String passage;

        double letcount= 0;
        for (int i = 0; i < testpassage.length(); i++) {
            if (Character.isLetter(testpassage.charAt(i)))
                letcount++;
        }

        double wordcount= 0;

        char[] ch = new char[testpassage.length()];
        for (int i = 0; i < testpassage.length(); i++) {
            ch[i] = testpassage.charAt(i);
            if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
                wordcount++;
        }
        double punccount = 0;
            for (int i = 0; i < testpassage.length(); i++) {
                passage = "" + testpassage.charAt(i);
                if (passage.equals(".") || passage.equals("?") || passage.equals("!"))
                    punccount++;
            }

        double grade;
        double l;
        double s;
        l = (letcount/wordcount)*100;
        s = (punccount/wordcount)*100;
        grade = 0.0588 * l - 0.296 * s - 15.8;

        System.out.println(Math.round(letcount) + " letter(s)");
        System.out.println( Math.round(wordcount) + " word(s)");
        System.out.println(Math.round(punccount) + " sentence(s)");
        if (Math.round(grade) > 16)
            System.out.print("Grade 16+");
        else
            System.out.print("Grade " + Math.round(grade));
    }
}
