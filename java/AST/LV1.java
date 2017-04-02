package AST;

import java.io.*;
import Errors.*;
import Compiler.*;


public class LV1  implements LVar{
	
	String i;
	int ah1;
	String a;
	public LV1(String i){
		this.i=i;
	}

	public int getAh1(){
		return ah1;
	}

	public void computeAH1(int type)throws CompilerExc{
		ah1=type;
		SymbolTable.newEntry(i,ah1);
	}
	public void generaArgs(){
		ArgsTable.newEntry(i);
	}
	public String CodeGenerator(){
	   if(ah1==Typ.tint){
	    a="\t\tint "+i+ "=0;";
	  }
	  if(ah1==Typ.tstring){
	    a= "\t\tString "+i + "=\"\";";
	  }
	  if(ah1==Typ.tbool){
	    a="\t\tLogic3 " +i +"=new Logic3(false,false);";
	  }
	return a;
	}
}