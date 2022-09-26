package design_patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setOs("Android").setScreenSize(10).getPhone();

        System.out.println(p);
    }
}
