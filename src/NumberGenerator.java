public class NumberGenerator implements Runnable {
    int count;
    public NumberGenerator(int count){
        this.count= count;
    }
    @Override
    synchronized public void run() {
        try {
        for (int i=0;i<10;i++){
            System.out.println(i+" "+count);
        }
            Thread.sleep(100);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        NumberGenerator hihi =new NumberGenerator(1);
        NumberGenerator hihi2 =new NumberGenerator(2);
        Thread obj1 = new Thread(hihi);
        Thread obj2 = new Thread(hihi2);
        obj1.start();
        obj1.join();
        obj2.start();

    }
}
