import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
    val = x;
    next = null;
    }
}
// No dups solution 
public class LinkedList_cycle {
    public static ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }
        else if(head.next==null){
            return null;
        }
        List<Integer> l=new ArrayList<Integer>();
        int i;
        ListNode temp=head;
        while(!l.contains(temp.val)){
            l.add(temp.val);
            temp=temp.next;
            if(temp==null){
                return null;
            }
        }
        
        return temp;
    }
}
