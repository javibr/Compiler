package Errors;

import Compiler.*;

public class RepetExc extends CompilerExc {
	private int s;
/*
  	public RepetExc(int s) {
    	 this.s = s;
  	}
*/
  	public RepetExc(int nombre) {
			//if(nombre==2){
  			if(nombre==Typ.tstring){
	        	System.out.println("La repeticion tiene que ser de tipo bool, no string");
	    	}
		//if(nombre==0){
	    	if(nombre==Typ.tint){
	    		System.out.println("La repeticion tiene que ser de tipo bool, no int");
	    	}

	    }
	    
}
