package AST;

import java.io.*;
import Errors.*;
import Compiler.*;


public class R1  implements Repet{
	
	Sent s;
	Exp e;
	public R1(Exp e,Sent s){
		this.s=s;
		this.e=e;
	}
	public void computeAH1()throws CompilerExc{
		s.computeAH1();
		int a = e.computeType();
		if(a!=Typ.tbool){
			throw new RepetExc(a);
		}
	}
	public void CodeGenerator(BufferedWriter w, String indent)throws IOException{
	w.newLine();

	w.write(indent+"while (new Logic3("+e.CodeGenerator()+").isTrue()){");
	w.newLine();
	s.CodeGenerator(w,indent);
	w.newLine();
	w.write(indent+"}");
	w.newLine();
	}

}