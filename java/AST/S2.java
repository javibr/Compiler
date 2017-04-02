package AST;

import java.io.*;
import Errors.*;
import Compiler.*;

public class S2  implements S{
	
	String s;
	Body b;
	public S2(String s,Body b){
		this.s=s;
		this.b=b;
	}
	public void computeAH1()throws CompilerExc{
		b.computeAH1();
	}
	public void CodeGenerator(BufferedWriter w)throws IOException{
	  w.newLine();
	  w.write("\tpublic static void main(String args[])throws IOException{");
	  w.newLine();
	  b.CodeGenerator(w,"\t\t");
	  w.newLine();
	  w.write("\t}");
}


}
