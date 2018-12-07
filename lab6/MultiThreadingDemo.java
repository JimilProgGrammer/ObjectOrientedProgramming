package lab6;

/**
 *
 * @author jimil
 */
public class MultiThreadingDemo {

    public static void main(String[] args) {
        System.out.println("Printing multiplication table for 2, 3 and 5");
        TableMultiplier for2 = new TableMultiplier(2);
        TableMultiplier for3 = new TableMultiplier(3);
        TableMultiplier for5 = new TableMultiplier(5);
        new Thread(for2).start();
        new Thread(for3).start();
        new Thread(for5).start();
        System.out.println("Exit");
    }
    
}

class TableMultiplier implements Runnable {
    
    private int multiplier;
    
    TableMultiplier(int a) {
        this.multiplier = a;
    }
    
    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println(multiplier + " x " + i + " = " + (multiplier*i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
}
