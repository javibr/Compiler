package AST;

import java.io.*;
import Errors.*;
import Compiler.*;

public class Exp12  implements Exp{
	
	Exp e;
	public Exp12(Exp e){
		this.e=e;
		}
	public  int computeType()throws CompilerExc{
		int a=e.computeType();
		if(a!=Typ.tint){
			throw new ExpExc(7);
		}else{
			return Typ.tstring;
		}
	}
	public String CodeGenerator(){
	
	return("Integer.toString("+e.CodeGenerator()+")");

	}


}