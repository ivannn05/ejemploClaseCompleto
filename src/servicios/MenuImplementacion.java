package servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {
Scanner sc=new Scanner(System.in);
FicheroIntrfaz fi= new FicheroImplementacion();
	@Override
	public int mostrarMenuInicial() {
		int opc;
		System.out.println("Seleccione una opcion");
		System.out.println("0.Cerar menu");
		System.out.println("1.Escribir en fichero");
		System.out.println("2.Mostrar ");
		System.out.println("3.Abrir menu calcu");
		opc=sc.nextInt();
		
		return opc;
	}
	@Override
	public void mostrarMenuSuma() {
		
		
		boolean cerrarMenu = false;
		 

		while (!cerrarMenu) {
			int opc;
			System.out.println("Seleccione una opcion");
			System.out.println("0.Cerar menu");
			System.out.println("1.Viva Sevilla");
			System.out.println("2.Viva Betis ");
			opc=sc.nextInt();

			switch (opc) {
			case 0:
				System.out.println("Selecciono cerrar menu");
				cerrarMenu = true;
				fi.ficheroLog("Selecciono cerrar menu");
				System.out.println("----------------------------------");
				break;
			case 1:
				System.out.println("Selecciono Viva Sevilla");
				fi.ficheroLog("Selecciono Viva Sevilla");
				System.out.println("----------------------------------");
				break;
			case 2:
				System.out.println("Selecciono Viva Betis");
				fi.ficheroLog("Selecciono Viva Betis");
				System.out.println("----------------------------------");
				break;
			default:
				System.out.println("Esta opcion no exsiste");
				fi.ficheroLog("Esta opcion no exsiste");
				System.out.println("----------------------------------");
				break;

			}

		}
	}

}
