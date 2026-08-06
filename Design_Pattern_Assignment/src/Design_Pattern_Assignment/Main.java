package Design_Pattern_Assignment;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("===== Singleton Test =====");

        Runnable task = () -> {

            ConfigurationManager manager =
                    ConfigurationManager.getInstance();

            System.out.println(
                    Thread.currentThread().getName()
                            + " -> "
                            + manager.hashCode());

        };

        Thread t1 = new Thread(task);

        Thread t2 = new Thread(task);

        Thread t3 = new Thread(task);

        t1.start();

        t2.start();

        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("\n===== Factory Test =====");

        ConfigSource json =
                ConfigSourceFactory.createSource("json", "config.json");

        ConfigurationManager manager =
                ConfigurationManager.getInstance();

        manager.loadFromSource(json);

        manager.displayAllConfig();

        System.out.println();

        ConfigSource yaml =
                ConfigSourceFactory.createSource("yaml", "config.yaml");

        manager.loadFromSource(yaml);

        manager.displayAllConfig();

        System.out.println();

        ConfigSource properties =
                ConfigSourceFactory.createSource(
                        "properties",
                        "application.properties"
                );

        manager.loadFromSource(properties);

        manager.displayAllConfig();

        System.out.println();

        System.out.println("Database = "
                + manager.getConfig("database"));

        manager.setConfig("version", "1.0");

        System.out.println("Version = "
                + manager.getConfig("version"));

        System.out.println();

        manager.refreshConfig();

        manager.displayAllConfig();

        System.out.println();

        System.out.println("===== Factory Cache Test =====");

        ConfigSource json2 =
                ConfigSourceFactory.createSource("json", "config.json");

        System.out.println(json == json2);

    }
}