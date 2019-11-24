package dataStructure;



public class Runner{

    public static void main(String[] args) {

        LinkedList list=new LinkedList();
        list.inserData(5);
        list.inserData(45);
        list.inserData(595);
        list.inserData(784);
        list.inserData(3);
        list.inserData(2);

        list.show();
        list.size();

        list.middleElement();
        list.reverse();
        list.removeDuplicate();
    }
}