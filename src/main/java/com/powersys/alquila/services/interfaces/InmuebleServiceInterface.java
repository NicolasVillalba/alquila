/**
 * 
 */
package com.powersys.alquila.services.interfaces;

import java.util.List;
import com.powersys.alquila.dtos.InmuebleDTO;
import com.powersys.alquila.dtos.PropertyDTO;
import com.powersys.alquila.domain.Property;

/**
 * @author Amadeo F. Garcia
 * userGit{AmadeoO}
 * emailGit{amadeo.fgarcia@gmail.com}
 */
public interface InmuebleServiceInterface {
	
	public boolean insertInmueble(InmuebleDTO inmueble);
	public List<Property> findAll();
	public boolean insertInmueble(PropertyDTO inmueble);

}
