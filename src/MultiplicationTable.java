public class MultiplicationTable {
public MultiplicationTable(){}
    public synchronized void multiply(int n) throws InterruptedException {
        System.out.println("Multiplication by "+n+" started");
        for(int i=1; i<=12; i++){
            System.out.println(i+"*"+n+" ="+i*n);
            Thread.sleep(1000);
        }
        System.out.println("Multiplication by "+n+" completed");
    }
}
