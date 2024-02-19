package observerPattern.observer;

import observerPattern.subject.Company;

public interface Observer {

    void getNotification(Company company);

    String getMember();

}
