package itearation;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeIn<T> implements Iterable<T> {

  private Node<T> root;

  public BinaryTreeIn() {
    root = null;
  }

  private static class Node<T> {

    T data;
    Node<T> left;
    Node<T> right;

    public Node(T d) {
      data = d;
      left = null;
      right = null;
    }

    public String toString() {
      return data.toString();
    }

    private void addData(Node<T> n) {
      Queue<Node<T>> q = new LinkedList<>();
      q.add(this);
      while (true) {
        Node<T> candidate = q.poll();
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

  public void addDataInTree(T d) {
    Node<T> node = new Node<>(d);
    if (root == null) {
      root = node;
      return;
    }
    root.addData(node);
  }

  public String toString() {
    return _toString(root);
  }

  /**
   * @param n root
   */
  private String _toString(Node<T> n) {
      if (n != null) {
          return n.data.toString() + _toString(n.left) + _toString(n.right);
      } else {
          return "";
      }
  }

  private static class InOrderIterator<T> implements Iterator<T> {

    Stack<Node<T>> stk;
    Node<T> cur;

    public InOrderIterator(Node<T> root) {
      stk = new Stack<>();
      cur = root;
    }

    @Override
    public boolean hasNext() {
      return !(stk.isEmpty()) || cur != null;
    }

    @Override
    public T next() {
      if (hasNext()) {
        while (cur != null) {
          stk.push(cur);
          cur = cur.left;
        }
        cur = stk.pop();
        Node<T> ret = cur;
        cur = cur.right;
        return ret.data;
      }
      return null;
    }
  }


  @Override
  public Iterator<T> iterator() {
    return new InOrderIterator<>(root);
  }

  public static void main(String[] args) {
    BinaryTreeIn<Integer> bTree = new BinaryTreeIn<>();
    bTree.addDataInTree(1);
    bTree.addDataInTree(2);
    bTree.addDataInTree(3);
    bTree.addDataInTree(4);
    bTree.addDataInTree(5);
    bTree.addDataInTree(6);
    bTree.addDataInTree(7);
    /*
     *              1
     *             / \
     *      2               3
     *     / \             / \
     *  4       5       6       7
     *
     */
    System.out.println(bTree);
    System.out.println();
    for (Integer item : bTree) {
      System.out.println(item);
    }
  }
}
