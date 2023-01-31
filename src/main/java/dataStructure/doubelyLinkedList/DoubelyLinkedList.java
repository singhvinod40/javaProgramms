package dataStructure.doubelyLinkedList;

import java.sql.SQLOutput;

public class DoubelyLinkedList<T> {


    Node head;



    public  void  add(T data){

        if(head == null){

            Node node = new Node<>(data);
            node.prev =null;
            node.next=null;
            head = node;
        }else {
            Node node = head;



            while (node.next!= null){

                node = node.next;
            }

            Node n = new Node<>(data);

            node.next = n;
            n.prev =node;
            n.next =null;
        }
    }

    public int size(){

        if(head == null)
            return 0;

        Node node =head;
        int count =0 ;

        if(node == null)
            System.out.println(0);
        else {
            while (node.next!=null){
                count++;
                node = node.next;
            }
            System.out.println("Size is : "+ ++count);
        }
        return ++count;
    }

    public void show(){

        Node node = head;

        if(node == null){
            System.out.println("[ ]");
        }
        else {
            System.out.print("[");

            while (node.next != null) {

                System.out.print(node.data + ", ");
                node = node.next;
            }

            System.out.println( node.data +"]");
        }
    }

    public void addAtStart(T data){

        if(head == null){

            Node node = new Node(data);
            node.next =null;
            node.prev =null;

            head =node;
        }else {

            Node node = head;

            Node node1 = new Node(data);
            node.prev =node1;
            node1.next =node;
            node1.prev =null;

            head = node1;
        }

    }

    public void insertAt(int index ,T data){

        if(head == null && index ==0){

            Node node = new Node<>(data);
            node.next =null;
            node.prev =null;
            head = node;
        }
        else if(index>size()){
                throw new IndexOutOfBoundsException();
        }else if(index <0){
            throw new NegativeArraySizeException();
        }
        else if (index == 0){
            addAtStart(data);
        }else {

            Node node =head;



            for(int i =0;i< index;i++){
                node = node.next;
            }

            Node node1 = new Node<>(data);
            node1.next =node.next;
            node1.prev = node;


            while (node1.prev!= null){
                node1 =node1.prev;
            }

            head = node1    ;
        }

    }

    public void insertAtEnd(T data){

        if(size() == 0){
           addAtStart(data);
        }else {

            Node node =head;

            while (node.next != null){
                node = node.next;
            }

            Node temp = new Node<>(data);
            temp.prev =node;
            node.next =temp;


            head =node;
        }
    }


    public void deleteFirst(){

        if(size() == 0)
            return;
        else if(size() ==1){
            head = null;
        }else {

            Node node = head.next;
            node.prev =null;
            head =node;
        }
    }

    public void deleteAt(int index){

        if(index>size())
                throw new IndexOutOfBoundsException();
        else if( index< 0)
                throw new NegativeArraySizeException();
        else if (index ==1) {
            deleteFirst();
        }else {

            Node node =head;

            for(int i= 1;i<index ;i++){
                node = node.next;
            }

            node.next = node.next.next;

        }


    }

    public void deleteLastValue(){

        if(size() == 0)
            throw new IndexOutOfBoundsException();
        else if(size() ==1){
            head = null;
        }else {
            Node node = head;
            while (node.next.next != null){

                node = node.next;
            }

            node.next =null;
            System.out.println(node);
        }

    }

    public  void rotataByKnodes( int k){

        if(head == null)
            throw new IndexOutOfBoundsException();
        else if(size() == 1){
             show();
        }else if( k >size()){

            k = k%size();

           Node node = head;

           while (node.next!=null && k>1){
               node = node.next;
               k--;
           }

           Node newHead = node.next;
           newHead.prev =null;

           node.next =null;

           Node tmp = newHead;

           while (tmp.next != null){
               tmp = tmp.next;
           }

           tmp.next =head;
           head.prev = tmp;

           head = newHead;

           show();


        }


    }

}
