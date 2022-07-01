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

  


  
}