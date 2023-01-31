package java8;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CodingQuestion {
    public static void main(String[] args) {

        Prac prac = new Prac();
        prac.printRandom();
        prac.findMin();
        prac.findMax();
        prac.ifPresent();
        prac.coutlength();
        prac.multiplyWith3();
        prac.distinceValue();
        prac.sort();
        prac.cubeAndFilter();
        prac.findDirst();
        prac.countChar();
        prac.firstOccoure();

    }

}


class Prac {

    public void printRandom() {
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

    }

    public void findMin() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        ;

        System.out.println(min);
    }


    public void findMax() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        int min = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        ;

        System.out.println(min);
    }

    public void ifPresent() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        System.out.println(list.stream().anyMatch(Predicate.isEqual(77)));

    }

    public void coutlength() {

        List<String> list = Arrays.asList("Hello", "Interview", "Questions", "Answers", "Ram", "for");

        System.out.println("String with more then 3 character");
        list.stream().filter(s -> s.length() > 3).forEach(System.out::println);


    }

    public void multiplyWith3() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        list.stream().map(i -> i * 3).forEach(System.out::println);

    }


    public void distinceValue() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 3, 44, 54, 2, 545, 99);

     //   List<Integer> li = list.stream().distinct().collect(Collectors.toList());


        Set<Integer> li =  list.stream().collect(Collectors.toSet());
        System.out.println(li);

    }


    public void sort() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 3, 44, 54, 2, 545, 99);

        List<Integer> li =  list.stream().sorted(Comparator.comparing(Integer::valueOf)).collect(Collectors.toList());
        System.out.println(li);

    }


    public void sum() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 3, 44, 54, 2, 545, 99);

        int sum =  list.stream().mapToInt(Integer::intValue).sum() ;

        System.out.println(sum);

    }

    public void cubeAndFilter(){

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 3, 44, 54, 2, 545, 99);

        List<Integer> li = list.stream().map( i-> i*3).filter(i ->i>50).collect(Collectors.toList());

        System.out.println(li);

    }

    public void findDirst(){

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 3, 44, 54, 2, 545, 99);

          list.stream().findFirst().ifPresent(System.out::println);

    }


    public void countChar(){

        String str = "Java Hungry Blog Alive is Awesome";

        HashMap<Character,Long> map = str.chars()
                .mapToObj(s-> Character.toLowerCase(Character.valueOf((char)s)))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new ,Collectors.counting()));

        System.out.println(map);
    }



    public void firstOccoure(){

        String str = "Java Hungry Blog Alive is Awesome";
        Set<Character> set = new HashSet<>();

        str.chars().mapToObj(s-> !set.add((char)s)).forEach(System.out::println);

    }

}







