package servicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import controladores.Inicio;
import dtos.ClienteDto;

public class FicheroImplementacion implements FicheroIntrfaz {

	@Override
	public void ficheroLog(String mensaje) {
		String ruta="C:\\Users\\csi23-iloposa\\Desktop\\Log-".concat(utilidades.Util.creacionNombreFichero()).concat(".txt");
		try {
			BufferedWriter escribe=new BufferedWriter(new FileWriter(ruta,true));
			
			escribe.write(mensaje.concat("\n"));
			escribe.close();
			
		} catch (Exception e) {
			System.out.println("Ocurio un error en el fichero log");
		}
		
		
		
		
		
	}

	@Override
	public void cargaFichero() {
		String ruta="C:\\Users\\csi23-iloposa\\Desktop\\datosUsu.txt";
		try {
			BufferedReader lee=new BufferedReader(new FileReader(ruta));
			String linea;
			while ((linea=lee.readLine()) != null) {
				String[] arrayLinea=linea.split(";");
				ClienteDto cliente=new ClienteDto();
				cliente.setId(utilidades.Util.generacionId());
				cliente.setDni(arrayLinea[0]);
				DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				LocalDate fechaDate=LocalDate.parse(arrayLinea[1],formato);
				cliente.setFechaCumple(fechaDate);
				cliente.setEdad(Integer.parseInt(arrayLinea[2]));
				Inicio.listaClientes.add(cliente);
				
			}
			
			lee.close();
		} catch (Exception e) {
			ficheroLog("Ocurrio un error en la carga del fichero Eror:".concat(e.getMessage()));
			System.err.println("Ocurrio un error en la carga del fichero");
		}
	}

}
