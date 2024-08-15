package InterviweQuestion;

public class OddEvenPrinter {
    private static final Object lock = new Object();
    private static volatile int number = 1;
    private static final int MAX_NUMBER = 100;

    public static void main(String[] args) {
        Thread oddThread = new Thread(new OddPrinter());
        Thread evenThread = new Thread(new EvenPrinter());

        oddThread.start();
        evenThread.start();
    }

    static class OddPrinter implements Runnable {
        @Override
        public void run() {
            while (number <= MAX_NUMBER) {
                synchronized (lock) {
                    if (number % 2 != 0) {
                        System.out.println("Odd: " + number);
                        number++;
                        lock.notify(); // Notify the other thread to wake up
                    } else {
                        try {
                            lock.wait(); // Wait for the other thread to print
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    static class EvenPrinter implements Runnable {
        @Override
        public void run() {
            while (number <= MAX_NUMBER) {
                synchronized (lock) {
                    if (number % 2 == 0) {
                        System.out.println("Even: " + number);
                        number++;
                        lock.notify(); // Notify the other thread to wake up
                    } else {
                        try {
                            lock.wait(); // Wait for the other thread to print
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
