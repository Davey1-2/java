package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};
        int[] yes = new int[10];
        String[] tasks = new String[11];

        int i = 0;


        while (i <= numbers.length){

            int choose;
            int managment;
            int a = 0;


            String create = new String();




            System.out.println("--------------------------------------------------");
                System.out.println("You can add up to 10 tasks");
                System.out.println("You currently have " + numbers[i] + "/10");
                System.out.println("null means there is no assigned task");
                System.out.println("--------------------------------------------------");
                System.out.println("1) Manage tasks");
                System.out.println("2) Exit");

                int option = sc.nextInt();
                sc.nextLine();

                if (option == 1) {
                    System.out.println("--------------------------------------------------");
                    System.out.println("Tasks managment");
                    System.out.println("--------------------------------------------------");
                    System.out.println("1) Create a new task");
                    System.out.println("2) Update a task");
                    System.out.println("3) Destroy task");
                    System.out.println("4) Back to main menu");

                    managment = sc.nextInt();
                    sc.nextLine();

                    if (managment == 1) {
                        System.out.println("Enter your task:");
                        create = sc.nextLine();
                        tasks[i] = create;
                        System.out.println("Task created");
                        i++;
                        System.out.println("--------------------------------------------------");
                    }


                    if (managment == 2) {
                        System.out.println("Enter the number of task you want to update:");
                        choose = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Update your task");
                        tasks[choose] = sc.nextLine();
                        System.out.println("Task updated");
                        System.out.println("--------------------------------------------------");


                    }

                    if (managment == 3){
                        System.out.println("Enter the number of task you want to destroy:");
                        choose = sc.nextInt();
                        tasks[choose] = null;
                        System.out.println("Task destroyed");
                        System.out.println("--------------------------------------------------");
                        i--;

                        for (int j = 0; j < i + 1 ; j++) {
                            tasks[choose] = tasks[i];
                        }
                    }


                    if (managment == 4){
                        break;
                    }

                    for (String taskSout : tasks){
                        System.out.println("#" + a + " = " + taskSout);
                        a++;
                    }


                }
                else {
                    break;
                }
        }

    }
}

