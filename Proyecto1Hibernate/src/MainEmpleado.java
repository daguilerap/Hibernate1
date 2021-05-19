import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainEmpleado {



    public static void main(String[] args) throws ParseException {
        Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession();
        session.beginTransaction();

        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        Empleados emp = new Empleados(4455, "PÉREZ", "VENDEDOR",7499, date.parse("2021-02-09"),(float)1500,(float)10,10);

        session.save(emp);
        session.getTransaction().commit();
        System.out.println("Great! was saved");

       HibernateUtil.INSTANCE.cerrarSessionFactory();
        System.out.println("Cerrando la session...");
    }
}
