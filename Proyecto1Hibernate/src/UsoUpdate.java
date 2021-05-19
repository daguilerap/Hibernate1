import org.hibernate.Session;
import org.hibernate.query.Query;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import java.util.List;

public class UsoUpdate {
    public static void main(String[] args) {

        Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession();
        session.beginTransaction();
        Scanner sc = new Scanner(System.in);
        int Menu;
        boolean seguir =true;
        System.out.println("\t Menu");
        System.out.println("=====================");
        System.out.println("1) cambiar al salario del Gil a 1000");
        System.out.println("2) Borra empleados del departamento 20");
        System.out.println("2) Inserta empleado");

        while(seguir) {
            Menu=sc.nextInt();

            switch (Menu){
                case 1:
                Query query = session.createQuery("update Empleados as emp set emp.salar=1000 where emp.ape='GIL'");
                query.executeUpdate();
                session.getTransaction().commit();
                break;
                case 2:
                    Query query2 = session.createQuery("delete from Empleados as emp where emp.numdpt=20");
                    query2.executeUpdate();
                    session.getTransaction().commit();
                case 3:


                    Query query3 = session.createSQLQuery("insert into Departamentos (dept_no,dnombre,loc) VALUES (80,'Ejemplo','baracaldo')");
                    query3.executeUpdate();
                    session.getTransaction().commit();
                    break;
                case 4:
                    session.close();
                    seguir=false;
                    break;



            }

        }
    }

    }


