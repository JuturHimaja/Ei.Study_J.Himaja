package main;

import singleton.Config;

public class SingletonMain {
    public static void main(String[] args) {
        Config config = Config.getInstance();
        System.out.println("App Name: " + config.getAppName());
        System.out.println("Version: " + config.getVersion());
    }
}
