package designPattern.factoryDesignPattern;

public class OperationSystemFactory {

    public  OS getInstance(String type){

        if(type.equals("Anderiod"))
                return new Anderiod();

        if(type.equals("IOS"))
                return new IOS();

        if(type.equals("Windows"))
                return new Windows();

        else
            return new Windows();
    }
}
