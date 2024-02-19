package observerPattern.observer;

import observerPattern.subject.Company;

public class Customer implements Observer {
    private final String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void getNotification(Company company) {
        System.out.println(customerName + " has received notification from company " + company.getCompanyName());
        System.out.println("Current stock price is " + company.getStockPrice());
    }

    @Override
    public String getMember() {
        return customerName;
    }
}
