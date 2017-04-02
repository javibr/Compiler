package AST;

import java.io.*;
import Errors.*;
import Compiler.*;

public class SS2  implements SentSimp{
	
	Cond a;
	public SS2(Cond a){
		this.a=a;
	}
	public void computeAH1()throws CompilerExc{
		a.computeAH1();
	}
	public void CodeGenerator(BufferedWriter w, String indent)throws IOException{
	  a.CodeGenerator(w,indent);
	}

}