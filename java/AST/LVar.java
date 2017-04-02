package AST;

import java.io.*;
import Errors.*;
import Compiler.*;


public interface LVar {

  public void computeAH1(int type)throws CompilerExc;
  public void generaArgs();
  public String CodeGenerator();

}
