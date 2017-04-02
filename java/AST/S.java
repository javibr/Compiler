package AST;

import java.io.*;
import Errors.*;
import Compiler.*;

public interface S{

	public void computeAH1()throws CompilerExc;
	public void CodeGenerator(BufferedWriter w)throws IOException;
}