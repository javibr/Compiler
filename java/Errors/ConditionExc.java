package Errors;

import Compiler.*;

public class ConditionExc extends CompilerExc {
	private int nombre;

  	public ConditionExc(int nombre) {
			//if(nombre==2){
			if(nombre==Typ.tstring){
	        	System.out.println("Condicion tiene que ser de tipo bool, no string");
	    	}
		//if(nombre==0){
	    	if(nombre==Typ.tint){
	    		System.out.println("Condicion tiene que ser de tipo bool, no int");
	    	}

	    }

}
