package exercise;

public class Exercise3 {

    public static void main(String[] args) {
        javaVersion();
    }

    public static void javaVersion() {
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + Runtime.version());
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor Url: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));
    }
}
