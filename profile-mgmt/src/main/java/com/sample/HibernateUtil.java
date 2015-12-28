package com.sample;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    public static final ThreadLocal<Session>   MAP = new ThreadLocal<> ();
    private static final SessionFactory sessionFactory;

    static {
        try {
            Configuration config=new Configuration();
            config.setProperties(System.getProperties());
            sessionFactory =  config.configure().buildSessionFactory();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {

        return sessionFactory;
    }

    public static Session currentSession() throws HibernateException {
        Session hibernateSession = (Session)MAP.get();
        // Open a new Session, if not exists
        if (hibernateSession == null || !hibernateSession.isOpen() || !hibernateSession.isConnected()) {
            hibernateSession = sessionFactory.openSession();
            MAP.set(hibernateSession);
        }
        return hibernateSession;
    }
}
