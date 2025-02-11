package org.example;

public class QueueArray {
    public int[] arr;
    private int backOfQueue;
    private int nItems;
    private int beginningOfQueue;

    public QueueArray(int size){
        this.arr = new int[size];
        this.backOfQueue = -1;
        this.beginningOfQueue = -1;
        this.nItems = 0;
        System.out.println("Queue created with size: " + size);

    }


//    prints queue
    public void getQueue(){
        for (int i = beginningOfQueue; i <backOfQueue +1; i++){
            System.out.print(arr[i]);
            if (i != backOfQueue){
                System.out.print(" <-> ");
            }
        }
//        System.out.println("nitems: " + nItems);
    }



//checks if queue is full
    public boolean isFull(){
        if (backOfQueue == arr.length - 1){
            return true;
        }else {
            return false;
        }
    }


//checks if empty
    public boolean isEmpty(){
        if (nItems ==0){
            System.out.println("Empty");
            return true;
        }else {
            System.out.println("Not Empty");
            return false;
        }
    }


// adds to the queue
    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("full queue");
        } else if (isEmpty()){
            beginningOfQueue = 0;
        }
        backOfQueue++;
        arr[backOfQueue] = value;
        nItems++;
        System.out.println("Inserted " + value + " into the queue");
    }
// remove from the queue
    public void deQueue() {
        int result = 0;
        if (isEmpty()) {
            System.out.println("The Queue is empty");
        } else {
            result = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > backOfQueue) {
                beginningOfQueue = backOfQueue = -1;
            }

            nItems--;
            System.out.println("You have adopted our oldest animal");
        }
    }
//adopt the oldest dog(1) from the queue
    public void adoptOldestDog(){
        int result = 0;

        if (isEmpty()) {
            System.out.println("The Queue is empty");

        } else {
           for(int i =beginningOfQueue; i<=backOfQueue;i++){
               if(arr[i]==1){
                   result =arr[i];
                   for(int X =i; X<backOfQueue; X++){
                       arr[X] = arr[X +1];
                   }
                   backOfQueue--;
                   nItems--;
                   System.out.println("You have adopted the oldest dog");
                   break;

               }
           }

        }

    }
//adopt the oldest cat(0) from the queue
    public void adoptOldestCat(){
        int result = 0;

        if (isEmpty()) {
            System.out.println("The Queue is empty");

        } else {
            for(int i =beginningOfQueue; i<=backOfQueue;i++){
                if(arr[i]==0){
                    result =arr[i];
                    for(int X =i; X<backOfQueue; X++){
                        arr[X] = arr[X +1];
                    }
                    backOfQueue--;
                    nItems--;
                    System.out.println("You have adopted our oldest cat");
                    break;

                }
            }

        }

    }
}
