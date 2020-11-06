package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("--------------------------------------------------");
            System.out.println("You can add up to 10 tasks");
            System.out.println("You currently have " + numbers[i] + "/10");
            System.out.println("--------------------------------------------------");
            System.out.println("1) Manage tasks");
            System.out.println("2) Exit");

            int option = sc.nextInt();

            if (option == 1) {
                System.out.println("--------------------------------------------------");
                System.out.println("Tasks managment");
                System.out.println("--------------------------------------------------");
                System.out.println("1) Create a new task");
                System.out.println("2) Update a task");
                System.out.println("3) Destroy task");
                System.out.println("4) Back to main menu");

                int managment = sc.nextInt();

                if (managment == 1){
                    String create = sc.nextLine();
                }

                if (managment == 2){

                }


                
            }

            else {
                break;
            }


        }

    }
}
