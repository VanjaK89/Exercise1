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
        System.out.println(discount(fiction, nonFiction));
        System.out.println(discountBus(seniorCitizen, dog, student));
        System.out.println(discountAlcohol( nonAlcoholic, alcoholic));
    }

    public static boolean discount (int fiction, int nonFiction){

        return nonFiction >= 2 && fiction > 0;}

    public static boolean discountBus (boolean seniorCitizen, boolean dog, boolean student)
    {
        return seniorCitizen || dog || student;
    }
    public static boolean discountAlcohol (int nonAlcoholic, int alcoholic){
        return nonAlcoholic >= 1 && alcoholic ==0;
    }


}
