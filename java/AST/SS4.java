package AST;

import java.io.*;
import Errors.*;
import Compiler.*;

public class SS4  implements SentSimp{
	
	Print a;
	public SS4(Print a){
		this.a=a;
	}
	public void computeAH1()throws CompilerExc{
		a.computeAH1();
	}
	public void CodeGenerator(BufferedWriter w, String indent)throws IOException{
	  a.CodeGenerator(w,indent);
	  w.write(";");
	  w.newLine();
	}

}