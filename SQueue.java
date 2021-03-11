/* 
Author: Harrison Toppen
Description : Lab 6, CSCI 145
Date: March 9th, 2021
*/

/* 
Java Program: implement a queue using  
two stacks
*/

import java.util.*;

public class SQueue {
     // creating two  Queues for stack functions 
    static Stack<Integer> stack1 = new Stack<Integer>();  
    static Stack<Integer> stack2 = new Stack<Integer>();
    
    //add method with a parameter of x
    public void add(int x) {
        // while loop stating that while stack1 is empty, add stack1 popped to stack 2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        // push x onto stack is otherwise 
        stack1.push(x);
        // while loop stating that while stack1 is empty, add stack2 popped to stack1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }
    // remove method 
    public int remove() {
        // if stack1 is already emtpy, then infrom the user so and end the program
        if (stack1.isEmpty()) {
            System.out.println("Q is Empty");  
            System.exit(0); 
            
        }
        // x is the tope element of stack1 
        int x = stack1.peek();
        // remove from stack1 and return to user 
        stack1.pop();
        return x;
    }
    // peek method 
    public int peek() {
        // if stack1 is already emtpy, then infrom the user so and end the program
        if (stack1.isEmpty()) {
            System.out.println("Q is Empty");  
            System.exit(0); 
        }
        // see the top number from stack1 and return to user 
        int x = stack1.peek();
        return x;
    }

    public int size() {
        return stack1.size();
    }
    // if there are no elements in queue1
    public boolean isEmpty() {
        if (stack1.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
}
