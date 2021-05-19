import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public enum HibernateUtil {
    INSTANCE
    ;


    public SessionFactory getSessionFactory () {
        return new Configuration().configure().buildSessionFactory();
    }

    public void cerrarSessionFactory() {
        getSessionFactory().close();
    }



}