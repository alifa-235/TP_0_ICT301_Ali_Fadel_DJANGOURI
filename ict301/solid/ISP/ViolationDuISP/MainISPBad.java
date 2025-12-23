public class MainISPBad {
    public static void main(String[] args) {
        Worker human = new HumanWorker();
        human.work();
        human.eat();
        
        Worker robot = new RobotWorker();
        robot.work();
        
        try {
            robot.eat(); // Va lancer une exception !
        } catch (UnsupportedOperationException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}