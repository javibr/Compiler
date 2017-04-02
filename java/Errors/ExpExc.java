package Errors;

import Compiler.*;

public class ExpExc extends CompilerExc {
	private int s;
/*
  	public ExpExc(int s) {
    	 this.s = s;
  	}
*/
  	public ExpExc(int a) {
  			/* a 1-> Error en la suma*/
  			if(a==1){
	        	System.out.println("Suma o concatenacion erronea, los tipos tienen que ser iguales");
  			}
  			/* a 2-> Error en la resta*/
  			if(a==2){
	        	System.out.println("Resta errónea, los típos tienen que ser int");
  			}
  			/* a 3-> Error en la mult*/
  			if(a==3){
	        	System.out.println("Multiplicacion errónea, los típos tienen que ser int");
  			}
  			/* a 4-> Error en la div*/
  			if(a==4){
	        	System.out.println("Division errónea, los típos tienen que ser int");
  			}
  			/* a 5-> Error en opuesto*/
  			if(a==5){
	        	System.out.println("Error en el tipo para el opuesto, tiene que ser int");
  			}
  			/* a 6-> STRtoInt*/
  			if(a==6){
	        	System.out.println("Error expresion Str2Int,el tipo tiene que ser un string");
  			}
  			/* a 7-> Int2Str*/
  			if(a==7){
	        	System.out.println("Error expresion Int2Str,el tipo tiene que ser un int");
  			}
  			/* a 8-> And*/
  			if(a==8){
	        	System.out.println("Error expresion And, los tipos tienen que ser bool");
  			}
  			/* a 9-> Or*/
  			if(a==9){
	        	System.out.println("Error expresion Or, los tipos tienen que ser bool");
  			}
  			/* a 10-> NOT*/
  			if(a==10){
	        	System.out.println("Error expresion Not, los tipos tienen que ser bool");
  			}
  			/* a 11-> IGUALQUE*/
  			if(a==11){
	        	System.out.println("Error expresion IGUALQUE, los tipos tienen que ser iguales");
  			}
  			/* a 12-> MAYORQUE*/
  			if(a==12){
	        	System.out.println("Error expresion MAYORQUE, los tipos tienen que ser int");
  			}
  			/* a 13-> MENORQUE*/
  			if(a==13){
	        	System.out.println("Error expresion MENORQUE, los tipos tienen que ser int");
  			}
	    }

}
