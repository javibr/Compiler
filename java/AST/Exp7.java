package AST;

import java.io.*;
import Errors.*;
import Compiler.*;

public class Exp7  implements Exp{
	
	Exp e;
	Exp e2;
	public Exp7(Exp e,Exp e2){
		this.e=e;
		this.e2=e2;
		}
	public  int computeType()throws CompilerExc{
		int a=e.computeType();
		int b=e2.computeType();
		if((a==Typ.tint)&&(b==Typ.tint)){
			return Typ.tint;
		}
		else{
			throw new ExpExc(4);
		}
	}
	public String CodeGenerator(){
	
	return("("+e.CodeGenerator()+"/"+e2.CodeGenerator()+")");
	}

}