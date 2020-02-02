package itearation;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreePost<E> implements Iterable<E>{

  private Node<E> root;

  @Override
  public Iterator<E> iterator() {
    return new PostOrderIterator(this.root);
  }

  private static class PostOrderIterator<E> implements Iterator<E>{
    Stack<Node<E>> stk;
    Node<E> h;
    Node<E> c;

    public PostOrderIterator(Node<E> root) {
      stk = new Stack<>();
      if (root != null) {
        stk.add(root);
        h = root;
      }
    }
    public boolean hasNext(){
      return !(stk.isEmpty());
    }

    //Post-order left right root
    public E next(){
      if(hasNext()){
        while(!stk.empty()) {
          c = stk.peek();
          if (c.left!=null && h!=c.left && h!=c.right)
            stk.push(c.left);
          else if (c.right!=null&&h!=c.right)
            stk.push(c.right);
          else {
            Node<E> ret = stk.pop();
            h = c;
            return ret.data;
          }
        }
      }
      return null;
    }
  }

  //nested class
  private static class Node<E> {

    E data;
    Node<E> left;
    Node<E> right;

    public Node(E d) {
      data = d;
    }

    private void addData(Node<E> n) {
      Queue<Node<E>> q = new LinkedList<>();
      q.add(this);
      while (true) {
        Node<E> candidate = q.poll();
        if (candidate.left == null) {
          candidate.left = n;
          break;
        } else if (candidate.right == null) {
          candidate.right = n;
          break;
        } else {
          q.add(candidate.left);
          q.add(candidate.right);
        }
      }
    }
  }

  public void addDataInTree(E d) {
    Node<E> node = new Node<>(d);
    if (root == null) {
      root = node;
      return;
    }
    root.addData(node);
  }

  /**
   * Client code is in the main function
   */

  public static void main(String[] args) {
    BinaryTreePost<Integer> bTree = new BinaryTreePost<Integer>();
    bTree.addDataInTree(1);
    bTree.addDataInTree(2);
    bTree.addDataInTree(3);
    bTree.addDataInTree(4);
    bTree.addDataInTree(5);
    bTree.addDataInTree(6);
    bTree.addDataInTree(7);

    // === Iterator i = btree.Iterator()
    //     while(i.hasNext())
    //        i.next
    for (Integer i : bTree) {
      System.out.println(i);
    }
  }
}
