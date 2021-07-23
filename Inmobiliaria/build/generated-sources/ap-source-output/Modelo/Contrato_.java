package Modelo;

import Modelo.Boleta;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-07-05T18:06:19")
@StaticMetamodel(Contrato.class)
public class Contrato_ { 

    public static volatile SingularAttribute<Contrato, Double> recargoFijo;
    public static volatile SingularAttribute<Contrato, Double> recargoProporcional;
    public static volatile SingularAttribute<Contrato, Date> fechaContrato;
    public static volatile SingularAttribute<Contrato, Double> comision;
    public static volatile SingularAttribute<Contrato, Integer> idContrato;
    public static volatile ListAttribute<Contrato, Boleta> boletas;

}