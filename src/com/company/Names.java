package com.company;

public class Names {

    public static void main(String[] args) {
        // write your code here

        String name = "Jane";
        String surname = "Doe";
        System.out.println("The full name is " + name + " " + surname + ".");
        //now we make a method from the first example
        System.out.println("method:" + makeFullName(name, surname));
        System.out.println(makeFullName(name, surname));
        //entweder with method oder ohne, beide zeigen namen
    }

    public static String makeFullName(String name, String surname){
        return   name + " " + surname ;
}


}
