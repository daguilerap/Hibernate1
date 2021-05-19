import org.hibernate.Session;
import org.hibernate.query.Query;

import java.awt.*;
import java.util.List;
import java.util.Scanner;

public class UnicoRsultado {

    public static void main(String[] args) {
        Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession();
        session.beginTransaction();
        Boolean salir = true;

        while (salir) {
            System.out.println("\tMenu");
            System.out.println("===================");
            System.out.println("1) Departamento 10");
            System.out.println("2) Departamento Ventas");
            System.out.println("3) Salir");

            Scanner sc = new Scanner(System.in);
            int menu = sc.nextInt();

            switch (menu) {
                case (1):
                    Query query = session.createQuery("from Departamentos as dep where dep.numdept = 10");

                    List<Departamentos> dep = query.list();
                    Departamentos dep1 =(Departamentos) query.uniqueResult();

                    System.out.println("Número de departamento: " + dep1.getNumdept());
                    System.out.println("Nombre departamento: " + dep1.getNombredept());
                    System.out.println("Localidad: " + dep1.getLocal());

                    System.out.println("===================");


                    break;

                case (2):

                    Query query2 = session.createQuery("from Departamentos as dep where dep.nombredept = 'Ventas'");

                    Departamentos dep2 =(Departamentos) query2.uniqueResult();

                    System.out.println("Número de departamento: " + dep2.getNumdept());
                    System.out.println("Nombre departamento: " + dep2.getNombredept());
                    System.out.println("Localidad: " + dep2.getLocal());

                    System.out.println("===================");
                    break;

                case (3):
                    salir=false;
                    session.close();
                    break;

            }
        }
    }
}
