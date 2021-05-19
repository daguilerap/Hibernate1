import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class Crud {

    public static void main(String[] args) {
        Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession();
        session.beginTransaction();

       // Departamentos dep = new Departamentos(70,"Informatica","Toledo");
        //comentado para que no se reproduzca, funcional
        //session.save(dep);
        //session.getTransaction().commit();
        Empleados empleado=session.load(Empleados.class,7369);//carga valores de la tabla en el objeto
        session.delete(empleado);
        session.getTransaction().commit();
        /*
        Empleados empleado=session.load(Empleados.class,7499);//carga valores de la tabla en el objeto
        empleado.setSalar(2530);
        empleado.setComis(25);
        session.update(empleado);
        session.getTransaction().commit();

         */
        session.close();





    }

}
