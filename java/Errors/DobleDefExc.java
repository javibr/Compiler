package Errors;

import Compiler.*;

public class DobleDefExc extends CompilerExc{
	
		String nombre;
	
		public String getNombre() {
		return nombre;
		}

		public DobleDefExc(String nombre) {
	        System.out.println("La variable "+ nombre+ " ha sido definida dos veces" );
	    }
	 
}