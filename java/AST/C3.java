package AST;

import java.io.*;
import Errors.*;
import Compiler.*;

public class C3  implements Cond{
	Exp e;
	Sent s;	
	Sent s1;
	Sent s2;
	public C3(Exp e,Sent s,Sent s1,Sent s2){
		this.e=e;
		this.s=s;
		this.s1=s1;
		this.s2=s2;
	}
	public void computeAH1()throws CompilerExc{
		s.computeAH1();
		s1.computeAH1();
		s2.computeAH1();
		int a=e.computeType();
		if(a!=Typ.tbool){
			throw new ConditionExc(a);
		}
	}
	public void CodeGenerator(BufferedWriter w, String indent)throws IOException{
	  w.newLine();
	  w.write(indent+"if (new Logic3("+e.CodeGenerator()+").isTrue()){");//Javi: esto creo que esta mal
	  w.newLine();
	  s.CodeGenerator(w,indent);
	  w.newLine();
	  w.write(indent+"}");
	  w.newLine();
	  w.write(indent+"else if (new Logic3("+e.CodeGenerator()+").isUnknown()){");
	  w.newLine();
	  s1.CodeGenerator(w,indent);
	  w.newLine();
	  w.write(indent+"}");
	  w.newLine();
	  w.write(indent+"else if (new Logic3("+e.CodeGenerator()+").isFalse()){");	  
	  w.newLine();
	  s2.CodeGenerator(w,indent);
	  w.newLine();
	  w.write(indent+"}");
	  w.newLine();

	}

}
