package AST;

import java.io.*;
import Errors.*;
import Compiler.*;

public class Exp18  implements Exp{
	
	Exp e;
	Exp e1;
	public Exp18(Exp e,Exp e1){
		this.e=e;
		this.e1=e1;
		}
	public  int computeType()throws CompilerExc{
		int a=e.computeType();
		int b=e1.computeType();
		if((a==Typ.tint)&&(b==Typ.tint)){
			return Typ.tbool;
		}else{
			throw new ExpExc(13);
		}
	}
	public String CodeGenerator(){
	
	return(e.CodeGenerator()+"<"+e1.CodeGenerator());

	}

}