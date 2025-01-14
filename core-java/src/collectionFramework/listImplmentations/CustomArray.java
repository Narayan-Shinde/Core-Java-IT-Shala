package collectionFramework.listImplmentations;

import java.util.Arrays;

public class CustomArray {

    Object[] values;
    int capacity = 10;
    int length = 0;

    public CustomArray() {
        values = new Object[capacity];
    }

    public void add(Object object) {
        if (length < capacity) {
            values[length++] = object;
        } else {
            capacity = capacity * 2;
            Object[] temp = new Object[capacity];
            for (int index = 0; index < values.length; index++) {
                temp[index] = values[index];
            }
            temp[length++] = object;
            values = temp;
        }
    }

    public void printValues() {
        for (int index = 0; index < length; index++) {
            System.out.print(values[index] + " ");
        }
    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "values=" + Arrays.toString(values) +
                ", capacity=" + capacity +
                ", length=" + length +
                '}';
    }
}
