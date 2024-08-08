package LeetCode;
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        this.next=null;
    }
    ListNode(int val) { 
        this.val = val; 
        this.next= null;
    }
    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    } 
    ListNode getNext(){
        return next;
    }
    

    public int getVal() {
        return val;
    }
}
public class Solution2095 {

    public ListNode deleteMiddle(ListNode head){
        ListNode preSlow=null, slow=head, fast=head; 

        if(head==null || head.next==null){
            return null;
        }

        while(fast!=null && fast.next!=null){
            preSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        preSlow.next = slow.next;
        
        return head;
    }
    
    
    
}
