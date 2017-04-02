package AST;

import java.io.*;
import Errors.*;
import Compiler.*;

public class LV2  implements LVar{
	
	String i;
	LVar lv;
	int ah1;
	String a;
	public LV2(String i,LVar lv){
		this.lv=lv;
		this.i=i;
	}

	public int getAh1(){
		return ah1;
	}

	public void computeAH1(int type)throws CompilerExc{
		ah1=type;
		lv.computeAH1(ah1);
		SymbolTable.newEntry(i,ah1);
	}
	public void generaArgs(){
		ArgsTable.newEntry(i); 
		lv.generaArgs();
	}
	public String CodeGenerator(){
	 if(ah1==Typ.tint){
	     a= "\t\tint "+i+ "=0;\n"+lv.CodeGenerator();
	  }
	  if(ah1==Typ.tstring){
	    a="\t\tString "+i+ "\"\";\n"+lv.CodeGenerator();
	  }
	  if(ah1==Typ.tbool){
	    a= "\t\tLogic3 "+i +"=new Logic3(false,false);\n"+lv.CodeGenerator();
	  }
	return a;
	}
}