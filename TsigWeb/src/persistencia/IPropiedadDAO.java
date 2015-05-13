package persistencia;

import javax.ejb.Local;
import dominio.Casa;

@Local
public interface IPropiedadDAO {
	
	public boolean guardarPropiedad(Casa Casa);

}
