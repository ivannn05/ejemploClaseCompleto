package dtos;

import java.time.LocalDate;

public class ClienteDto {

	long id;
	String dni="aaaa";
	LocalDate fechaCumple=LocalDate.of(9999,12,31);
	int edad=1;
	
	
	public ClienteDto() {
		super();
	}


	public ClienteDto(long id, String dni, LocalDate fechaCumple, int edad) {
		super();
		this.id = id;
		this.dni = dni;
		this.fechaCumple = fechaCumple;
		this.edad = edad;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public LocalDate getFechaCumple() {
		return fechaCumple;
	}
	public void setFechaCumple(LocalDate fechaCumple) {
		this.fechaCumple = fechaCumple;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		String datos;
		 datos = "Cliente Nº ".concat(Long.toString(this.id)).concat("\n Dni:").concat(this.dni).concat("\n FechaCumple:").concat(this.fechaCumple.toString()).concat("\n Edad:").concat(String.valueOf(edad));
		return datos;
	}
	
	
}
