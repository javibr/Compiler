package AST;

import java.io.*;
import Errors.*;
import Compiler.*;
import GenerateCodeLib.*;

public class C1  implements Cond{
	
	Sent s;
	Exp e;
	public C1(Exp e, Sent s){
		this.e=e;
		this.s=s;
	}
	public void computeAH1()throws CompilerExc{	
		s.computeAH1();
		int a=e.computeType();
		if(a!=Typ.tbool){
			throw new ConditionExc(a);
		}
	}
	public void CodeGenerator(BufferedWriter w, String indent)throws IOException{
	  w.newLine(); 
	  w.write(indent+"if (new Logic3("+e.CodeGenerator()+").isTrue()){");
	  w.newLine();
	  s.CodeGenerator(w,indent);
	  w.newLine();
	  w.write(indent+"}");
	}
}
