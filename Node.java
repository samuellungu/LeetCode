package LeetCode;


public class Node {
    int data;
    Node next;

    public Node(){
        this.next = null;
    }

    public Node(int data){
        this.data = data;
        this.next = null;
    }
    public int getData(){
        return data;
    }
}

class LinkedList {
    Node node1 = new Node();
    Node node2 = new Node();
    Node node3 = new Node();
    // set 10 as the value for 1st node
    public LinkedList(){
        node1.data=10;
        // set node2 as the next node for node1
        node1.next = node2;  
        // set 20 as the value for 2nd node
        node2.data = 20;  
        // set node3 as the next node for node2
        node2.next = node3;  
        // set 30 as the value for 3rd node
        node3.data = 30;  
        // this is not required. By default next of a node is NULL
        node3.next = null; 
  
  }
}
