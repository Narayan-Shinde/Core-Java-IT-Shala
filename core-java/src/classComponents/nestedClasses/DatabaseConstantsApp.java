package classComponents.nestedClasses;

public class DatabaseConstantsApp {
    public static void main(String[] args) {
        System.out.println("Mysql Dev credentials");
        System.out.println(Constants.Mysql.Dev.username);
        System.out.println(Constants.Mysql.Dev.password);

        System.out.println("Mysql QA credentials");
        System.out.println(Constants.Mysql.QA.username);
        System.out.println(Constants.Mysql.QA.password);

        System.out.println("Mysql Prod credentials");
        System.out.println(Constants.Mysql.Prod.username);
        System.out.println(Constants.Mysql.Prod.password);
    }
}
