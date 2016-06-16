/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node Reverse(Node head) {
    if(head == null || head.next == null)
        return head;
    Node current = head;
    Node next = null;
    Node reverse = null;
    while(current != null) {
        next = current.next;
        current.next = current.prev;
        current.prev = next;
        reverse = current;
        current = next;
    }
    return reverse;
}
