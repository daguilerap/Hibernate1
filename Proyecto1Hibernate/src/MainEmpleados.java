import org.hibernate.Session;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainEmpleados {

    public static void main(String[] args) throws ParseException {


        SimpleDateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");






        Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession();
        session.beginTransaction();

        empleado emp1 = new empleado(4455,"Perez","Vendedor",7499,fecha.parse("2021-02-03"),1500,10,10);
        session.save(emp1);
        session.getTransaction().commit();
        System.out.println("guardao");

        HibernateUtil.INSTANCE.cerrarSessionFactory();
        System.out.println("Cerrando la session...");
    }
}
