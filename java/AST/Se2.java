package AST;

import java.io.*;
import Errors.*;
import Compiler.*;

public class Se2  implements Sent{
	
	LSent s;
	public Se2(LSent s){
		this.s=s;
	}
	public void computeAH1()throws CompilerExc{
		s.computeAH1();
	}
	public void CodeGenerator(BufferedWriter w, String indent)throws IOException{
	  s.CodeGenerator(w,indent);
	}

}