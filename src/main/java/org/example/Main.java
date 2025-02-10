package org.example;

import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        QueueArray shelter = new QueueArray(15);
        shelter.isEmpty();
        System.out.println("1 is dog. 0 is cat.");

        shelter.enQueue(0);
        shelter.enQueue(0);
        shelter.enQueue(0);
        shelter.enQueue(1);
        shelter.enQueue(0);
        shelter.enQueue(1);
        shelter.enQueue(0);
        shelter.enQueue(1);
        shelter.enQueue(1);
        shelter.enQueue(1);
        shelter.enQueue(1);
        shelter.enQueue(1);
        shelter.enQueue(0);
        shelter.getQueue();
        while(true) {
            System.out.println("\nWould you like to adopt a dog or a cat?");
            System.out.println("1. Dog\n2. Cat\n3. Oldest\n4. View animals \n5. Leave");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    shelter.adoptOldestDog();
                    break;
                case 2:
                    shelter.adoptOldestCat();
                    break;
                case 3:
                    shelter.deQueue();

                    break;
                case 4:
                    shelter.getQueue();
                    break;
                case 5:
                    System.out.println("Thank you, bye bye!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }


    }
}