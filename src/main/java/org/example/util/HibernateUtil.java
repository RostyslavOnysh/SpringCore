package org.example.util;

import com.mysql.cj.xdevapi.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory instance = initSessionFactory();

    private HibernateUtil() {
    }

    private static SessionFactory initSessionFactory() {
        return (SessionFactory) new Configuration().configure().buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return instance;
    }
}

