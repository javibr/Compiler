package AST;

import java.io.*;
import Errors.*;
import Compiler.*;


public class LS1  implements LSent{
	
	SentSimp s;
	public LS1(SentSimp s){
		this.s=s;
	}
	public void computeAH1()throws CompilerExc{
		s.computeAH1();
	}
	public void CodeGenerator(BufferedWriter w, String indent)throws IOException{
	 s.CodeGenerator(w,indent);
	}

}