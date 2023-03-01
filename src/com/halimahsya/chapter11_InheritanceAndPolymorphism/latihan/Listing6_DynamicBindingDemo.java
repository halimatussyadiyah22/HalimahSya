package com.halimahsya.chapter11_InheritanceAndPolymorphism.latihan;

public class Listing6_DynamicBindingDemo {
    public static void main(String[] args) {
        m(new GraduateStudent());
        m(new Student());
        m(new Person());
        m(new Object());
    }
    public static void m(Object x){
        System.out.println(x.toString());
    }
}
class GraduateStudent extends Student {
}
class  Student extends Person{
    @Override
    public String toString(){
        return  " murid ";
    }
}
class Person extends Object{
    @Override
    public String toString(){
        return " orang ";
    }
}
