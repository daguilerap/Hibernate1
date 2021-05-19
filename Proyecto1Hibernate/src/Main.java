import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Main {

    public static void main(String[] args) {
        Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession();

        session.beginTransaction();
        Departamentos dep = new Departamentos(60, "MARKETING", "GUADALAJARA");

        session.save(dep);
        session.getTransaction().commit();
        System.out.println("Great! was saved");

        HibernateUtil.INSTANCE.cerrarSessionFactory();
        System.out.println("Cerrando la session...");
    }
}




