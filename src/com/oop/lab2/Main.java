package com.oop.lab2;

public class Main {

    public static void main(String[] args) {

        //task 1
        Box box1 = new Box(3.2, 2.1, 4.7);

        //task 3.1
        System.out.println("The area of box1 is: " + box1.area());
        System.out.println("The volume of box1 is: " + box1.volume());

        //task 2
        Queue q1 = new Queue(3);
        q1.push(4);
        q1.push(9);
        q1.push(5);
        q1.pop();
        System.out.println(q1.showQueue());

        //task 3.2
        Queue q2 = new Queue();
        q2.push(2);
        q2.push(1);
        q2.push(7);
        q2.pop();
        System.out.println(q2.showQueue());

        Queue q3 = new Queue();     // empty queue (unlimited maxSize)
        q3.isEmpty();

        Queue q4 = new Queue(4); // full queue (with maxSize)
        q4.push(4);
        q4.push(5);
        q4.push(1);
        q4.push(9);
        q4.isFull();

        Queue q5 = new Queue();
        q5.push(0);               // queue with no maxSize
        q5.push(1);
        q5.push(2);
        q5.push(3);
        q5.isFull();

        Queue q6 = new Queue(4);  // queue with maxSize of 4
        q6.push(1);
        q6.push(2);
        q6.push(3);
        q6.isFull();
    }
}
