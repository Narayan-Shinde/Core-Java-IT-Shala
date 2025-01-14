package multithreading.basics;

public class Demo2 {
    public static void main(String[] args) {

        @FunctionalInterface
        interface NumberProcessor {
            int process(int number);
        }

        class Demo {
            public static int square(int number) {
                return number * number;
            }
        }

        //1. traditional way
        class Square implements NumberProcessor {
            @Override
            public int process(int number) {
                return number * number;
            }
        }
        NumberProcessor numberProcessor = new Square();
        System.out.println("Square is " + numberProcessor.process(10));

        //2. anonymous class
        NumberProcessor numberProcessor2 = new NumberProcessor() {
            @Override
            public int process(int number) {
                return number * number;
            }
        };
        System.out.println("Square is " + numberProcessor2.process(10));

        //3. lambda expression
        NumberProcessor numberProcessor3 = number -> number * number;
        System.out.println("Square is " + numberProcessor3.process(10));

        //4. Method reference
        NumberProcessor numberProcessor4 = Demo::square;
        System.out.println("Square is " + numberProcessor4.process(10));


    }
}
