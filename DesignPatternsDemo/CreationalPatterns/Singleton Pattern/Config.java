package singleton;

public class Config {
    private static Config instance;
    private String appName;
    private String version;

    private Config() {
        // private constructor to prevent instantiation
        this.appName = "Ei.study EdTech Platform";
        this.version = "1.0.0";
    }

    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    public String getAppName() {
        return appName;
    }

    public String getVersion() {
        return version;
    }
}
