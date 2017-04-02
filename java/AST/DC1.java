package AST;

import java.io.*;
import Errors.*;
import Compiler.*;

public class DC1  implements Decl{
	int i;
    	LVar lv;
	public DC1(int i,LVar lv){
		this.lv=lv;
		this.i=i;
	}
	public void computeAH1()throws CompilerExc{
		lv.computeAH1(i);
	}
	public void CodeGenerator(BufferedWriter w)throws IOException{
	
	if(i==Typ.tint){
		w.newLine();
		w.write(lv.CodeGenerator());
		w.newLine();
	}
	if(i==Typ.tbool){
		w.newLine();
		w.write(lv.CodeGenerator());
		w.newLine();
	}
	if(i==Typ.tstring){
		w.newLine();
		w.write(lv.CodeGenerator());
		w.newLine();
	}
	}

}
