package singleton;

public class Test {

    private Test(){}

    public static class SingletonHelper {
        public static final Test SINGLETON = new Test();
    }

    public static Test getInstance() {
        return SingletonHelper.SINGLETON;
    }
}
