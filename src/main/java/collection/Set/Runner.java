package collection.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args)
    {
        Thread thread1 = new Thread();

        thread1.start();

        Thread.currentThread().setPriority(8);

        Thread thread2 = new Thread();

        thread2.start();

        Thread thread3 = new Thread();

        thread3.start();

        System.out.println(thread1.getPriority());

        System.out.println(thread2.getPriority());
        System.out.println(thread3.getPriority());
    }
}
