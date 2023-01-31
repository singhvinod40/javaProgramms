package dataStructure.LinkedlistPrac;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class LinkedListImpl<T> {

    Node<T> head;


    public void add(T s) {

        Node node = new Node<>();
        node.data = s;

        if (head == null) {
            head = node;
        } else {
            Node n = head;

            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show() {

        if (head == null) {
            System.out.println("[ ]");
        } else {
            Node node = head;

            System.out.print("[");
            while (node.next != null) {
                System.out.print("\"" + node.data + "\",");
                node = node.next;
            }
            System.out.print("\"" + node.data + "\"]");
            System.out.println();

        }

    }

    public void addAtStart(T s) {

        Node node = new Node<>(s);

        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }


    public int size() {

        int length = 0;
        if (head == null)
            return 0;
        else {

            Node node = head;

            while (node.next != null) {

                length++;
                node = node.next;
            }
            return ++length;
        }
    }


    public void deleteAt(int index) {

        if (index > size()) {
            throw new IndexOutOfBoundsException();
        } else if (index < 0) {
            throw new NegativeArraySizeException();
        } else {

            Node node = head;

            for (int i = 0; i <= index; i++) {
                node = node.next;
            }

            node.next = node.next.next;

        }

    }

    public void reverse() {
        if (head == null) {
            throw new NullPointerException();
        }
        if (size() == 1) {
            show();
        } else {


            Node prev = null;
            Node node = head;
            Node next = null;

            while (node != null){

                next = node.next;
                node.next = prev;
                prev  = node;
                node = next;


            }
            node = prev;
            head = node;
            show();

        }


    }

    public void removeDuplicate(){

        if(size()==1){
           return;
        }else{

            Node node = head;
            Node temp = null;
            Node index =head;


            while (node.next!=null){

                temp = node;
                index = node.next;

                while (index.next!=null){
                    if(node.data == index.data){
                       temp.next = index.next;
                    }else {
                       temp =index;
                    }
                    index= index.next;

                }
                node = node.next;
            }
        }



    }


    public boolean detectloop(){

            Set<Node> set = new HashSet<>();
            Node node = head;

            while (node.next != null){

                if(set.contains(node)){
                    return true;
                }else
                    set.add(node);
                node =node.next;
            }

        return false;
    }


    public void deleteMnodeAfterN(int m ,int n){

        if(m>size())
                throw new IndexOutOfBoundsException();






    }

}
