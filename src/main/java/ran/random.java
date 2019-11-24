package ran;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class random extends test {

    public static void main(String[] args) throws Exception{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        List<String>list=new ArrayList<>();

        while (list.size()<=(a*b)+2){
            String s=br.readLine();
            list.add(s);
        }


        for(int i=0;i<list.size();i++){
            if(list.get(i).startsWith("top")){
                findtop(list.get(i),list.subList(0,i));
            }
        }

    }
            static void findtop(String s,List<String>list){
                String[] str = s.split("\\s");
               int findTop=Integer.parseInt(str[1].replace("\\s",""));

                Map<String, Integer> map = new HashMap<>();

                for (String c : list) {
                    if (!map.containsKey(c)) {
                        map.put( c,1);

                    } else {
                        map.put(c, map.get(c) + 1);
                    }
                }
                printtop(findTop,map);
    }

    static void printtop(int top,Map<String,Integer>map){

        Map<String, Integer> sortedByValueDesc = map.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));


        List<String> valueList = new ArrayList<String>(sortedByValueDesc.keySet());

        for(int i=0;i<top;i++){

            System.out.print(valueList.get(i) +" ");
        }
        System.out.println();
    }

}
