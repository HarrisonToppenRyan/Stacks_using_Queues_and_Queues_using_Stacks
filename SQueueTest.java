/* 
Author: Harrison Toppen
Description : Lab 6, CSCI 145
Date: March 9th, 2021
*/


public class SQueueTest {
    public static void main(String[] args) {
        SQueue q = new SQueue();
        q.add(3);
        q.add(6);
        q.add(9);
        q.remove();
        q.remove();
        q.remove();

        
        System.out.println(q.isEmpty());


        
    }
}
