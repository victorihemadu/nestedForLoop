package personalClass;

import java.util.Scanner;


public class Class1 {

    /*
    public void anyMethod(){
        System.out.println("First method");
    }

    public String anyMethod1() {
        return "Benjamin";
    }

    public void anyMethod2() {
        System.out.println("Tester");
    }

    public int anyMethod3(){
        return 27;
    }

     */

    public static void main(String[] args) {

        /*

        System.out.println(names);
        System.out.println(43&19);

        //use scanner to collect info from a user

        String name = "Paul";

        String name1 = new String("King");

        Scanner info = new Scanner(System.in);

        System.out.print("please enter your name:");

        String name2  = info.nextLine();

        System.out.print("please enter your age:");

        int age = info.nextInt();

        System.out.println("my name is " + name + " and I am " + age + " years old");

        */

        /// /// Java Day 2 14/01/2025

        /*
        Scanner info = new Scanner(System.in); //used to collect input from a user.
        System.out.println("please enter your name:");

        String name = info.nextLine();

        System.out.print("please enter your age:");

        int age = info.nextInt();

        //System.out.println("my name is " + name + " and I am " + age + " years old");

        System.out.println(STR."my name is \{name} and I am \{age} years old");
        */

        //Loop Class exercise.
        /*
        # # # #
        # # # #
        # # # #
        # # # #

        for(int i=1; i<5; i++) {
            for (int j=0; j<4;  j++) {
                System.out.print("# ");
            }
            System.out.println(" ");
        }

        */





        //#
        //# #
        //# # #
        //# # # #


/*
        for(int i=1; i<5; i++) {
            for (int j=0; j<i;  j++) {
                System.out.print("# ");
            }
            System.out.println("");
        }
        */






            //# # # #
            //# # #
           // # #
            //#

        /*
             for(int i=0; i<5; i++) {
                for (int j=4; j>i;  j--) {
                    System.out.print("# ");
            }
            System.out.println("");
        }
             */



            //# # # #
           // #     #
            //#     #
            //# # # #

        /*
        for (int i = 4; i > 0; i--) {
            for (int j = i; j % i == 1; j--) {
                System.out.print("# ");
            }
        }
        */

        //System.out.println("#");

        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Please enter a number between 25 and 35: ");
            number = scanner.nextInt();

            if (number <=24 || number > 35) {
                System.out.println("invalid input! Number must be between 25 and 35: ");
            }
        } while (number <= 24 || number > 35 );

        System.out.println("Thank you for typing number: " + number);
        scanner.close();

    }
}
