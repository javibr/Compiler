package AST;

import java.io.*;
import Errors.*;
import Compiler.*;

public class Exp10  implements Exp{
	
	String e;
	public Exp10(String e){
		this.e=e;
		}
	public  int computeType()throws CompilerExc{
		return Typ.tstring;
	}
	public String CodeGenerator(){
	  return (e);
	}
	

}