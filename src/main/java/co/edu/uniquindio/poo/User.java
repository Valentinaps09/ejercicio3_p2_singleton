package co.edu.uniquindio.poo;

public class User {

    private final String id;
    private final String name;
    private Connection connection;
    
    
    public User(String id, String name, Connection connection) {
        this.id = id;
        this.name = name;
        this.connection = connection;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Connection getConnection() {
        return connection;
    }
    
}


