package com.halimahsya.chapter10_ObjectOrientedThinking.latihan;

import com.halimahsya.chapter3.latihan.BMI;

public class Listing3_UseBMIClass {
    public static void main(String[] args) {
         Listing4_BMI bmi1 = new Listing4_BMI(" kim yang ", 18, 145,70);
        System.out.println(" BMI untuk " + bmi1.getName() + "adalah " +
                bmi1.getBMI() + " " + bmi1.getStatus());

        Listing4_BMI bmi2 = new Listing4_BMI("Susan king " , 215,70);
        System.out.println(" BMI untuk " +  bmi2.getName() + "adalah " +
                bmi2.getBMI() + " " + bmi2.getStatus());
    }
}
