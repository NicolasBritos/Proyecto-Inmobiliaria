package Modelo;

import Modelo.Garante;
import Modelo.Inmueble;
import Modelo.Locador;
import Modelo.Locatario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-07-05T18:06:19")
@StaticMetamodel(ContratoAlquiler.class)
public class ContratoAlquiler_ extends Contrato_ {

    public static volatile SingularAttribute<ContratoAlquiler, Double> aranceles;
    public static volatile SingularAttribute<ContratoAlquiler, Date> segundaFechaPago;
    public static volatile SingularAttribute<ContratoAlquiler, Integer> duracion;
    public static volatile SingularAttribute<ContratoAlquiler, Inmueble> inmueble;
    public static volatile SingularAttribute<ContratoAlquiler, Locatario> locatario;
    public static volatile SingularAttribute<ContratoAlquiler, Garante> garante;
    public static volatile SingularAttribute<ContratoAlquiler, Double> montoAlquiler;
    public static volatile SingularAttribute<ContratoAlquiler, Locador> locador;
    public static volatile SingularAttribute<ContratoAlquiler, Date> primerFechaPago;

}