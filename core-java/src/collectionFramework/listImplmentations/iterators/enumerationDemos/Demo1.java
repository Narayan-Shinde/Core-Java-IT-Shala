package collectionFramework.listImplmentations.iterators.enumerationDemos;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Demo1 {
    public static void main(String[] args) {
        Vector vector = new Vector<>();
        vector.add("abc");
        vector.add("xyz");
        vector.add(123);
        vector.add(true);
        vector.add(10.4f);

        //1. traditional for loop
        System.out.println("1. traditional for loop");
        for (int index = 0; index < vector.size(); index++) {
            System.out.print(vector.get(index) + " ");
        }

        //2. enhanced for loop
        System.out.println("\n 2. enhanced for loop");
        for (Object temp : vector) {
            System.out.print(temp + " ");
        }
        //3. java 8 - forEach method
        System.out.println("\n 3. java 8 - forEach method");
        vector.forEach(x -> System.out.print(x + " "));


        //4. Cursor - Enumeration
        System.out.println("\n 4. Cursor - Enumeration ");
        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }

        //5. Cursor - Iterator
        System.out.println("\n 5. Cursor - Iterator");
        Iterator iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");

        }

        //6. Cursor - ListIterator
        System.out.println("\n 6. Cursor - ListIterator");
        ListIterator listIterator = vector.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }

    }
}
