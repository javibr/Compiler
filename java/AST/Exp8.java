package AST;

import java.io.*;
import Errors.*;
import Compiler.*;

public class Exp8  implements Exp{
	
	Exp e;
	public Exp8(Exp e){
		this.e=e;
		}
	public  int computeType()throws CompilerExc{
		int a=e.computeType();
		if(a!=Typ.tint){
			throw new ExpExc(5);
		}else{
			return Typ.tint;
		}
	}
	public String CodeGenerator(){
	
	return("-"+e.CodeGenerator());
	}


}