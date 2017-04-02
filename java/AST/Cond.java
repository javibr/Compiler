package AST;

import java.io.*;
import Errors.*;
import Compiler.*;
import GenerateCodeLib.*;

public interface Cond {
	public void computeAH1()throws CompilerExc;
	public void CodeGenerator(BufferedWriter w, String indent)throws IOException;
}