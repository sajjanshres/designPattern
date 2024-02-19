public class SpecificCompany extends Company {

    public SpecificCompany(String companyName) {
        super(companyName);
    }

    @Override
    public void registerMember(Observer observer) {
        members.add(observer);
    }

    @Override
    public void unregisterMember(Observer observer) {
        members.remove(observer);
    }

    @Override
    public void notifyMembers() {
        for (Observer o : members) {
            o.getNotification(this);
        }
    }
}
