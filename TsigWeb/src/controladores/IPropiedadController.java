package controladores;

import javax.ejb.Local;

@Local
public interface IPropiedadController {
	
	public boolean guardarCasa(int idCasa, String direccion,String barrio,String tipoProp, int cantBa�os, int cantCuartos,boolean piscina, boolean garage);
}
