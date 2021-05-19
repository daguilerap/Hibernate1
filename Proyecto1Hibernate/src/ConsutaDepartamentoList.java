import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class ConsutaDepartamentoList {
    public static void main(String[] args) {
        Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from Departamentos");

        List<Departamentos> dep = query.list();

        for (Departamentos depp : dep) {
            System.out.println("Número de departamento " + depp.getNumdept());
            System.out.println("Nombre departamento " + depp.getNombredept());
            System.out.println("Localidad: " + depp.getLocal());

            System.out.println("===================");
        }

       session.close();
    }
}
