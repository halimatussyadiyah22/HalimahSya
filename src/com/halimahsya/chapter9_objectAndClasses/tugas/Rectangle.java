package com.halimahsya.chapter9_objectAndClasses.tugas;

public class Rectangle {
    double width,height;

    Rectangle(){
        width = 1;
        height = 1;
    }
    Rectangle(double newWidth, double newHeight){
        width = newWidth;
        height = newHeight;
    }
    double getArea(){
        return width * height;
    }
    double getPerimeter(){
        return 2 * (width + height);
    }

}
