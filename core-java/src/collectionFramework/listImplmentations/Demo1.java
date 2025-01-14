package collectionFramework.listImplmentations;

public class Demo1 {
    public static void main(String[] args) {
        CustomArray customArray = new CustomArray();
        customArray.add(10);
        customArray.add(20);
        customArray.add(30);
        customArray.add(40);
        customArray.add(10.40f);
        customArray.add(true);
        customArray.add("abc");
        customArray.printValues();

    }
}
