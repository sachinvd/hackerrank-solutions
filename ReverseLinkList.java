/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) {
    if(head == null)
        return head;
    Node rev = null;
    Node current = head;
    Node next = null;
    while(current != null) {
        next = current.next;
        current.next = rev;
        rev = current;
        current = next;
    }
    
    return rev;
}
