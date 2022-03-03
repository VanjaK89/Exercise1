package com.company;

public class Rectangle {
    public static void main(String[] args) {
        // write your code here
        //declare variables
        int width = 5;
        int length = 4;
        int circumferenceOfRectangle = 2 * (width) + 2 * (length);
        System.out.println("Circumference of rectangle is: " + circumferenceOfRectangle );
        int areaOfRectangle = length * width;
        System.out.println("Area of rectangle is: " + areaOfRectangle);
        System.out.println(calculateCircumference ( width, length));
        System.out.println(calculateArea (width, length));
    }
        public static int calculateCircumference( int width, int length ){
         int circumference;
         circumference = 2 * (width) + 2 * (length);
         return circumference;}
         public static int calculateArea ( int width, int length ){
            int area;
             area = length * width;
             return area;
            }



}
