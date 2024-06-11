package utilidades;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import controladores.Inicio;

public class Util {

	public static String creacionNombreFichero() {
		String nombre;
		LocalDateTime fecha=LocalDateTime.now();
		DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		nombre=fecha.format(formato);
		
		return nombre;
	}
	public static long generacionId() {
		long id;
	
		if (Inicio.listaClientes.size()==0) {
			id=1;
		} else {
			int tamanio=Inicio.listaClientes.size()-1;
			id=Inicio.listaClientes.get(tamanio).getId()+1;
		}
		
		return id;
	}
}
