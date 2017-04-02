package AST;

import java.io.*;
import Errors.*;
import Compiler.*;

public class Exp2  implements Exp{
	
	Exp e;
	public Exp2(Exp e){
		this.e=e;
		}
	public  int computeType()throws CompilerExc{
		return e.computeType();
	}
	public String CodeGenerator(){
	
	return("("+e.CodeGenerator()+")");
	}

}