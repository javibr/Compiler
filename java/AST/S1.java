package AST;

import java.io.*;
import Errors.*;
import Compiler.*;

public class S1  implements S{
	
	String s;
	LVar e;
	Body b;
	public S1(String s, LVar e,Body b){
		this.s=s;
		this.e=e;
		this.b=b;
	}

	public void computeAH1()throws CompilerExc{
		e.computeAH1(Typ.tstring);
		b.computeAH1();
	}
	public void CodeGenerator(BufferedWriter w)throws IOException{
	  w.newLine();
	  w.write("\tpublic static void main(String args[])throws IOException{");
	  w.newLine();
	  e.generaArgs();
	  for(int i=0;i<ArgsTable.vecSize();i++){
	    w.write("\t\tString "+ ArgsTable.search(i).getName() +"= \"\" ;");
	    w.newLine();
	  }
	  for(int i=0;i<ArgsTable.vecSize();i++){
	    w.write("\t\tif (args.length!=0){");
	    w.newLine();
	    w.write("\t\t"+ArgsTable.search(i).getName()+"=args["+i+"];}");
	    w.newLine();
	  }
	  b.CodeGenerator(w,"\t\t");
	  w.newLine();
	  w.write("\t\t}");
	  }
}
