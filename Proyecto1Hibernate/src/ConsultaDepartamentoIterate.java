import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.Iterator;
import java.util.List;

public class ConsultaDepartamentoIterate {

    public static void main(String[] args) {
        Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from Departamentos");
        List<Departamentos> dep = query.list();
        Iterator<Departamentos> depiter  = dep.iterator();

        while (depiter.hasNext()) {
            Departamentos depp=depiter.next();
            System.out.println("Numero departamento " +depp.getNumdept());
            System.out.println("Nombre del departamento "+depp.getNombredept());
            System.out.println("Localidad "+ depp.getLocal());

            System.out.println("===================");
        }
        session.close();
    }
}
