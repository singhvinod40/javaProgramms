package dataStructure.stack;

public class StackRunner {

    public static void main(String[] args) {

        Stack stack = new Stack();

        System.out.println(" Stack is Empty " +stack.isEmpty());

        stack.push(21);
        stack.push(12);
        stack.push(54);
        stack.push(656);
        stack.push(18);
        stack.push(18);
        stack.push(18);
        stack.push(18);
        stack.push(18);
        stack.push(18);
        stack.push(18);
        stack.push(18);
        stack.push(18);
        stack.push(18);
        stack.push(18);
        stack.push(18);
        stack.push(18);
        stack.push(18);
        stack.push(18);
        stack.push(18);
        stack.push(18);
        stack.push(18);
        stack.push(18);
        stack.push(18);
        stack.push(18);
        stack.push(18);
        stack.push(18);
        stack.push(18);
        stack.push(18);


        System.out.println("stack size is "+stack.size());

        System.out.println(" Stack is Empty " +stack.isEmpty());


        stack.show();
        System.out.println("peeked value "+stack.peek());

       int pop = stack.pop();
        System.out.println("popped out value  "+pop);

        stack.show();







    }
}
