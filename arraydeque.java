package sample.javaprograms;
import java.util.ArrayDeque;
public class arraydeque {
    public static void main(String[] args){
        //In ArrayDeque elements can be inserted/removed/peek at First and Last.
        //ArrayDeque functions
        //add(), addAll(), addFirst(), addLast()
        //offer(), offerFirst(), offerLast()
        //getFirst(), getLast()
        //poll(), pollFirst(), pollLast()
        //peek(), peekFirst(), peekLast()
        //remove(), removeFirst(), removeLast(), removeAll(), removeFirstOccurrence(), removeLastOccurence()
        //ArrayDeque creation.
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        //Adding elements to ArrayDeque.
        ad.offer(21);
        ad.offerFirst(42);
        ad.offerLast(87);
        ad.offerLast(790);
        ad.offerLast(899);
        ad.offerFirst(42);
        ad.offerFirst(42);
        ad.offerFirst(42);
        ad.offerLast(8713);
        System.out.println(ad);
        
        //Removing elements.
        System.out.println(ad.pollFirst());
        System.out.println(ad.pollLast());
        System.out.println(ad.poll());
        System.out.println(ad.removeFirstOccurrence(42));
        System.out.println(ad);
        
        //peek()
        //peekFirst()
        //peekLast()
        //AND SO ONNNNNNNNNNNNN..................................
    }
}
