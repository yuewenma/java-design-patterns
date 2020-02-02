package Generics;

import java.util.LinkedList;

public class Tree<E> {
  private Node<E> root;

  private static class Node<E> {
    E data;
    LinkedList<Node<E>> children;

    public Node(E d) {
      data = d;
      children = new LinkedList<Node<E>>();
    }

    /**
     * addItem is a method that is inside a Node class and not inside a Tree class.
     * The addItem, must be called on a Node instance.
     */
      public void addChildItem(E d) {
        //put data into a node and add to current children's linked list
        Node<E> temp = new Node<>(d);
        this.children.add(temp);
      }

      public String toString() {
        return data.toString()+" has children of: "+children.toString();
      }
  }

//          1
//    2  3  4  5  6
//  21
  public static void main(String[] args) {
    Tree<Integer> t = new Tree<Integer>();
    t.root = new Node<Integer>(1); //the root node of t now contains value 1
    t.root.addChildItem(2); //2 in level 2
    t.root.addChildItem(3); //3 in level 2
    t.root.addChildItem(4); //4 in level 2
    t.root.addChildItem(5); //5 in level 2
    t.root.addChildItem(6); //6 in level 2
    // left item in root: t.root.children.get(0)
    t.root.children.get(0).addChildItem(21); //32 in level 3 under 2
  }
}
