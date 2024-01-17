import coll.linkedlist;

public class zigzagll {
    public static void main(String[] args) {
        linkedlist.head = new linkedlist.Node(1);
        linkedlist.addFirst(0);
        
        linkedlist.printHeadTail(linkedlist.head);
        linkedlist.addLast(2);
        linkedlist.printHeadTail(linkedlist.head);
        linkedlist.addLast(3);
        linkedlist.printHeadTail(linkedlist.head);
        linkedlist.addLast(4);
        linkedlist.printHeadTail(linkedlist.head);
        linkedlist.addLast(5);
        
        linkedlist.printLL(linkedlist.head);

        //findmid
        linkedlist.Node slow = linkedlist.head;
        linkedlist.Node fast = linkedlist.head;
        linkedlist.Node prev = null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        linkedlist.Node mid = slow;
        if(linkedlist.size(linkedlist.head)%2==0){
            prev.next = null;
        }else{
            return;
        }

        linkedlist.Node ll1 = linkedlist.head;
        linkedlist.Node ll2 = linkedlist.size(linkedlist.head)%2==0?mid.next:mid;

        linkedlist.Node headd = linkedlist.head;
        linkedlist.head = ll2;
        //System.out.println(linkedlist.head.data);
        linkedlist.reverseLL();

        linkedlist.printLL(ll1);
        linkedlist.printLL(linkedlist.head);



        //now zigzagging
        linkedlist.Node lt = ll1;
        linkedlist.Node rt = linkedlist.head;
        linkedlist.Node r =rt, l=lt;
        while(l!=null && r!=null){
            l = lt.next;
            r = rt.next;
            lt.next = rt;
            rt.next = l;

            if(l!=null && r==null){
                rt.next = l;
            }
            lt=l;
            rt=r;
        }
        
        linkedlist.printLL(ll1);
    }
}
