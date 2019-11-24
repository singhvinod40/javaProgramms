package random;

import java.util.*;
import java.util.stream.Collectors;
class Customer
{
   private String name;
   private int id;

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return getId() == customer.getId() &&
                getName().equals(customer.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId());
    }
}

public class MainClass
{
    public static void main(String[] args)
    {
        Customer c1= new Customer("John",20);
        Customer c2= new Customer("John",20);

        HashSet<Customer> customerSet=new HashSet<>();
        customerSet.add(c1);
        customerSet.add(c2);
        System.out.println(customerSet.size());

    }
}