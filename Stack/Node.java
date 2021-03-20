package Stack;

public class Node<T>
{
  private T data;
  private Node next;

  public Node(T data)
  {
    this.data = data;
  }

  public void setData(T data)
  {
    this.data = data;
  }
  public T getData()
  {
    return data;
  }
  public void setNext(Node node)
  {
    next = node;
  }
  public Node<T> getNext()
  {
    return next;
  }
}
