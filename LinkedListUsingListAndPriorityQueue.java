package sample.javaprograms;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;
public class LinkedListUsingListAndPriorityQueue {
    public static void main(String[] args){
        //LinkedList can be created using List. By using the methods of ArrayList such as get() add() set() remove can be implemented.
        //LinkedList<Interger> l = new List<>(); which is same as ArrayList.
    
        //PriorityQueue 
        //creation of priority queue.
        Queue<Integer> pq = new PriorityQueue<>();
    
        //PriorityQueue usually stores elements in the MIN HEAP order.
        //Adding elements to priority queue.
        pq.offer(91);
        pq.offer(22);
        pq.offer(36);   
        System.out.println(pq);
        
        //To delete elements.
        pq.poll();
        System.out.println(pq);
        //To know the head of PriorityQueue.
        System.out.println(pq.peek());
        
        //To store elements in MAX HEAP order we use comparator.reverseOrder(), PriorityQueue has a constructor so the comparator function can be sent.
        Queue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());
        p.offer(20);
        p.offer(91);
        p.offer(72);
        
        System.out.println(p);
        
        System.out.println(p.peek()+"\n"+p.poll()+"\n"+p);
    }
}
