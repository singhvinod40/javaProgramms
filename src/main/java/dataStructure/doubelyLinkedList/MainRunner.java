package dataStructure.doubelyLinkedList;

public class MainRunner {
    public static void main(String[] args) {

        DoubelyLinkedList<Integer> list = new DoubelyLinkedList<>();

        list.add(1);
        list.add(7);
        list.add(12);
        list.add(54);
        list.add(65);
        list.add(234);

        list.show();

        list.size();


//        list.addAtStart(33);
//
//        list.show();
//
//        list.size();

//        list.insertAtEnd(101);

//        list.insertAt(3,49);

        list.show();

//        list.size();
//
//
//        list.deleteFirst();
//        System.out.println("delete from start");
//        list.show();
//
//        list.size();
//
//        System.out.println("delete at particular index");
//        list.deleteAt(3);
//        list.show();
//
//        list.size();
//
//
//        System.out.println("delete last value");
//        list.deleteLastValue();
//        list.show();
//        list.size();

        System.out.println("After rotating");
        list.rotataByKnodes(3);


    }
}
