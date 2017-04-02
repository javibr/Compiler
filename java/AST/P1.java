package AST;

import java.io.*;
import Errors.*;
import Compiler.*;


public class P1  implements Print{
	
	Exp s;
	public P1(Exp s){
		this.s=s;
	}
	public void computeAH1()throws CompilerExc{
		int a=s.computeType();
		if(a != Typ.tstring){
			throw new PrintExc(a);
		}
	}
	public void CodeGenerator(BufferedWriter w, String indent)throws IOException{
	  w.write(indent+"System.out.println("+s.CodeGenerator()+")");
	  	}

}