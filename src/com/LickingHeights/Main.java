package com.LickingHeights;

import java.util.Scanner;

public class MorseCode {
    public static final String[] morseCode =
            {"*-", "-***", "-*-*", "-**", "*", "**-*", "--*",

                    "****", "**", "*---", "-*-*", "*-**", "--", "-*", "---",

                    "*--*", "--*-", "*-*", "***", "-", "**-", "***-", "*--",

                    "-**-", "-*--", "--**", "*----", "**---", "***--", "****-",

                    "*****", "-****", "--***", "---**", "----*", "-----"};
    public static final String[] alphabet =
            {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                    "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U",
                    "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6",
                    "7", "8", "9", "0"};


    static Scanner keyboard = new Scanner(System.in);
    static boolean input = true;

    public static void main(String[] args){

        String codeTranslation;

        while(input){
                System.out.print("This is a morse code and english translator, type \"morse\" to do morse code" +
                        "to English or type \"English\" to do English to morse code");
                codeTranslation= (keyboard.next());
    }
    keyboard.close();
        System.out.println("Thank you for using the morse code and English translator");
        System.exit(0);

public static String morseToAlphabet(String[]codeTranslation){

            if (codeTranslation = \"morse")
        }

public static String alphabetToMorse(String[]codeTranslation){
}

public static String addColon(String codeTranslation){
    String fake;
    for(int i = 0;i<codeTranslation.length();i++){
      fake += codeTranslation.charAt(i)+":";
      return fake; }


 public static String replaceSpaceInMorse(String codeTranslation){
        }
public static String CreateMessageArray(String codeTranslation){
        }
public static void playAgain(){
        }
public static String printInitial (String word){

        }

