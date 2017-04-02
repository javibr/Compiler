package AST;

import java.io.*;
import Errors.*;
import Compiler.*;


public class LS2  implements LSent{
	
	LSent ls;
	SentSimp s;
	public LS2(LSent ls, SentSimp s){
		this.s=s;
		this.ls=ls;
	}
	public void computeAH1()throws CompilerExc{
		ls.computeAH1();
		s.computeAH1();
	}
	public void CodeGenerator(BufferedWriter w, String indent)throws IOException{
		ls.CodeGenerator(w,indent);
		s.CodeGenerator(w,indent);
	}

}