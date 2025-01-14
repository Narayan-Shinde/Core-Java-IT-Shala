package java8Features;

public class Demo12 {
    public static void main(String[] args) {

        @FunctionalInterface
        interface NumberProcessor {
            int add(int number1, int number2);
        }
        //1. traditional way
        class NumberProcessorImpl implements NumberProcessor {
            @Override
            public int add(int number1, int number2) {
                return number1 + number2;
            }
        }
        NumberProcessor numberProcessor1 = new NumberProcessorImpl();
        System.out.println(numberProcessor1.add(100, 200));


        //2. anonymous class way
        NumberProcessor numberProcessor2 = new NumberProcessor() {
            @Override
            public int add(int number1, int number2) {
                return number1 + number2;
            }
        };
        System.out.println(numberProcessor2.add(100, 200));

        //3. lambda expression way
        NumberProcessor numberProcessor3 = (number1, number2) -> number1 + number2;
        System.out.println(numberProcessor3.add(100, 200));

        class Integer {
             static int sum(int a, int b) {
                return a + b;
            }

        }

        //4. method reference way
        Integer reference = new Integer();
        NumberProcessor numberProcessor4 = Integer::sum;
        System.out.println(numberProcessor4.add(100, 200));

    }


}
