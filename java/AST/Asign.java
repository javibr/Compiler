package AST;

import java.io.*;
import Errors.*;
import Compiler.*;

public interface Asign {

	public void computeAH1()throws CompilerExc;
	public void CodeGenerator(BufferedWriter w, String indent)throws IOException;

}