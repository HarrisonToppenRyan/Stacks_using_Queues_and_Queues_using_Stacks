/* 
Author: Harrison Toppen
Description : Lab 6, CSCI 145
Date: March 9th, 2021
*/


import java.util.*;

public class QStackTest {
    public static void main(String[] args) {
        QStack s = new QStack();
        s.push(3);
        s.push(6);
        s.push(9);
        s.pop();
        s.isEmpty();
        


        System.out.println("current size: " + s.size()); 
        System.out.println(s.peek()); 
        System.out.println(s.isEmpty());
    }

}
