package designPattern.factoryPattern;

public class GetPlanFactory {



    public static Plan getPlan(String planType){

            if(planType==null){
                return null;
            }
            if(planType.equals("Domestic")){
                return new DomesticPlan();
            }
            if(planType.equals("Commercial")){
                return new CommercialPlan();
            }
            return null;
        }
}
