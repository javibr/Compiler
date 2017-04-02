package AST;

import java.io.*;
import Errors.*;
import Compiler.*;

public class VD1  implements VDef{
	
	Decl d;
	public VD1(Decl d){
		this.d=d;
	}
	public void computeAH1()throws CompilerExc{
		d.computeAH1();
	}
	public void CodeGenerator(BufferedWriter w)throws IOException{
		w.newLine();
		d.CodeGenerator(w);
		//w.write(" ;");
		w.newLine();


	}

}