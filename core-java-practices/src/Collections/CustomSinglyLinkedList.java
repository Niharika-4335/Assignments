package Collections;

public class CustomSinglyLinkedList {
    Node head;
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    //addFirst,add(specified position,getFirst,getLast,get(index),removed last,remove(index)
    public  void addFirst(int data){
        Node node=new Node(data);
        node.next=head;
        head=node;
    }
    public void addNode(int data,int index){
        Node node = new Node(data);
        Node temp=head;
        int i=0;
        while(temp.next!=null &&i<index-1){
            temp=temp.next;
            i++;
        }
        node.next=temp.next;
        temp.next=node;

    }

    public void addLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }
    public void getFirst(){
        Node temp=head;
        System.out.println(temp.data + " ");
    }
    public void getLast(){
        Node temp=head;
        while(temp.next!=null){
            //temp.next it goes before upto last node.but temp!=null means it goes to the last node.
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    public void getElement(int index){
        Node temp=head;
        int i=0;
        while(temp.next!=null &&i<index-1){
            temp=temp.next;
            i++;
        }
        System.out.println(temp.data);
    }
    public void display(){
       Node temp=head;
       while(temp!=null) {
           System.out.print(temp.data + " ");
           temp = temp.next;

       }
    }
    public void LastRemove(){
        Node temp=head;
        while(temp.next.next!=null  ) {
            temp = temp.next;
        }
        temp.next=null;
    }


    public void FirstRemove(){
        if(head==null){
            System.out.print("empty linkedlist");
        }
        else{
            head=head.next;
        }
    }
    public void RemoveElement(int index){
        Node temp=head;
        int i=0;
        while(temp.next!=null &&i<index-1){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;

    }


    public static void main(String[] args) {
        CustomSinglyLinkedList customSinglyLinkedList = new CustomSinglyLinkedList();
        customSinglyLinkedList.addLast(5);
        customSinglyLinkedList.addLast(9);
        customSinglyLinkedList.addLast(6);
        customSinglyLinkedList.addFirst(1);
//        customSinglyLinkedList.FirstRemove();
        customSinglyLinkedList.addNode(4, 2);
        customSinglyLinkedList.getFirst();
        customSinglyLinkedList.getLast();
        customSinglyLinkedList.getElement(3);
        customSinglyLinkedList.LastRemove();
        customSinglyLinkedList.RemoveElement(2);

        customSinglyLinkedList.display();

    }

    }
