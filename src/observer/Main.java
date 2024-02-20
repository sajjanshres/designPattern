package observer;

import observer.observer.Customer;
import observer.observer.Employee;
import observer.subject.SpecificCompany;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SpecificCompany sp = new SpecificCompany("ABC Ltd.");
        Customer c1 = new Customer("John");
        Employee e1 = new Employee("Kevin");
        sp.registerMember(c1);
        sp.registerMember(e1);
        System.out.println("----------------------------");
        sp.setStockPrice(20);
        System.out.println("----------------------------");

        sp.unregisterMember(c1);

        sp.setStockPrice(25.9);
        System.out.println("----------------------------");
        sp.registerMember(c1);
        sp.setStockPrice(21);
        System.out.println("----------------------------");


        SpecificCompany sp1 = new SpecificCompany("XYZ Co.");
        Employee e3 = new Employee("Dave");
        Employee e4 = new Employee("Jerry");
        sp1.registerMember(e3);
        sp1.registerMember(e4);

        sp1.setStockPrice(145);
        System.out.println("----------------------------");
        Thread.sleep(5000);
        sp1.setStockPrice(156);
        System.out.println("----------------------------");

    }
}