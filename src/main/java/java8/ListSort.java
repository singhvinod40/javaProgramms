package java8;

import java8.lambda.Employee;

import java.time.LocalDate;
import java.util.*;
import static java.util.Map.Entry.*;
import static java.util.stream.Collectors.toMap;

@AnnotaionInterfaceImplementation({ @AnnotationInterface(name="vinod",method = "listSort")})
public class ListSort extends SortingCompartor implements secondInterface{
    public static void main(String[] args) {
        List<Employee> list=new ArrayList();

            list.add( new Employee(1,"vinod",23));
            list.add( new Employee(2,"vinod",24));
            list.add( new Employee(3,"vinod",25));
            list.add( new Employee(4,"vinod",26));
            list.add( new Employee(5,"vinod",27));

        Map<Integer,Employee> map=new HashMap<>();
        map.put(3,new Employee(1,"vinod",25));

        map.put(5,new Employee(1,"vinod",27));
        map.put(1,new Employee(1,"vinod",23));
        map.put(2,new Employee(1,"vinod",24));
        map.put(4,new Employee(1,"vinod",26));

      Map<Integer,Employee>sorted= map.entrySet().stream().sorted((o1, o2) -> o2.getValue().getAge())
              .collect(toMap(e->e.getKey(),e->e.getValue(),(e1,e2)->e2,LinkedHashMap::new));

        System.out.println(sorted);

        Map<Integer,Employee>sortedByDescending=map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.<Integer, Employee>comparingByValue()))
                .collect(toMap(e->e.getKey(),e->e.getValue(),(e1,e2)->e2,LinkedHashMap::new));
        System.out.println(sortedByDescending);



//        System.out.println("listssssssssssss"+list);
//
//        System.out.println(" started sorting "+list);
//
//        System.out.println(LocalDate.now());
//
//        new ListSort().hello();
//
//        double comp=firstInterface.salary(5000);
//        System.out.println(" compensation is" + comp);
//
//        double comp2=SortingCompartor.salary(2000);
//        System.out.println(" compensation is2" + comp2);

    }


}
