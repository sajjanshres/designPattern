package observer.observer;

import observer.subject.Company;

public interface Observer {

    void getNotification(Company company);

    String getMember();

}
