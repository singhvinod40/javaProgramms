package oops;

public class Covariant extends parentclass{

    public static final void main(String[] args) {

        final int i;
        i=20;
        System.out.println(i);

     parentclass parentclass1=new derived();
     parentclass1.fun();

     derived derivedclass=new derived();
     derivedclass.fun();
     parentclass parentclass2=new parentclass();
     parentclass2.fun();

     parentclass parentclass3=new derived();
        System.out.println( parentclass3.speed);

    }

    private static void message(){
        System.out.println("covariant ka mesage");
    }

}

class parentclass{
        int speed=50;
   void fun(){

       System.out.println("parent class" );
   }

}
class derived extends parentclass{
    int speed=100;
 void fun(){
     System.out.println("derived class");
 }
}


