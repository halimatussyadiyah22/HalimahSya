package com.halimahsya.chapter6_methods.ujian;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class ujian3 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String in = null,out= null,finalResult = null,number = null;
        int menu = pilihmenu();

        switch (menu){
            case 1 -> {
                in = "binnary";
                out = "decimal";

                number = inputNumber(in,out);
                boolean result  = checkInput(number,in);
            }
            case 2 ->{
                in= "binnary";
                out = "octal";

                number = inputNumber(in,out);

                boolean result = checkInput(number,in);

                finalResult = convertNumber(result,number,in,out);
            }
            case 3 -> {
                in = " binnary";
                out = "hexadecimal";

                number = inputNumber(in,out);

                boolean result = checkInput(number,in);
                finalResult = convertNumber(result,number,in,out);
            }
            case 4 -> {
                in = " decimal";
                out = "binnary";

                number = inputNumber(in,out);
                boolean result = checkInput(number,in);
                finalResult = convertNumber(result,number,in,out);
            }
            case 5 -> {
                in = " decimal";
                out = "octal";

                number = inputNumber(in,out);
                boolean result = checkInput(number,in);
                finalResult = convertNumber(result,number,in,out);
            }
            case 6 -> {
                in = "  decimal";
                out = "hexadecimal";

                number = inputNumber(in,out);
                boolean result = checkInput(number,in);
                finalResult = convertNumber(result,number,in,out);
            }
            case 7 -> {
                in = " hexadecimal";
                out = "binnary";

                number = inputNumber(in,out);
                boolean result = checkInput(number,in);
                finalResult = convertNumber(result,number,in,out);
            }
            case 8 -> {
                in = " hexadecimal";
                out = "hexadecimal";

                number = inputNumber(in,out);
                boolean result = checkInput(number,in);
                finalResult = convertNumber(result,number,in,out);
            }
            case 9 -> {
                in = " hexadecimal";
                out = "decimal";

                number = inputNumber(in,out);
                boolean result = checkInput(number,in);
                finalResult = convertNumber(result,number,in,out);
            }
            case 10 -> {
                in = " octal ";
                out = "binnary";

                number = inputNumber(in,out);
                boolean result = checkInput(number,in);
                finalResult = convertNumber(result,number,in,out);
            }
            case 11 -> {
                in = " octal";
                out = "decimal";

                number = inputNumber(in,out);
                boolean result = checkInput(number,in);
                finalResult = convertNumber(result,number,in,out);
            }
            case 12 -> {
                in = " octal";
                out = "hexadecimal";

                number = inputNumber(in,out);
                boolean result = checkInput(number,in);
                finalResult = convertNumber(result,number,in,out);
            }

        }
        assert finalResult != null;
        if (finalResult.equals("error")){
            System.out.println("input yang anda masukan salah!");
        }else {
            System.out.println(number.toUpperCase()+ " in" + in + "is " +
                    finalResult.toUpperCase() + " in" + out);
        }

    }
    private static int pilihmenu(){
        System.out.println("converter number syatem");
        System.out.println("======= MENU =======");
        System.out.println("1. Binnary to decimal ");
        System.out.println("1. Binnary to octal ");
        System.out.println("1. Binnary to hexadecimal ");
        System.out.println("1. Decimal to binnary ");
        System.out.println("1. Decimal to octal ");
        System.out.println("1. Decimal to hexadecimal ");
        System.out.println("1. hexadecimal to binnary ");
        System.out.println("1. hexadecimal to octal ");
        System.out.println("1. hexadecimal to decimal ");
        System.out.println("1. octal to binnary ");
        System.out.println("1. octal to decimal ");
        System.out.println("1. octal to hexadecimal ");

        System.out.print("chose number of menu : ");
        return input.nextInt();
    }
    private static String inputNumber(String in,String out){
        String number;
        System.out.println(in + "-> " + out);
        System.out.println("input " + in + " number : ");
        number = input.next();
        return number;
    }
    private static String convertNumber(boolean result,String number,String in, String out) {
        String finalresult;
        if (result){
            if (in.equals("binnary") && out.equals("decimal")){
                finalresult = String.valueOf(binnaryToDecimal(number));
            }else if (in.equals("binnary") && out.equals("octal")) {
                finalresult = binnaryToOctal(number);
            }else if (in.equals("binnary") && out.equals("hexadecimal")) {
                finalresult = binnaryToOctal(number);
            }else if (in.equals("decimal") && out.equals("binnary")) {
                finalresult = binnaryToOctal(number);
            }else if (in.equals("decimal") && out.equals("octal")) {
                finalresult = binnaryToOctal(number);
            }else if (in.equals("decimal") && out.equals("hexadecimal")) {
                finalresult = binnaryToOctal(number);
            }else if (in.equals("hexadecimal") && out.equals("binnary")) {
                finalresult = binnaryToOctal(number);
            }else if (in.equals("hexadecimal") && out.equals("octal")) {
                finalresult = binnaryToOctal(number);
            }else if (in.equals("hexadecimal") && out.equals("decimal")) {
                finalresult = binnaryToOctal(number);
            }else if (in.equals("octal") && out.equals("binnary")) {
                finalresult = binnaryToOctal(number);
            }else if (in.equals("octal") && out.equals("decimal")) {
                finalresult = binnaryToOctal(number);
            }else if (in.equals("octal") && out.equals("hexadecima")) {
                finalresult = binnaryToOctal(number);
            }else {
                finalresult = "error";
            }
        }else {
            finalresult = "error";
        }
        return finalresult;
    }
    private static boolean checkInput(String number,String check){
        switch (check){
            case "binnary" ->{
                return number.matches("[01]+");
            }
            case "decimal" ->{
                return number.matches("-?\\d+(\\.\\d+)?");
            }
            case "hexadecimal" ->{
                return number.matches("^[0-9a-fA-F]+$");
            }
            case "octal" ->{
                return number.matches("^[0-7]+$");
            }
            default -> throw  new IllegalStateException("unexpected value: " + check );
        }
    }
    private static int binnaryToDecimal(String number){
        return Integer.parseInt(String.valueOf(number),2);
    }
    private static String binnaryToOctal(String number){
        int decimal = Integer.parseInt(String.valueOf(number),2);
        return Integer.toOctalString(decimal);
    }
    private static String binnaryToHexadecimal(String number){
        int decimal = Integer.parseInt(String.valueOf(number),2);
        return Integer.toHexString(decimal);
    }
    private  static  String decimalToBinnary(String number){
        int decimal = Integer.parseInt(number);
        StringBuilder binnary = new StringBuilder();
        while (decimal >0){
            long rem = decimal % 2;
            binnary.insert(0,rem);
            decimal = decimal/2;
        }
        return binnary.toString();
    }
    private static String decimalToOctal(String number){
        int decimal = Integer.parseInt(number);
        return Integer.toOctalString(decimal);
    }
    private static String hexadecimalToBinnary(String number){
        number = number.toUpperCase();
        StringBuilder binnary = new StringBuilder();
        for (int i = 0; i < number.length(); i++){
            char c = number.charAt(i);
            switch (c){
                case '0' -> binnary.append("0000");
                case '1' -> binnary.append("0001");
                case '2' -> binnary.append("0010");
                case '3' -> binnary.append("0011");
                case '4' -> binnary.append("0100");
                case '5' -> binnary.append("0101");
                case '6' -> binnary.append("0110");
                case '7' -> binnary.append("0111");
                case '8' -> binnary.append("1000");
                case '9' -> binnary.append("1001");
                case 'A' -> binnary.append("1010");
                case 'B' -> binnary.append("1011");
                case 'C' -> binnary.append("1100");
                case 'D' -> binnary.append("1101");
                case 'E' -> binnary.append("1110");
                case 'F' -> binnary.append("1111");
            }
        }
        return String.valueOf(binnary);
    }
    private static  String hexadecimalToOctal(String number){
        int decimal =0;
        number = number.toUpperCase();
        for (int i = 0; i < number.length(); i++){
            char c = number.charAt(i);
            int digit;
            if (c >= '0' && c <= '9'){
                digit = c - '0';
            } else if (c >= 'A' && c <= 'F') {
                digit = c - 'A' +10;
            }else {
                throw  new IllegalArgumentException(" invalid hexadecimal digit : " + c);
            }
            decimal += digit * Math.pow(16, number.length()-i -1);
        }
        StringBuilder octal = new StringBuilder();
        while (decimal >0){
            octal.insert(0,(decimal & 7));
            decimal = decimal >> 3;
        }
        return octal.toString();
    }
    private static String hexadecimalToDecimal(String number){
        number = number.toUpperCase();
        int decimal = 0;
        for (int i = 0; i < number.length(); i++){
            char c = number.charAt(i);
            int digit;
            if (c >= '0' && c <= '9'){
                digit = c - '0';
            } else if (c >= 'A' && c <= 'F') {
                digit = c - 'A' +10;
            }else {
                throw  new IllegalArgumentException(" invalid hexadecimal digit : " + c);
            }
            decimal += digit * Math.pow(16, number.length()-i -1);
        }
        return String.valueOf(decimal);
        }
        private static String octalToBinnary(String number){
        StringBuilder binnary = new StringBuilder();
        for (int i = 0; i < number.length(); i++){
            int digit = number.charAt(i)- '0';
            StringBuilder binPart = new StringBuilder();
            for (int j = 0; j < 3; j++){
                binPart.insert(0,(digit & 1));
                digit = digit >> 1;
            }
            binnary.append(binPart);
        }
        return binnary.toString();
        }
        private  static String octalToDecimal(String number){
        StringBuilder decimal = new StringBuilder();
        for (int i = 0; i < number.length(); i++){
            char c = number.charAt(i);
            int digit = c - '0';
            decimal.append(digit * Math.pow(8,number.length()-i-1));
        }
        return  decimal.toString();
        }
        private static String octalToHexadecimal(String number){
        int decimal =0;
        for (int i = 0; i < number.length(); i++){
            char c = number.charAt(i);
            int digit = c - '0';
            decimal += digit * Math.pow(8, number.length()-i-1);
        }
        StringBuilder hex = new StringBuilder();
        char[] hexChars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while (decimal >0){
            long remainder = decimal % 16;
            hex.insert(0, hexChars[(int) remainder]);
            decimal = decimal/16;
        }
        return hex.toString();
        }
    }
