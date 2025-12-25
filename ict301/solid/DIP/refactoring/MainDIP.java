public class MainDIP {
    public static void main(String[] args) {
        Database database;
        
        database = new MySQLDatabase();
        OrderProcessor order = new OrderProcessor(database);
        order.processOrder("Order 123");
        
        database = new MongoDBDatabase();
        OrderProcessor order1 = new OrderProcessor(database);
        order1.processOrder("Order 456");
        
        // Version corrigée : pas de référence à PostgreSQLDatabase
    }
}