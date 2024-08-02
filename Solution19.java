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
}
public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        return head;
    }

    public static int ListSize(ListNode head){
        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;
        int size = 0;

        while(current != null){
            current = current.next;
            size++;
        }
        return size;
    }
    public static void main(String [] args){
        ListNode l1 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        ListNode l13 = new ListNode(3);
        l1.next = l12;
        l12.next = l13;
        System.out.println(ListSize(l13));
    }
}

