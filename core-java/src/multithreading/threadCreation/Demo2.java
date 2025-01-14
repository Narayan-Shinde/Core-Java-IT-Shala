package multithreading.threadCreation;

public class Demo2 {
    public static void main(String[] args) {
        class Addition {
            long start;
            long end;
            long sum = 0L;

            Addition(long start, long end) {
                this.start = start;
                this.end = end;
            }

            void add() {
                for (long i = start; i <= end; i++) {
                    sum += i;
                }
            }

        }
        Addition addition = new Addition(0L, 100000000000L);
        long startTime = System.currentTimeMillis();
        addition.add();
        System.out.println("Sum is " + addition.sum);
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to complete the addition " + (endTime - startTime));

    }
}
