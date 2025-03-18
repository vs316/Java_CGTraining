public class AppConfig {
    static String appName;
    static String version;
    // Static block
    static{
        appName="MyCoolApp";
        version="1.0.0";
        System.out.println("Static block executed: AppConfig initialized");
    }
}
