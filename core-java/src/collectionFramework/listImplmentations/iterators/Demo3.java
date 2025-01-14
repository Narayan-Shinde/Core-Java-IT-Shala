package collectionFramework.listImplmentations.iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Demo3 {
    public static void main(String[] args) {
        List<String> studentNameList = new ArrayList<>();
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


        System.out.println("before removal");
        studentNameList.forEach(System.out::println);

        // remove elements whose name starts with s

        for (int index = 0; index < studentNameList.size(); index++) {
            if (studentNameList.get(index).startsWith("s")) {
                studentNameList.remove(index);
            }
        }


        System.out.println("after removal");
        studentNameList.forEach(System.out::println);


    }
}
