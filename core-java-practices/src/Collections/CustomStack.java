package Collections;

public class CustomStack {
    Node head;
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
    public void push(int data){
        Node node=new Node(data);
        node.next=head;
        head=node;
    }
    public void pop(){
       if(head==null){
           System.out.println("stack underflow");
       }
       else{
           int i=head.data;
           head=head.next;
           System.out.println(i);

       }

    }
    public void peek() {
        if (head == null) {
            System.out.println("stack is empty");
        } else {
            System.out.println(head.data);
        }
    }


    public static void main(String[] args) {
        CustomStack stack=new CustomStack();
        stack.push(5);
        stack.push(6);
        stack.push(8);
        stack.pop();
        stack.peek();

    }
}
