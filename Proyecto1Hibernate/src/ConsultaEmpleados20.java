import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class ConsultaEmpleados20 {

    public static void main(String[] args) {
        Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from Empleados as emp where emp.numdpt=20");
        List<Empleados> emp = query.list();
        System.out.println("Trabajadores del departamento 20");
        for (Empleados empp : emp) {
            System.out.println("===================");
            System.out.println("Apellido: " + empp.getApe());
            System.out.println("Salario: " + empp.getSalar());
            System.out.println("===================");
        }
        session.close();
    }
}
