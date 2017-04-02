package AST;

import java.io.*;
import Errors.*;
import Compiler.*;

public class Exp15  implements Exp{
	
	Exp e;
	Exp e1;
	public Exp15(Exp e,Exp e1){
		this.e=e;
		this.e1=e1;
		}
	public  int computeType()throws CompilerExc{
		int a=e.computeType();
		int b=e1.computeType();
		if((a==Typ.tbool)&&(b==Typ.tbool)){
			return Typ.tbool;
		}else{
			throw new ExpExc(9);
		}
	}
	public String CodeGenerator(){
	
	
	
	return("new Logic3("+e.CodeGenerator()+").and3(new Logic3("+e1.CodeGenerator()+"))");

	}
}