package AST;

import java.io.*;
import Errors.*;
import Compiler.*;

public class S3  implements S{
	
	String s;
	VDef e;
	Body b;
	public S3(String s, VDef e,Body b){
		this.s=s;
		this.e=e;
		this.b=b;
	}
	public void computeAH1()throws CompilerExc{
		e.computeAH1();
		b.computeAH1();
	}
	
	public void CodeGenerator(BufferedWriter w)throws IOException{
	  w.newLine();
	  w.write("\tpublic static void main(String args[])throws IOException{");
	  w.newLine();
	  
	  e.CodeGenerator(w);
	  w.newLine();
	  b.CodeGenerator(w,"\t\t");
	  w.newLine();
	  w.write("\t}");
}

}
