package co.edu.uniquindio.poo;
    
public class Main{
    public static void main(String[] args) {

    Connection connectionWithBuilder =Connection.builder()
        .username("Carlos")
        .passWord("1682")
        .host("1928")
        .build();
        
    
    Connection connectionWithBuilder1 = Connection.builder()
            .username("bartolo")
            .passWord("7218")
            .host("1728")
            .build();


    User user1 = new User("2839", "Rosa", connectionWithBuilder1);
    User user2 = new User("2910", "Nicolas", connectionWithBuilder1);

    User user3 = new User("3890", "Juan", connectionWithBuilder);

    // Verificar que user1 y user2 compartan la misma conexión
    if (user1.getConnection() == user2.getConnection()) {
        System.out.println("Conexion existente");
    } else {
        System.out.println("Nueva conexion creada");
    }

    // Verificar que user3 tenga una conexión diferente a user1 y user2
    if (user3.getConnection() != user1.getConnection() && user3.getConnection() != user2.getConnection()) {
        System.out.println("Nueva conexion creada para " + user3.getName());
    } else {
        System.out.println("Conexion existente");
    }
}
}



        


