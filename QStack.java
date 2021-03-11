/* 
Author: Harrison Toppen
Description : Lab 6, CSCI 145
Date: March 9th, 2021
*/



/* 
Java Program: implement a stack using  
two queue 
*/


// java ultilities 
import java.util.*;

public class QStack {
    // creating two  Queues for stack functions 
    static Queue<Integer> queue1 = new LinkedList<Integer>(); 
    static Queue<Integer> queue2 = new LinkedList<Integer>(); 
    
    // current size of the queues 
    int curr_size = 0;
    //push method with a parameter of x
    public void push(int x) {
        // increase the current size and add int x to queue 1
        curr_size++;
        queue2.add(x);
        // while loop stating that while queue 1 is not empty, add the peek of queue 1 to queue 2, then remove queue 1
        while (!queue1.isEmpty()) {
            queue2.add(queue1.peek());
            queue1.remove();
        }
        // swap the names of the two queues 
        Queue<Integer> q = queue1;
        queue1 = queue2;
        queue2 = q;
    }
    // pop method 
    public void pop() {
        // if there are no elements in queue1
       if (queue1.isEmpty()) {
            return; 
       }
       queue1.remove();
       curr_size--;  

    }
    // peek method 
    public int peek() {
        // if there are no elements in queue1
        if (queue1.isEmpty()) {
            return -1;
        }
        return queue1.peek();
    }
    // size method 
    public int size() {
        // deterime the size count of the queue
        return curr_size;
    }
    // if there are no elements in queue1
    public boolean isEmpty() {
        if (queue1.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
}
