package AST;

import java.io.*;
import Errors.*;
import Compiler.*;

public class Exp13  implements Exp{
	
	Integer e;
	String a;

	public Exp13(Integer e){
		this.e=e;
		}
	public  int computeType()throws CompilerExc{
		return Typ.tbool;
	}
	
	public String CodeGenerator(){
	  if(e==TypBool.ttrue){
	    a= "false,true";
	  }
	  if(e==TypBool.tfalse){
	    a="false,false";
	  }
	  if(e==TypBool.tunk){
	    a= "true,true";
	  }
	return a;
	}
}
