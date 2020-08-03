/**
Java program to create a linked list
*/
public class createList  
{   
  public static class Node  
  {  
    int data;  
    Node next;  
  } 
  public static Node head = null;  
  public static Node tref = null;
 
  /* Function to add a node at the beginning of Linked List */
  public static void push(int new_data)  
  {  
    Node new_node = new Node();  
    new_node.data = new_data;  
    new_node.next = (head);  
    (head) = new_node;  
  }  

  /**
  Function to add a node at the end of a List 
  */
  public static void pushAtEnd(int new_data)  
  {  
    Node new_node = new Node();  
    new_node.data = new_data;  
    if(head == null)
      head = tref = new_node; 
    else
      tref.next = new_node;

    tref = new_node;
    tref.next = null;
  }  
  
  /**
  Function to print nodes in a given linked list 
  */
  public static void printList(Node node)  
  {  
    while (node != null)  
    {  
      System.out.print(node.data + " ");  
      node = node.next;  
    }  
  }  

  /**
  Start function for JVM
  */
  public static void main(String[] args)  
  {  
    /* The constructed linked list is:  
    1->2->3->4->5->6->7 */
    push(7);  
    push(6);  
    push(5);  
    push(4);  
    push(3);  
    push(2);  
    push(1);  
  
    printList(head);  

    head = null;
    pushAtEnd(10);
    pushAtEnd(12);
    pushAtEnd(14);
    pushAtEnd(15);
    pushAtEnd(16);
    pushAtEnd(20);

    System.out.println();

    printList(head);  
  } 
} 
