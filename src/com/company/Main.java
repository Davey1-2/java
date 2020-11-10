package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10};
        int[] tasks = {10};
        int choose;
        int managment;
        String update;
        String create;

        int i;


        while (i < numbers.length){

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

                managment = sc.nextInt();

                if (managment == 1){
                        System.out.println("Enter the name of the new task");
                        create[i] = sc.nextLine();
                        i++;
                    }


                if (managment == 2){

                    System.out.println("Which task do you want to update?");
                    choose = sc.nextInt();
                    System.out.println("Enter your newest task");
                    update[choose] = sc.nextLine();

                    // jsem desperate nic nefunguje :(
                    
                }

            }
        }
    }
}
