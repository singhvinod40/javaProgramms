package designPattern.factoryDesignPattern;

public class FactoryMain {
    public static void main(String[] args) {


        OperationSystemFactory os = new OperationSystemFactory();

        OS osf = os.getInstance("Windows        ");

        osf.spec();


    }
}
