package entidades;

import entidades.Cargo;
import entidades.Estcivil;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-07-14T19:15:16")
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile SingularAttribute<Empleado, Date> fecha;
    public static volatile SingularAttribute<Empleado, Integer> codigo;
    public static volatile SingularAttribute<Empleado, String> cedula;
    public static volatile SingularAttribute<Empleado, String> apellido;
    public static volatile SingularAttribute<Empleado, Cargo> codcargo;
    public static volatile SingularAttribute<Empleado, Estcivil> codestcivil;
    public static volatile SingularAttribute<Empleado, String> nombre;

}