package dataStructure.LinkedlistPrac;

public class Runner {

    public static void main(String[] args) {

        LinkedListImpl<String> list=new LinkedListImpl();

//        list.add("a");
//        list.add("f");
//        list.add("awe");
//        list.add("ads");
//        list.add("awasq");
//        list.add("mkjn");
//
//
//        list.show();
//
//        list.addAtStart("start");
//
//        list.show();
//
//        System.out.println("Size is "+list.size());
//
//
//        list.deleteAt(3);
//
//        list.show();
//
//        System.out.println("Size is "+list.size());
//
//
//        System.out.println("Reversed the list");
//        list.reverse();
//
//
        LinkedListImpl<Integer> li = new LinkedListImpl<>();

        li.add(1);
        li.add(2);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(2);
        li.add(3);
        li.add(2);

 //       li.head.next.next.next.next = li.head;


//        li.show();
//
//        li.removeDuplicate();
//
//        li.show();

        if(li.detectloop()){
            System.out.println("There is a loop");
        }else {
            System.out.println("No Loop detected");
        }

        li.deleteMnodeAfterN(2,3);
        li.show();



////        list.reverse();
////        System.out.println("after reverse" );
//        list.show();
//        list.deleteHead();
//        list.show();
//        list.removeLast();
//        list.show();
//        list.removeAt(2);
//        list.show();
//        list.isPalindrom();
//        list.addAttMiddle();
//        list.addAtStart(785);
//        list.show();
//        list.addAtEnd(222);
//        list.show();
//        list.removeDuplicate();
//


    }
}
