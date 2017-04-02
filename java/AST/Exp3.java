package AST;

import java.io.*;
import Errors.*;
import Compiler.*;


public class Exp3  implements Exp{
	
	int e;
	public Exp3(int e){
		this.e=e;
		}
	public  int computeType()throws CompilerExc{
		return Typ.tint;
	}
	public String CodeGenerator(){
	   return Integer.toString(e);
	}

}