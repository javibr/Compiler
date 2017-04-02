package AST;

import java.io.*;
import Errors.*;
import Compiler.*;

public class Exp9  implements Exp{
	
	Exp e;
	public Exp9(Exp e){
		this.e=e;
		}
	public  int computeType()throws CompilerExc{
		int a=e.computeType();
		if(a!=Typ.tstring){
			throw new ExpExc(6);
		}else{
			return Typ.tint;
		}
	}
	public String CodeGenerator(){
	
	return("Integer.parseInt("+e.CodeGenerator()+")");
	}

}