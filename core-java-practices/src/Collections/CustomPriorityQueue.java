package Collections;

public class CustomPriorityQueue {
    Node head;
    class Node{
        int data;
        Node next;


        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void add(int data){
      Node node=new Node(data);
      if(head==null){
          head=node;
          return;
      }
      else{
          if(node.data<head.data){
              node.next=head;
              head=node;
              return;
          }
          else{
              Node temp=head;
              while(temp.next!=null && temp.next.data<node.data){
                  temp=temp.next;

              }
              node.next=temp.next;
              temp.next=node;
          }
      }
      //we have to insert the nodes as per priority.

    }
    public void remove(){
       if(head==null) {
           System.out.print("underflowing occurs");
           return;
       }
       System.out.println(head.data);
        head=head.next;
    }
    public void element(){
        System.out.println(head.data);
    }
    public String toString(){
        return head.data+ " ";
    }



    public static void main(String[] args) {
     CustomPriorityQueue priorityQueue=new CustomPriorityQueue();
     priorityQueue.add(5);
     priorityQueue.add(3);
     priorityQueue.add(12);
     priorityQueue.add(2);
     priorityQueue.add(10);
     priorityQueue.element();
     priorityQueue.remove();
     priorityQueue.element();





    }

    }
