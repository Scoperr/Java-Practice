import coll.linkedlist;
public class detectcycleLL {
    public static void main(String[] args) {
        linkedlist.head = new linkedlist.Node(1);
        //update tail
        linkedlist.printHeadTail(linkedlist.head);
        linkedlist.addLast(2);
        
        //update tail
        linkedlist.printHeadTail(linkedlist.head);
        linkedlist.addFirst(0);
        linkedlist.addFirst(3);
        linkedlist.printHeadTail(linkedlist.head);
        //linkedlist.printLL(linkedlist.head);
        linkedlist.tail.next = linkedlist.head;
        
        //now loop exits in the ll
        linkedlist.Node slow = linkedlist.head;
        linkedlist.Node fast = linkedlist.head;
        //detecting the loop
        linkedlist.Node prev=null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                System.out.println("A Cycle is detected in linkedlist");
                break;
            }
        }


        //now lets remove the detected cycle
        if(slow==linkedlist.head){
            prev.next = null;
        }else{
            slow.next = null;
        }
        linkedlist.printLL(linkedlist.head);
    }
}
