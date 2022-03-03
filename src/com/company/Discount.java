package com.company;

public class Discount {
    public static void main(String[] args) {

        // write your code here
        boolean seniorCitizen = true;
        boolean dog = false;
        boolean student = false;
        System.out.println("On this bus you get a discount: " + (seniorCitizen || dog || student ));


        int nonFiction = 4;
        int fiction = 2;
        System.out.println("In this bookshop I get a discount: " + (nonFiction >= 2 && fiction > 0));

        int nonAlcoholic = 1;
        int alcoholic = 0;
        System.out.println("In this shop I get non alcoholic drink: " + (nonAlcoholic >= 1 && alcoholic ==0) );










    }
}
