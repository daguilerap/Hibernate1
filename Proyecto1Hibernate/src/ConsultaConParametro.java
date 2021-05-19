import org.hibernate.Session;
import org.hibernate.query.Query;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ConsultaConParametro {


    public static void main(String[] args) throws ParseException {
        Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession();
        session.beginTransaction();
        Boolean salir = true;

        while (salir) {
            System.out.println("\tMenu");
            System.out.println("===================");
            System.out.println("1) Empleado cuyo número de empleado es 7788.");
            System.out.println("2) Empleado con oficio Director y departamento 10");
            System.out.println("3) Empleados cuyo número de departamento sea 10 o 20.");
            System.out.println("4) Empleados cuya fecha de alta es 1991-12-03.");

            Scanner sc = new Scanner(System.in);
            int menu = sc.nextInt();

            switch (menu) {
                case (1):
                    Query query = session.createQuery("from Empleados as emp where emp.numemp=:num");
                    query.setParameter("num",7788);

                    List<Empleados> empleados = query.list();


                    for (Empleados empp : empleados) {
                        System.out.println("===================");
                        System.out.println("Número de empleado: " + empp.getNumemp());
                        System.out.println("Apellido: " + empp.getApe());
                        System.out.println("Oficio: " + empp.getOf());
                        System.out.println("direccion: " + empp.getDir());
                        System.out.println("Fecha: " + empp.getFecha());
                        System.out.println("Salario: " + empp.getSalar());
                        System.out.println("Comision: " + empp.getComis());
                        System.out.println("Nº Departamento: " + empp.getNumdpt());
                        System.out.println("===================");
                    }

                    break;

                case (2):

                    Query query2 = session.createQuery("Select emp from Empleados emp where emp.numdpt=? and emp.of=?");
                    query2.setInteger(0,10);
                    query2.setString(1,"Director");

                    List<Empleados> empleados2 = query2.list();


                    for (Empleados empp : empleados2) {
                        System.out.println("===================");
                        System.out.println("Número de empleado: " + empp.getNumemp());
                        System.out.println("Apellido: " + empp.getApe());
                        System.out.println("Oficio: " + empp.getOf());
                        System.out.println("direccion: " + empp.getDir());
                        System.out.println("Fecha: " + empp.getFecha());
                        System.out.println("Salario: " + empp.getSalar());
                        System.out.println("Comision: " + empp.getComis());
                        System.out.println("Nº Departamento: " + empp.getNumdpt());
                        System.out.println("===================");
                    }

                    break;
                case (3):
                    Query quer3 = session.createQuery("from Empleados as emp where emp.numdpt=:num or emp.numdpt=:num2");
                    quer3.setParameter("num",10);
                    quer3.setParameter("num2",20);

                    List<Empleados> empleados3 = quer3.list();


                    for (Empleados empp : empleados3) {
                        System.out.println("===================");
                        System.out.println("Número de empleado: " + empp.getNumemp());
                        System.out.println("Apellido: " + empp.getApe());
                        System.out.println("Oficio: " + empp.getOf());
                        System.out.println("direccion: " + empp.getDir());
                        System.out.println("Fecha: " + empp.getFecha());
                        System.out.println("Salario: " + empp.getSalar());
                        System.out.println("Comision: " + empp.getComis());
                        System.out.println("Nº Departamento: " + empp.getNumdpt());
                        System.out.println("===================");
                    }

                    break;

                case (4):
                    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
                    Date feci=date.parse("1991-12-03");
                    Query quer4 = session.createQuery("from Empleados as emp where emp.fecha=:fec");
                    quer4.setDate("fec",feci);


                    List<Empleados> empleados4 = quer4.list();


                    for (Empleados empp : empleados4) {
                        System.out.println("===================");
                        System.out.println("Número de empleado: " + empp.getNumemp());
                        System.out.println("Apellido: " + empp.getApe());
                        System.out.println("Oficio: " + empp.getOf());
                        System.out.println("direccion: " + empp.getDir());
                        System.out.println("Fecha: " + empp.getFecha());
                        System.out.println("Salario: " + empp.getSalar());
                        System.out.println("Comision: " + empp.getComis());
                        System.out.println("Nº Departamento: " + empp.getNumdpt());
                        System.out.println("===================");
                    }

                    break;
                case(5):
                    salir=false;
                    session.close();
                    break;

            }
        }
    }
}
