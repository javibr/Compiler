package AST;

import java.io.*;
import Errors.*;
import Compiler.*;

public class SS3  implements SentSimp{
	
	Repet r;
	public SS3(Repet r){
		this.r=r;
	}
	public void computeAH1()throws CompilerExc{
		r.computeAH1();
	}
	public void CodeGenerator(BufferedWriter w, String indent)throws IOException{
	  r.CodeGenerator(w,indent);
	}

}