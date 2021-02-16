package implementation;

/**
 * This class will contain doubly linked list node. Complete the class as per
 * doubly linked list specification.
 * You are free to override Object class methods and
 * also free to implement any interface from java library.
 */
public class Node {
  private Node next,prev;
  private int data;
  public Node(int data)
  {
    this.data = data;
    next = null;
    prev = null;
  }
}
