import org.hibernate.Session;
import org.hibernate.query.Query;

import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class CargaDeObjetos {
    boolean exist = false;
    public static void main(String[] args) throws SQLException {


        Conexion connection = new Conexion();

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\t\t\tMENÚ:");
            System.out.println("\t\t1. MOSTRAR DATOS DEPARTAMENTO 20");
            System.out.println("\t\t2. COMPROBAR SI EXISTE DEPARTAMENTO 11");
            System.out.println("\t\t3. MOSTRAR DATOS DEPARTAMENTO 10 CON EMPLEADOS");
            System.out.println("\t\t4. MOSTRAR EMPLEADOS DEPARTAMENTO 10\n");

            System.out.print("\tElija una opción: ");
            opcion =  sc.nextInt();


            switch (opcion) {
                case 1:
                    /*
                    Statement st = connection.getConnection().createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM departamentos where dept_no =20 ");
                    while (rs.next()) {
                        System.out.println("ID: " + rs.getInt("dept_no"));
                        System.out.println("NOMBRE: " + rs.getString("dnombre"));
                        System.out.println("LUGAR: " + rs.getString("loc") + "\n");
                    }
                    */
                    Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession();
                    session.beginTransaction();
                    Query query = session.createQuery("select  d from Departamentos d WHERE d.id=20");


                    List<Departamentos> dep = query.list();


                    for (Departamentos depp : dep) {
                        System.out.println("Número de departamento " + depp.getNumdept());
                        System.out.println("Nombre departamento " + depp.getNombredept());
                        System.out.println("Localidad: " + depp.getLocal());

                        System.out.println("===================");
                    }
                    session.close();


                    break;

                case 2:

                    /*
                    String sql1 = "SELECT * FROM departamentos WHERE dept_no = 11";
                    Statement statement2 = connection.getConnection().createStatement();
                    statement2.execute(sql1);
                    ResultSet rs1 = statement2.getResultSet();
                    if (!rs1.isBeforeFirst()){
                        System.out.println("No se ha encontrado dicho departamento.\n");
                    }else{
                        System.out.println("Se ha encontrado dicho dapartamento.\n");
                    }

                    */
                    Session session2 = HibernateUtil.INSTANCE.getSessionFactory().openSession();
                    session2.beginTransaction();
                    String sql="SELECT d FROM Departamentos d WHERE d.id = 11";

                    Query query2 = session2.createQuery(sql);

                    List<Departamentos> dep2 = query2.list();
                    if(dep2.isEmpty()){
                        System.out.println("No se ha encontrado");
                    }else {
                        System.out.println("Si se ha encontrado");
                    }


                    session2.close();

                    break;

                case 3:
                    /*
                    Statement st2 = connection.getConnection().createStatement();
                    ResultSet rs2 = st2.executeQuery("SELECT departamentos.dept_no,departamentos.dnombre,departamentos.loc,empleados.apellido,empleados.salario FROM departamentos inner JOIN empleados ON departamentos.dept_no = empleados.dept_no WHERE departamentos.dept_no = 10");
                    int cont = 0;
                    int numdept = 0;
                    String nombredept = "";
                    try {
                        while (rs2.next()) {
                            System.out.println("Nombre empleado: " + rs2.getString("empleados.apellido"));
                            System.out.println("\t" + "Salario empleado: " + rs2.getFloat("empleados.salario") + "\n");
                            numdept = rs2.getInt("departamentos.dept_no");
                            nombredept = rs2.getString("departamentos.loc");
                            cont++;
                        }
                    } finally {
                        System.out.println("Nº Departamento: " + numdept);
                        System.out.println("\t" + "Nombre Departamento: " + nombredept);
                        System.out.println("\t" + "Número total de empleados: " + cont);
                    }*/


                    Session session3 = HibernateUtil.INSTANCE.getSessionFactory().openSession();
                    session3.beginTransaction();
                    String sql3="SELECT d FROM Departamentos d WHERE d.numdept = 10";
                    String sql4="SELECT d FROM Empleados d WHERE d.numdpt = 10";
                    int cont;
                    Query query3 = session3.createQuery(sql3);
                    Query query4 = session3.createQuery(sql4);

                    System.out.println("===================");

                    List<Departamentos> dep3 = query3.list();
                    List<Empleados> emp4 = query4.list();

                    System.out.println("===================");
                    for (Departamentos depp : dep3) {
                        System.out.println("Número de departamento " + depp.getNumdept());
                        System.out.println("Nombre departamento " + depp.getNombredept());
                        System.out.println("Localidad: " + depp.getLocal());

                        System.out.println("===================");
                    }
                    for (Empleados empp : emp4) {
                    System.out.println("Apellido empleado " + empp.getApe());
                    System.out.println("salario " + empp.getSalar());

                    System.out.println("===================");
                }




                    session3.close();


                    break;

                case 4:


                    Session session4 = HibernateUtil.INSTANCE.getSessionFactory().openSession();
                    session4.beginTransaction();
                    String sql5="SELECT e FROM Empleados e WHERE e.numdpt= 10";

                    Query query5 = session4.createQuery(sql5);
                    System.out.println("===================");
                    List<Empleados> emp = query5.list();
                    for(Empleados empp: emp){
                        System.out.println("Numero empleado " + empp.getNumemp());
                        System.out.println("Apellido " + empp.getApe());
                        System.out.println("oficio " + empp.getOf());
                        System.out.println("salario " + empp.getSalar());
                        System.out.println("fecha alta " + empp.getFecha());
                        System.out.println("comision " + empp.getComis());
                    }
                    session4.close();

                    break;
            }









        } while (opcion < 5);
    }
}