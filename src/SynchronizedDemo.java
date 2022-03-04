public class SynchronizedDemo {
    public static void main(String[] args) {
        MultiplicationTable mult = new MultiplicationTable();
//        Executor executor1 = new Executor("Multiply by "+2, 2, mult);
//        Executor executor2 = new Executor("Multiply by "+3, 3, mult);
        FirstMultiplier firstMultiplier = new FirstMultiplier("Multiply by "+2, 2, mult);
        SecondMultiplier secondMultiplier = new SecondMultiplier("Multiply by "+7, 7, mult);
        System.out.println("Thread action start");
        firstMultiplier.start();
        secondMultiplier.start();
    }
}
