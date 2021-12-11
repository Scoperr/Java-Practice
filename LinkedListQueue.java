package sample.javaprograms;
import java.util.LinkedList;
import java.util.Queue;
public class LinkedListQueue {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        
        //To insert elements into Queue.
        //add() offer() for insert.
        //offer() returns true if element is inserted successfully and return false if element is not inserted.
        q.offer(1);
        q.offer(2);
        q.offer(3);
        
        //add() returns true if element is inserted successfully if not, it throws and EXCEPTION.
        q.add(4);
        
        System.out.println(q);
        
        //To remove elements from the queue.
        //poll() remove().
        //poll() returns null if queue is empty.
        //remove() throws exception if queue is empty.
        q.poll();
        System.out.println(q);
        
        q.remove(3);
        System.out.println(q);
        
        //To get head of the queue.
        //peek() element() - tells which element is going to pop next.
        //peek() returns null if queue is empty.
        //element() throws exception if queue is empty.
        System.out.println(q.peek());
        System.out.println(q.element());
    }
}
