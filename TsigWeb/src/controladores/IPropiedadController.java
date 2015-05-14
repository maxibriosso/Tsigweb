package controladores;

import javax.ejb.Local;

@Local
public interface IPropiedadController {
	
	public boolean guardarPropiedad(int idProp, String direccion,String barrio,String tipoProp, int cantBanios, int cantCuartos,boolean piscina, boolean garage);
}
