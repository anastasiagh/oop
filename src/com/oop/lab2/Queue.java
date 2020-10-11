package com.oop.lab2;

import java.util.ArrayList;

public class Queue {
    ArrayList<Integer> obj;
    int size;
    int maxSize;

    //task 2
    public Queue(){
        obj = new ArrayList<Integer>();
        maxSize = 0;
        size = 0;
    }

    public Queue(int m){
        maxSize = m;
        obj = new ArrayList<Integer>();
        size = 0;
    }

    public void push(int value) {
        if (this.maxSize > this.size|| this.maxSize == 0){
            obj.add(value);
            size += 1;
        }
        else {
            System.out.println("The queue is full");
        }
    }

    public void pop() {
        if (this.size == 0){
            System.out.println("The queue is empty");
        }
        else {
            obj.remove(0);
            size -= 1;
        }
    }

    //task 3
    public void isEmpty() {
        if (size == 0) {
            System.out.println("The queue is empty");
        }
    }

    public void isFull() {
        if (size == maxSize) {
            System.out.println("The queue is full");
        }
        else if (maxSize == 0){
            System.out.println("The queue is never full");
        }
        else {
            System.out.println("Number of elements available: " + (maxSize-size));
        }
    }

    public ArrayList<Integer> showQueue() {
        return obj;
    }
}
