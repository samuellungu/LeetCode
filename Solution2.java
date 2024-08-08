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
public class Solution2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q=l2, current = dummyHead;  
        int carry = 0;

        //l1 = [2,4,3], l2 = [5,6,4]
        while(p!=null && q!=null){
            int x = (p!=null)? p.val: 0;
            int y = (q!=null)? q.val: 0;
            int sum = carry + x + y;
            carry = sum/10;

            current.next = new ListNode(sum%10);
            if(p!=null) p = p.next;
            if(q!=null) q = q.next;

            if(carry > 0){
                current.next = new ListNode(carry);
            }
        }   
        return dummyHead.next;        
    }

    public static ListNode addTwoNumbersAcceptedSolution(ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode a = l1, b = l2, current = dummyHead;
        int carry = 0;

        while(a!=null || b!=null || carry!=0){
            
            if(a!=null){
                carry += a.val;
                a = a.next;
            }

            if(b!=null){
                carry += b.val;
                b = b.next;
            }
            current.next = new ListNode(carry%10);
            current = current.next;
            carry = carry/10;
        }
        
        return dummyHead.next;
    }

    public static void main(String [] args){
        ListNode l1 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        ListNode l13 = new ListNode(3);
        l1.next = l12;
        l12.next = l13;

        ListNode l2 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        ListNode l23 = new ListNode(4);
        //l1 = [2,4,3], l2 = [5,6,4]
        
        
       
        l2.next = l22;
        l22.next = l23;

        ListNode result = addTwoNumbers(l1,l1);

        while(result!=null){
            System.out.println(result.val+" ");
            result = result.next;
        }

        
    }
}
