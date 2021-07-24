package Modelo;

import Modelo.Cuota;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-07-17T19:14:33")
@StaticMetamodel(CronogramaPagos.class)
public class CronogramaPagos_ { 

    public static volatile SingularAttribute<CronogramaPagos, Date> segundaFechaPago;
    public static volatile SingularAttribute<CronogramaPagos, Integer> idCronograma;
    public static volatile ListAttribute<CronogramaPagos, Cuota> cuotas;
    public static volatile SingularAttribute<CronogramaPagos, Date> primerFechaPago;

}