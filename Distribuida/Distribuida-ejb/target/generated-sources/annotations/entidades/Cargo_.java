package entidades;

import entidades.Empleado;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-07-14T19:15:16")
@StaticMetamodel(Cargo.class)
public class Cargo_ { 

    public static volatile SingularAttribute<Cargo, Integer> codigo;
    public static volatile CollectionAttribute<Cargo, Empleado> empleadoCollection;
    public static volatile SingularAttribute<Cargo, String> nombre;

}