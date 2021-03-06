public class LinkedList{
  Node head;
  
  public void createStack(int value){
    head=new Node();
    head.value=value;
    System.out.println("Stack created");
  }

  public boolean isEmpty(){
    if(head==null){
      return true;
    }
    else{
      return false;
    }
  }

  public void push(int value){
    Node tempNode=new Node();
    tempNode.value=value;
    tempNode.next=head;
    head=tempNode;
    System.out.println("Value pushed successfully.");
  }

  public void pop(){
    if(isEmpty()){
      System.out.println("Stack is already Empty!");
    }
    else if(head.next==null){
      int a=head.value;
      head=null;
      System.out.println(a+" popped. Stack Empty. :(");
    }
    else{
      int a=head.value;
      head=head.next;
      System.out.println(a+ " popped. Puff!");
    }
  }

  public void peek(){
    if(isEmpty()){
      System.out.println("Stack is empty!");
    }
    else{
      System.out.println(head.value);
    }
  }

  public void deleteStack(){
    head=null;
    System.out.println("Stack successfully deleted.");
  }
  
}