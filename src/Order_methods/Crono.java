package Order_methods;

public class Crono {
    private long starTime;

    public Crono() {
        this.starTime = System.currentTimeMillis();;
    }

    public void end(){
        long endTime = System.currentTimeMillis();
        double elapsedTimeInSeconds = (endTime - this.starTime) / 1000.0;
        System.out.println("Execution time: " + elapsedTimeInSeconds + " seconds");
    }

    public static void helloWord(){
        System.out.println("hello word");
    }
}
