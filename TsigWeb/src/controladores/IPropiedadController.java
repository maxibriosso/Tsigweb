package controladores;

import javax.ejb.Local;

@Local
public interface IPropiedadController {
	
	public boolean guardarCasa(int idCasa, String direccion,String barrio,String tipoProp, int cantBaños, int cantCuartos,boolean piscina, boolean garage);
}
