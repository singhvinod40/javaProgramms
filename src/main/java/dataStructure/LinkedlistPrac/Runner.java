package dataStructure.LinkedlistPrac;

public class Runner {

    public static void main(String[] args) {

        LinkedListImpl list=new LinkedListImpl();

        list.add(1);
        list.add(3);
        list.add(6);
        list.add(9);
        list.add(45);
        list.add(712);
        list.show();
        list.findMax();

//        list.reverse();
//        System.out.println("after reverse" );
        list.show();
        list.deleteHead();
        list.show();
        list.removeLast();
        list.show();
        list.removeAt(2);
        list.show();
        list.isPalindrom();
        list.addAttMiddle();
        list.addAtStart(785);
        list.show();
        list.addAtEnd(222);
        list.show();
        list.removeDuplicate();



    }
}
