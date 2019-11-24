package designPattern.factoryPattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) throws Exception {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String planName=br.readLine();
        int unit=Integer.parseInt(br.readLine());

        Plan p=GetPlanFactory.getPlan(planName);



        System.out.println("billAmount");
        p.getRate();
        p.calculateBill(unit);


    }
}
