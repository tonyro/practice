package algorithms;

import algorithms.graphs.MyQueue;

public class TestMain {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("four");
        queue.add("five");

        System.out.println((String)queue.get());
        System.out.println((String)queue.get());
        System.out.println((String)queue.get());
        System.out.println((String)queue.get());
        System.out.println((String)queue.get());
    }
}
