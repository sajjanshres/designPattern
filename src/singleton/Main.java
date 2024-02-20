package singleton;

public class Main {

    public static void main(String[] args) {

        Test s1 = Test.getInstance();
        Test s2 = Test.getInstance();
        Test s3 = Test.getInstance();
        System.out.println("Same reference for all three instances");
        System.out.println("--------------------------------------");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
