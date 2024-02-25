/*
 * Singleton
 * - work with database. Create a connection pool to access the database while reusing the same connection for all clients
 *
 */

class Singleton {
    private static Singleton singleObject; // a reference to the object of the class

    // private constructor restricting object creation outside the class
    private Singleton() {
        // constructor
    }

    // return reference to the only object of the Singleton class
    // static: can be accessed using class name
    // below is an example
    // public static Singleton getInstance() {

    // }
}

class Database {
    private static Database dbObject;

    private Database() {
    }

    public static Database getInstance() {
        if (dbObject == null) {
            dbObject = new Database();
        }

        return dbObject;
    }

    public void getConnection() {
        System.out.println("You are now connected to the database");
    }
}

public class SingletonExample {
    public static void main(String[] args) {
        Database db1;

        db1 = Database.getInstance();

        db1.getConnection();
    }
}
