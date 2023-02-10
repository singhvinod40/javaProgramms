package dataStructure.stack;

import java.util.Arrays;

public class Stack {



    int capacity =5;
    int[] stack = new int[capacity];

    int count = 0;

    public void push(int data) {

        if(size() ==capacity){
            expand();
        }else {
            stack[count] = data;
            count++;
        }




    }

    private int[] expand(){
        capacity =capacity*2;
        int [] tempArray = new int[capacity];
        System.arraycopy(stack,0,tempArray,0,size());
        stack = tempArray;
        return stack;

    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        boolean toreturn;
        toreturn = count == 0 ? true : false;
        return toreturn;
    }

    public void show() {
        System.out.println();
        System.out.print("[");
        for (int data : stack) {
            System.out.print(data + ", ");
        }
        System.out.print("]");
        System.out.println();
    }


    public int pop() {
        if(!isEmpty()){
            count--;
            int toreturn = stack[count];
            stack[count] = 0;
            return toreturn;
        }else {
            System.out.println("Stack is empty ");
            return 0;
        }

    }

    public int peek() {

        return stack[count - 1];

    }


}
