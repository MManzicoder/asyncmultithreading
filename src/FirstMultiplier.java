public class FirstMultiplier implements Runnable{
    String name;
    Thread t = null;
    MultiplicationTable multp;
    int number;
    public FirstMultiplier(){}
    public FirstMultiplier(String name,int number, MultiplicationTable mlt){
        this.name = name;
        this.number = number;
        this.multp = mlt;
    }

    @Override
    public void run() {
//        super.run();
        try {

            multp.multiply(number);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        if(t == null){
            t = new Thread(this);
            t.start();
        }
//        t.start();

    }
}
