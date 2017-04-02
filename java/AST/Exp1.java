package AST;

import java.io.*;
import Errors.*;
import Compiler.*;

public class Exp1  implements Exp{
	
	String s;
	public Exp1(String s){
		this.s=s;
		}
	public  int computeType()throws CompilerExc{
		return SymbolTable.getType(s);
	}
	public String CodeGenerator(){
	return s;

	}

}