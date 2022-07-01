class Main {
  public static void main(String[] args) {
    LinkedList stack=new LinkedList();
    System.out.println(stack.isEmpty());
    stack.createStack(1);
    System.out.println(stack.isEmpty());

    stack.push(2);
    stack.pop();
    stack.pop();
    stack.pop();
    // System.out.println(stack.head.value);

    stack.push(2);
    stack.push(1);
    stack.peek();
    stack.deleteStack();
    stack.peek();
  }
}