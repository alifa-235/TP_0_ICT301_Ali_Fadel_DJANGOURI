class HumanWorker implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Les humains travaillent");
    }
    
    @Override
    public void eat() {
        System.out.println("Les humains mangent");
    }
}