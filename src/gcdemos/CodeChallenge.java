package gcdemos;

import java.util.Scanner;

public class CodeChallenge {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        //use switch case

        //Coffee, Latte, Mocha

        //Bonus: continue prompting user until "shut down"

        //your code goes here...

        

        

    }

    private static void serveCoffee() {

        System.out.println(getCoffee());

    }

    private static void serveLatte() {

        System.out.println(getEspresso() + " with " + getMilk());

    }

    private static void serveMocha() {

        System.out.println(getEspresso() + " with " + getMilk() + " and " + getChocolate());

    }

    private static String getCoffee() {

        return "Coffee";

    }

    private static String getEspresso() {

        return "Espresso";

    }

    private static String getMilk() {

        return "steamed milk";

    }

    private static String getChocolate() {

        return "chocolate sauce";

    }

}

