package Errors;

import Compiler.*;

public class PrintExc extends CompilerExc {
	private int s;
/*
  	public PrintExc(int s) {
    	 this.s = s;
  	}
*/
  	public PrintExc(int nombre) {
			//if(nombre==1){
  			if(nombre==Typ.tbool){
	        	System.out.println("La sentencia print tiene que ser de tipo string, no bool");
	    	}
		//if(nombre==0){
	    	if(nombre==Typ.tint){
	    		System.out.println("Condicion tiene que ser de tipo string, no int");
	    	}

	    }

}
