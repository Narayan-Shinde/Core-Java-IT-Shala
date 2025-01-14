package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static Configuration cfg = new Configuration();

    static {
        cfg.configure("hibernate.cfg.xml");
    }

    public static SessionFactory getSessionFactory() {
        SessionFactory sf = cfg.buildSessionFactory();
        return sf;
    }
}
