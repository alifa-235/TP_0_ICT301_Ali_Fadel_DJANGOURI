public class OrderProcessor {
    private MySQLDatabase database;
    
    public OrderProcessor() {
        this.database = new MySQLDatabase(); // Problème : dépendance concrète
    }
    
    public void processOrder(String order) {
        database.save(order);
    }
}