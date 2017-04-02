package AST;

import java.io.*;
import Errors.*;
import Compiler.*;

public class Exp17  implements Exp{
	
	Exp e;
	Exp e1;
	int type;
	public Exp17(Exp e,Exp e1){
		this.e=e;
		this.e1=e1;
		}
	public  int computeType()throws CompilerExc{
		int a=e.computeType();
		int b=e1.computeType();
		if((a==Typ.tbool)&&(b==Typ.tbool)){
			type = Typ.tbool;
			return Typ.tbool;
		}else{
			if((a==Typ.tint)&&(b==Typ.tint)){
				type = Typ.tint;
				return Typ.tbool;
			}else{
				if((a==Typ.tstring)&&(b==Typ.tstring)){
					type = Typ.tstring;
					return Typ.tbool;
				}else{
					throw new ExpExc(11);
				}
			}
		}					
	}
	public String CodeGenerator(){
	
		if(type==Typ.tint){
			return(e.CodeGenerator()+"=="+e1.CodeGenerator());
		}else if(type==Typ.tbool){
				return ("new Logic3("+e.CodeGenerator()+").isEquals(new Logic3("+e1.CodeGenerator()+"))");
		}else{
				return (e.CodeGenerator()+".equals("+e1.CodeGenerator()+")");
			}
	}	
}