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

    public void getQueue(){
        for (int i = beginningOfQueue; i <backOfQueue +1; i++){
            System.out.print(arr[i]);
            if (i != nItems -1){
                System.out.print(" <-> ");
            }
        }
    }



    public boolean isFull(){
        if (backOfQueue == arr.length - 1){
            return true;
        }else {
            return false;
        }
    }



    public boolean isEmpty(){
        if (nItems ==0){
            System.out.println("Empty");
            return true;
        }else {
            System.out.println("Not Empty");
            return false;
        }
    }



    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("full queue");
        } else if (isEmpty()){
            beginningOfQueue = 0;
            backOfQueue++;
            arr[backOfQueue] = value;
            System.out.println("Inserted " + value + " into the queue");
        } else{
            backOfQueue++;
            nItems++;
            arr[backOfQueue] = value;
            System.out.println("Inserted " + value + "into the queue");
        }
    }

    public int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return 0;
        }else{
            int result;
            return result = arr[beginningOfQueue];
        }

    }
}
