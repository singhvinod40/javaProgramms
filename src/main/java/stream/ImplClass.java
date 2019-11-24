package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImplClass {
    public static void main(String[] args) {

        List<MOdelEmployee> modelEmployeeMap=new ArrayList<>();

        modelEmployeeMap.add( new MOdelEmployee("vinod",3,"Alllahabad"));
        modelEmployeeMap.add( new MOdelEmployee("kumar",8,"bangalore"));
        modelEmployeeMap.add( new MOdelEmployee("singh",15,"pune"));
        modelEmployeeMap.add( new MOdelEmployee("puchu",125,"electronic city"));

                modelEmployeeMap.stream()
                .filter(emp ->emp.getId()>5 )
                .sorted((e1,e2)-> e1.getId()-e2.getId()).
                        forEach((e)-> System.out.println(e.getName()+" : "+e.getId()+" : "+ e.getCity()));



//        Integer no [] = {78,12,58, 21, 32,105, 4, 52, 63};
//        Stream<Integer>stream=  Arrays.stream(no);
//        stream.count();
//        stream.sorted().forEach(System.out::println);

        List<MOdelEmployee> mOdelEmployeesnewCity=modelEmployeeMap.stream().filter((emp)->emp.getId()>15)
                .map((e)->{e.setCity("bangkok");return e;})
                .collect(Collectors.toList());
        mOdelEmployeesnewCity.forEach((e)->System.out.println(e.getName()+" --"+e.getId()+"--"+e.getCity()));

        System.out.println(" new employee  ->"+mOdelEmployeesnewCity.size());


        Optional<Integer>maxId=modelEmployeeMap.stream().map(e->e.getId()).reduce(Integer::max);
        System.out.println("the max id is" +maxId);

        List<MOdelEmployee> max_Id=modelEmployeeMap.stream().filter(e->e.getId()==maxId.get()).collect(Collectors.toList());

        max_Id.forEach((e)->System.out.println(e.getName() + e.getId()+ e.getCity()));
    }
}
