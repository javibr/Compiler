package Errors;
import Compiler.*;

public class VarNoDefExc extends CompilerExc{
	
		String nombre;
	
		public String getNombre() {
		return nombre;
		}

		public VarNoDefExc(String nombre) {
	        System.out.println("Error la variable "+ nombre+ " no está definida" );
	    }
	 
}