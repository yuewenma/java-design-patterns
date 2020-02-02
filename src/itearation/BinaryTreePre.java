package itearation;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreePre<E> implements Iterable<E> {
  //What is a BinaryTree?
  private Node<E> root;

  //Node class is only visible inside
  // the binary tree class!
  private static class Node<E>
  {
    private E data;
    private Node<E> left;
    private Node<E> right;

    public Node(E d)
    {
      data=d;
      left=null;
      right=null;

    }

    private void addData(Node<E> n)
    {
      Queue<Node<E>> q1=new LinkedList<>();
      q1.add(this);
      while(true)
      {
        Node<E> candidate=q1.poll();
        if (candidate.left==null)
        {
          candidate.left=n;
          break;
        }
        else if (candidate.right==null)
        {
          candidate.right=n;
          break;
        }
        else
        {
          q1.add(candidate.left);
          q1.add(candidate.right);
        }

      }
    }
  }

  public void addData(E d)
  {
    Node<E> node=new Node<>(d);
    if (root==null)
      root=node;
    else
      root.addData(node);

  }
  public static void main(String[] args)
  {
    //
    BinaryTreePre<Integer> t=new BinaryTreePre<>();
    t.addData(1);
    t.addData(2);
    t.addData(3);
    t.addData(4);
    t.addData(5);
    t.addData(6);
    t.addData(7);

    for (Integer x:t)
    {
      System.out.println(x);
    }

//		Iterator<Integer> i=t.iterator();
//		while(i.hasNext())
//		{
//
//			System.out.println(i.next());
//		}


  }
  @Override
  public Iterator<E> iterator() {
    // TODO Auto-generated method stub
    return new PreOrderIterator<>(root);
  }

  private static class PreOrderIterator<E> implements Iterator<E>
  {
    Stack<Node<E>> stk;
    public PreOrderIterator(Node<E> root)
    {
      stk=new Stack<>();
      if (root!=null)
        stk.push(root);
    }
    @Override
    public boolean hasNext() {
      // TODO Auto-generated method stub
      return !(stk.isEmpty());
    }

    @Override
    public E next() {
      // TODO Auto-generated method stub
      if (hasNext())
      {
        Node<E> ret=stk.pop();
        if (ret.right!=null)
          stk.push(ret.right);
        if (ret.left!=null)
          stk.push(ret.left);
        return ret.data;
      }
      return null;
    }
  }

}
