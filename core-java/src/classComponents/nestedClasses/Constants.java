package classComponents.nestedClasses;

public class Constants {
    static class Mysql {
        static class Dev {
            static String username = "dev123";
            static String password = "dev123@pass";
        }

        static class QA {
            static String username = "qa123";
            static String password = "qa123@pass";
        }

        static class Prod {
            static String username = "prod123";
            static String password = "prod@pass";
        }
    }
}
