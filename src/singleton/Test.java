package singleton;

public class Test {

    public static class SingletonHelper {
        public static final Test SINGLETON = new Test();
    }

    public static Test getInstance() {
        return SingletonHelper.SINGLETON;
    }
}
