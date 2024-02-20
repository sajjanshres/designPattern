package observer.observer;

import observer.subject.Company;

public class Employee implements Observer {
    private final String employeeName;

    public Employee(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void getNotification(Company company) {
        System.out.println(employeeName + " has received notification from company " + company.getCompanyName());
        System.out.println("Current stock price is " + company.getStockPrice());
    }

    @Override
    public String getMember() {
        return employeeName;
    }
}
