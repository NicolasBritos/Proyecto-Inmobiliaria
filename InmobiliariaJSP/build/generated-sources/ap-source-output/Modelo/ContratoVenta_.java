package Modelo;

import Modelo.CronogramaPagos;
import Modelo.Inmueble;
import Modelo.Locador;
import Modelo.Locatario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-07-17T19:14:33")
@StaticMetamodel(ContratoVenta.class)
public class ContratoVenta_ extends Contrato_ {

    public static volatile SingularAttribute<ContratoVenta, CronogramaPagos> cronograma;
    public static volatile SingularAttribute<ContratoVenta, Inmueble> inmueble;
    public static volatile SingularAttribute<ContratoVenta, Locatario> locatario;
    public static volatile SingularAttribute<ContratoVenta, Locador> locador;
    public static volatile SingularAttribute<ContratoVenta, Double> montoVenta;

}