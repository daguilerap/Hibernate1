import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hibernate.transform.Transformers;
import org.w3c.dom.ls.LSOutput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Usofunciones {

    public static void main(String[] args) throws ParseException {
        Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession();
        session.beginTransaction();
        Boolean salir = true;

        while (salir) {
            System.out.println("\tMenu");
            System.out.println("===================");
            System.out.println("1) Mostar el salario medio de los empleados.");
            System.out.println("2) Mostrar el salario medio y el número de empleados");
            System.out.println("3) Salario medio y número de empleados por departamento");
            System.out.println("4) Salir");

            Scanner sc = new Scanner(System.in);
            int menu = sc.nextInt();

            switch (menu) {
                case (1):
                    Query query = session.createQuery("select  avg(emp.salar)from Empleados as emp ");

                    System.out.println("Salario medio " +query.uniqueResult());

                    break;

                case (2):

                    Query query2 = session.createQuery("select count(*),avg(emp.salar)from Empleados as emp ");

                    List avg2=query2.list();
                    Iterator it2 = avg2.iterator();
                    Object[] obj = new Object[0];

                    while(it2.hasNext())
                    {
                         obj= (Object[]) it2.next();
                        System.out.println("Número de empleados "+ obj[0]);
                        System.out.println("Salario medio "+ obj[1]);
                    }



                    break;
                case (3):
                    Query query3 = session.createQuery("select emp.numdpt, count(*),avg(emp.salar)from Empleados as emp group by emp.numdpt");

                    List avg3=query3.list();
                    Iterator it3 = avg3.iterator();
                    Object[] obj2 = new Object[0];

                    while(it3.hasNext())
                    {
                        obj2= (Object[]) it3.next();
                        System.out.println("===========================");
                        System.out.println("El departamento " + obj2[0]);
                        System.out.println("Tiene "+obj2[1]+" empleados");
                        System.out.println("Su salario medio es de "+obj2[2]);
                        System.out.println("===========================");

                    }

                    break;

                case(4):
                    salir=false;
                    session.close();
                    break;

            }
        }
    }
}
