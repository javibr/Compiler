package AST;

import java.io.*;
import Errors.*;
import Compiler.*;

public class A1  implements Asign{
	
	String s;
	Exp e1;
	public A1(String s, Exp e1){
		this.s=s;
		this.e1=e1;
	}
	
	public void computeAH1()throws CompilerExc{
		TableEntry a = SymbolTable.search(s);
		if(a==null){
			throw new VarNoDefExc(s);

		}
		int b = SymbolTable.getType(a.getName());
		int c = e1.computeType();
		
		
		if(c!=b){
			throw new IncorrectAsignExc();
		}
	}
	public void CodeGenerator(BufferedWriter w, String indent)throws IOException{

	      int a = (SymbolTable.search(s)).getType();
		if(a==Typ.tbool){
			w.write(indent+s+"= new Logic3("+e1.CodeGenerator()+");");
			w.newLine();
	     }else{
	     	w.write(indent+s+"="+e1.CodeGenerator()+";");
			w.newLine();
	     }
	}
}