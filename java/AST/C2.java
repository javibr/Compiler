package AST;

import java.io.*;
import Errors.*;
import Compiler.*;

public class C2  implements Cond{
	Exp e;
	Sent s;
	Sent s1;
	public C2(Exp e,Sent s, Sent s1){
		
		this.e=e;
		this.s=s;
		this.s1=s1;
	}
	public void computeAH1()throws CompilerExc{
		s.computeAH1();
		s1.computeAH1();
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
	  w.newLine();
	  w.write(indent+"else{");
	  w.newLine();
	  s1.CodeGenerator(w,indent);
	  w.newLine();
	  w.write(indent+"}");
	}

}
