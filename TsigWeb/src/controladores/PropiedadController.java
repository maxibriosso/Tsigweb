package controladores;


import javax.ejb.EJB;
import javax.ejb.Stateless;

import persistencia.IPropiedadDAO;
import controladores.IPropiedadController;
import dominio.Casa;

@Stateless
public class PropiedadController implements IPropiedadController{

	@EJB
	private IPropiedadDAO PropiedadDAO;
	
	

	public boolean guardarCasa(int IdGeom,int idCasa,String titulo, int direccion,String barrio,String tipoProp, int cantBanios, int cantCuartos,boolean piscina, boolean garage) {
		try{
					
			Casa c = new Casa(IdGeom, titulo, direccion, barrio, tipoProp, cantBanios, cantCuartos, piscina, garage);
			return PropiedadDAO.guardarPropiedad(c);				

		}		
			
		catch(Exception e){
			e.printStackTrace();
			return false;
		}		
		
	}

}
