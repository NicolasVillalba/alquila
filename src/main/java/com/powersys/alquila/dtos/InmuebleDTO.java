package com.powersys.alquila.dtos;

/**
 * @author Amadeo F. Garcia
 * userGit{AmadeoO}
 * email{amadeo.fgarcia@gmail.com}
 */
public class InmuebleDTO {
	
	
	private String direccion;
	private String detallesLegales;
	private String detallesInmueble;
	private String otrosDetalles;
	private Integer precio;
	private String tipoInmueble;
	
	public InmuebleDTO(String direccion, String detallesLegales, String detallesInmueble,
			String otrosDetalles, Integer precio, String tipoInmueble) {
		super();
		
		this.direccion = direccion;
		this.detallesLegales = detallesLegales;
		this.detallesInmueble = detallesInmueble;
		this.otrosDetalles = otrosDetalles;
		this.precio = precio;
		this.tipoInmueble = tipoInmueble;
	}
	public InmuebleDTO() {
		
	}
	
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDetallesLegales() {
		return detallesLegales;
	}
	public void setDetallesLegales(String detallesLegales) {
		this.detallesLegales = detallesLegales;
	}
	public String getDetallesInmueble() {
		return detallesInmueble;
	}
	public void setDetallesInmueble(String detallesInmueble) {
		this.detallesInmueble = detallesInmueble;
	}
	public String getOtrosDetalles() {
		return otrosDetalles;
	}
	public void setOtrosDetalles(String otrosDetalles) {
		this.otrosDetalles = otrosDetalles;
	}
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	public String getTipoInmueble() {
		return tipoInmueble;
	}
	public void setTipoInmueble(String tipoInmueble) {
		this.tipoInmueble = tipoInmueble;
	}

}
