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

public class Solution876 {
    public ListNode middleNode(ListNode head) {                
        ListNode slow=head, fast=head;        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = null;
        return head;
        
    }
}
