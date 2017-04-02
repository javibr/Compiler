package AST;

import java.io.*;
import Errors.*;
import Compiler.*;

public class VD2  implements VDef{
	
	Decl d;
	VDef vd;
	public VD2(Decl d,VDef vd){
		this.d=d;
		this.vd=vd;
	}
	public void computeAH1()throws CompilerExc{
		d.computeAH1();
		vd.computeAH1();
	}
	public void CodeGenerator(BufferedWriter w)throws IOException{
		w.newLine();
		d.CodeGenerator(w);
		//w.write(" ;");
		w.newLine();
		vd.CodeGenerator(w);
		w.newLine();

	}

}