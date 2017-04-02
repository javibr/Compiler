package AST;

import java.io.*;
import Errors.*;
import Compiler.*;

public interface Exp {
	public  int computeType()throws CompilerExc;
	public String CodeGenerator();

}