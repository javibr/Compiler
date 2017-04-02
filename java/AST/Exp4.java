package AST;

import java.io.*;
import Errors.*;
import Compiler.*;

public class Exp4  implements Exp{
	
	Exp e;
	Exp e2;
	public Exp4(Exp e,Exp e2){
		this.e=e;
		this.e2=e2;
		}

	public  int computeType()throws CompilerExc{
		int a=e.computeType();
		int b=e2.computeType();
		//System.out.println("exp 4 Typo pre if "+a);
		//System.out.println("exp 4 Typo pre if "+b);
		if((a==Typ.tint)&&(b==Typ.tint)){
			return Typ.tint;
		}else{
			if((a==Typ.tstring)&&(b==Typ.tstring)){
				//System.out.println("exp 4 Typoooooo"+a);
				//System.out.println("exp 4 Typoooooo"+b);
				return Typ.tstring;
			}else{
				throw new ExpExc(1);
			}
		}
	}

	public String CodeGenerator(){
	
	return("("+e.CodeGenerator()+"+"+e2.CodeGenerator()+")");
	}

}