//package com.halimahsya.chapter13_AbstactClassesAndInterfaces.latihan;
//
//public class Listing7_TestEdible {
//    public static void main(String[] args) {
//        Object[] objects = {new Tiger(), new Chicken(), new Apple()};
//        for (int i = 0; i < objects.length; i++) {
//            if (objects[i] instanceof Edible)
//                System.out.println(((Edible) objects[i]).howToEat());
//            if (objects[i] instanceof Animal) {
//                System.out.println(((Animal) objects[i]).sound());
//            }
//        }
//    }
//}
//abstract class Animal{
//    public abstract String sound();
//}
//class Chicken extends Animal implements Edible{
//    @Override
//    public String howToEat(){
//        return " Chicken : Fry it ";
//    }
//    @Override
//    public String sound(){
//        return "Chicken : cock-a-doodle-doo";
//    }
//}
//class Tiger extends Animal{
//    @Override
//    public String sound(){
//        return "tiger: RROOAARR ";
//    }
//}
//abstract class Fruit implements Edible {
//
//}
//class Apple extends Fruit{
//    @Override
//    public String  howToEat(){
//        return "apple : make apple cider ";
//    }
//}
//class Orange extends Fruit{
//    @Override
//    public String howToEat(){
//        return  "Orange : make orange juice ";
//    }
//}
