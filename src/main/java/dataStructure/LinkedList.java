package dataStructure;

public class LinkedList {

    Node head;

    public void inserData(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;

        }
        else {
           Node n=head;
           while (n.next!=null){
               n=n.next;
           }
           n.next=node;
        }
    }

        public void show(){

        Node node=head;

        while (node.next!=null){
            System.out.println("value is -:" + node.data);
            node=node.next;
        }
            System.out.println("value is -:"+node.data);
    }

    public void size(){
        int count=1;
        Node node=head;
        while (node.next!=null){
            count++;
            node=node.next;
        }
        System.out.println("size of linked list is  " +count);
    }

    public void middleElement(){

        Node current=head;
        Node middle=head;
        int length=0;

        while (current.next!=null){
            length++;

            if(length % 2==0){
                 middle=middle.next;
            }
            current=current.next;
        }
        if(length%2==1){
            middle=middle.next;
        }
        System.out.println("length of list is -: " + length);
        System.out.println("middle elemet is -: " +middle.data);
}

        public void reverse() {

            Node node = head ;
            Node current = null;
            Node previous = null;
            while (node.next != null) {

                current = node;
                node = node.next;

                //reverse
                current.next = previous;
                previous = current;
                head = current;

            }
            System.out.println(current.data);
            show();
        }

    public void removeDuplicate() {

        Node node=head;
    }
}

