package controladores;

import java.util.ArrayList;
import java.util.List;

import dtos.ClienteDto;
import servicios.FicheroImplementacion;
import servicios.FicheroIntrfaz;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.OperativaImplementacion;
import servicios.OperativaInterfaz;

public class Inicio {
	public static List<ClienteDto> listaClientes=new ArrayList<ClienteDto>();

	public static void main(String[] args) {

		OperativaInterfaz op = new OperativaImplementacion();
		FicheroIntrfaz fi = new FicheroImplementacion();
		MenuInterfaz mi = new MenuImplementacion();
		fi.cargaFichero();
		boolean cerrarMenu = false;
		int opc;

		while (!cerrarMenu) {
			opc = mi.mostrarMenuInicial();

			try {
				switch (opc) {
				case 0:
					System.out.println("Selecciono cerrar menu");
					cerrarMenu = true;
					fi.ficheroLog("Selecciono cerrar menu");
					System.out.println("----------------------------------");
					break;
				case 1:
					System.out.println("Selecciono escribir en fichero");
					fi.ficheroLog("Selecciono escribir en fichero");
					System.out.println("----------------------------------");
					break;
				case 2:
					System.out.println("Selecciono mostrar");
					System.out.println(listaClientes.size());
					for (ClienteDto clie : listaClientes) {
					System.out.println(clie.toString()); 
						
					}
					fi.ficheroLog("Selecciono mostrar");
					System.out.println("----------------------------------");
					break;
				case 3:
					System.out.println("Selecciono menu calcu");
					fi.ficheroLog("Selecciono menu calcu");
					mi.mostrarMenuSuma();
					System.out.println("----------------------------------");
					break;
				default:
					System.out.println("Esta opcion no exsiste");
					fi.ficheroLog("Esta opcion no exsiste");
					System.out.println("----------------------------------");
					break;

				}
			} catch (Exception e) {
				System.out.println("Ocurrio un error en la aplicacion");
				fi.ficheroLog("Ocurrio un error en la aplicacion Error:".concat(e.getMessage()));
			}

		}

	}

}
