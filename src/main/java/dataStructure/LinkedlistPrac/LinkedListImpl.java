package dataStructure.LinkedlistPrac;

public class LinkedListImpl {

        Node head;


    public void add(int data) {

        Node node = new Node();
        node.data=data;

        if(head==null){
            head=node;
        }

        else if(head!=null){
            Node n=head;
            while(n.next!=null){
                n=n.next;
            }
            n.next=node;
        }
    }
    void show(){
      Node n =head;
      while (n.next!=null){
          System.out.print(n.data+"  ");
          n=n.next;
      }
        System.out.println(n.data+" ");
    }


    public void reverse() {
        Node node=head;
        Node current=null;
        Node previous=null;

        while(node.next!=null){

            current=node;
            node=node.next;

            current.next=previous;
            previous=current;
            current=head;
        }
        System.out.println(current.data);
        show();

    }

    public void deleteHead() {
        Node node=head;
        head=node.next;
    }

    public void removeLast() {
        Node n=head;

        while (n.next!=null){
            n=n.next;
            if(n.next.next==null){
                n.next=null;
                break;
            }
        }

    }

    public void removeAt(int index) {

        Node n=head;

        for(int i=0;i<index-1;i++){
           n= n.next;
        }
        n.next=n.next.next;
    }

    public void isPalindrom() {

        Node n=head;
    }

    public void findMax() {
        Node node=head;
        int max=head.data;
        int count=0;
        while (node.next!=null){

            if(node.data>max) {
                max = node.data;
            }
            node=node.next;
        }
        if (node.data>max){
            max=node.data;
        }
        System.out.println("max val  "+max);
    }

    public void addAttMiddle() {
        Node node=head;
        Node fast=null;
        Node slow=null;
//        while ()

    }

    public void addAtStart ( int data) {

        Node node=head;
        Node newNode=new Node(data);
        head=newNode;
        head.next=node;
    }

    public void addAtEnd(int data) {

        Node temp=new Node(data);
        Node node=head;
        while(node.next!=null){
            node=node.next;
        }
            node.next=temp;
    }

    public void removeDuplicate() {

        Node node=head;

        while (node.next!=null){

            int temp=node.data;

            while (node.next!=null){

                if(temp==node.data){
                    node =node.next;
                }
            }
        }
    }
}
