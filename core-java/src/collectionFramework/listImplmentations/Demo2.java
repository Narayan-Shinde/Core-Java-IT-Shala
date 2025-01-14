package collectionFramework.listImplmentations;

import java.util.Iterator;

public class Demo2 {
    public static void main(String[] args) {
        class A implements Iterable {

            @Override
            public Iterator iterator() {
                Iterator iterator = new Iterator() {
                    @Override
                    public boolean hasNext() {
                        return false;
                    }

                    @Override
                    public Object next() {
                        return null;
                    }
                };
                return iterator;
            }
        }
        A a = new A();
        Iterator iterator = a.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

    }
}
