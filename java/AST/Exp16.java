package AST;

import java.io.*;
import Errors.*;
import Compiler.*;

public class Exp16  implements Exp{
	
	Exp e;
	public Exp16(Exp e){
		this.e=e;
		}
	public  int computeType()throws CompilerExc{
		int a=e.computeType();
		if(a!=Typ.tbool){
			throw new ExpExc(10);
		}else{
			return Typ.tbool;
		}
	}
	public String CodeGenerator(){
	
	return("new Logic3("+e.CodeGenerator()+").not3()");

	}

}