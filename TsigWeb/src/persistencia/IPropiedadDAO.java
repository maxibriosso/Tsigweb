package persistencia;

import javax.ejb.Local;
import dominio.Propiedad;

@Local
public interface IPropiedadDAO {
	
	public boolean guardarPropiedad(Propiedad propiedad);

}
