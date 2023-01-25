package dataStructure.LinkedlistPrac;

public class Runner {

    public static void main(String[] args) {

        LinkedListImpl<String> list=new LinkedListImpl();

        list.add("a");
        list.add("f");
        list.add("awe");
        list.add("ads");
        list.add("awasq");
        list.add("mkjn");


        list.show();

        list.addAtStart("start");

        list.show();

        System.out.println("Size is "+list.size());


        list.deleteAt(3);

        list.show();

        System.out.println("Size is "+list.size());


        System.out.println("Reversed the list");
        list.reverse();

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
