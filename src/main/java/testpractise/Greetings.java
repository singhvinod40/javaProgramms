package testpractise;

public class Greetings {

    private static final String Hello="hello ";
    private static final String World=" World";

    public String helloWorld(){
        return Hello+"  "+World;
    }

    public String helloUser(String s){
        return Hello+s+World;
    }
}
