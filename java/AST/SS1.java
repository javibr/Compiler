package AST;

import java.io.*;
import Errors.*;
import Compiler.*;

public class SS1  implements SentSimp{
	
	Asign a;
	public SS1(Asign a){
		this.a=a;
	}
	public void computeAH1()throws CompilerExc{
		a.computeAH1();
	}
	public void CodeGenerator(BufferedWriter w, String indent)throws IOException{
	  a.CodeGenerator(w,indent);
	}

}