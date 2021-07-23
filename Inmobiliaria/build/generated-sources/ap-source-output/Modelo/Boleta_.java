package Modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-07-05T18:06:19")
@StaticMetamodel(Boleta.class)
public class Boleta_ { 

    public static volatile SingularAttribute<Boleta, Double> recargoFijo;
    public static volatile SingularAttribute<Boleta, String> descripcion;
    public static volatile SingularAttribute<Boleta, Double> recargoProporcional;
    public static volatile SingularAttribute<Boleta, Double> total;
    public static volatile SingularAttribute<Boleta, Date> fechaBoleta;
    public static volatile SingularAttribute<Boleta, Integer> idBoleta;
    public static volatile SingularAttribute<Boleta, Double> comision;
    public static volatile SingularAttribute<Boleta, Double> montoBase;
    public static volatile SingularAttribute<Boleta, Boolean> estadoPago;

}