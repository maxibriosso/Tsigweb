package controladores;

import javax.ejb.Local;

@Local
public interface IPropiedadController {

	public boolean guardarCasa(String usuario,int IdGeom,int idCasa,String titulo,int direccion,String barrio,String tipoProp, int cantBanios, int cantCuartos,boolean piscina, boolean garage);
}
