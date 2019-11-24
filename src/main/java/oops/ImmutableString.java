package oops;

import javax.print.DocFlavor;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.InetAddress;

public class ImmutableString extends Exception implements Serializable,Cloneable {
            public ImmutableString(String s){};

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws Exception{
        StringBuffer sb=new StringBuffer("vinod");
        System.out.println(sb);
        sb.append("kumar");
        System.out.println(sb);

        String s="vinod";
        System.out.println(s);
        s.concat("kumar");
        System.out.println(s);
        //Runtime.getRuntime().exec("notepad");//will open a new notepad
        try{
            InetAddress ip=InetAddress.getByName("195.201.10.8");

            System.out.println("Host Name: "+ip.getHostName());
        }catch(Exception e){System.out.println(e);}

        Class clazz=Class.forName("oops.Covariant");
        System.out.println(clazz);

        Object o=clazz.newInstance();
        Method m=clazz.getDeclaredMethod("message",null);
        m.setAccessible(true);
        m.invoke(o,null);
    }
}

