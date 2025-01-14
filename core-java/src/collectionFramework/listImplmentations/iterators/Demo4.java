package collectionFramework.listImplmentations.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<String> studentNameList = new ArrayList<>();
        studentNameList.add("kundan");
        studentNameList.add("arti");
        studentNameList.add("pranay");
        studentNameList.add("ashish");
        studentNameList.add("vaishnavi");
        studentNameList.add("satish");
        studentNameList.add("vishwadeep");
        studentNameList.add("jairaj");
        studentNameList.add("sushant");
        studentNameList.add("ajay");
        studentNameList.add("mahetab");

        //cursors -> Iterator, ListIterator, Enumration

        Iterator<String> iterator = studentNameList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
