package AST;

import java.io.*;
import Errors.*;
import Compiler.*;


public class B1  implements Body{
	
	Sent s;
	public B1(Sent s){
		this.s=s;
	}

	public void computeAH1()throws CompilerExc{
		s.computeAH1();
	}
	public void CodeGenerator(BufferedWriter w, String indent)throws IOException{
	  s.CodeGenerator(w,indent);
	}
	
}