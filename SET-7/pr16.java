class SumThread extends Thread {
    private int start, end;
    private long sum;
    public SumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }
    @Override
    public void run() {
        sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println("Sum from " + start + " to " + end + " = " + sum);
    }
    public long getSum() {
        return sum;
    }
}
public class ParallelSum {
    public static void main(String[] args) {
        SumThread t1 = new SumThread(1, 1000);
        SumThread t2 = new SumThread(1001, 2000);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e);
        }
        long totalSum = t1.getSum() + t2.getSum();
        System.out.println("Final Total Sum = " + totalSum);
    }
}
