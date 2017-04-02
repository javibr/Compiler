import Parser.*;
import Lexer.*;
import java.io.*;
import AST.*;

public class Main
{
  public static void main(String args[]) throws Exception{
    java.io.BufferedReader in;
    Yylex sc;
    parser p;
    java_cup.runtime.Symbol sroot;
    boolean error=false;
    S root = null;


    //El primer parametro es el nombre del fichero con el programa
    if (args.length < 1) {
      System.out.println(
        "Uso: java Main <nombre_fichero>");
      error=true;
    }

    //Analisis lexico y sintactico

    if (!error) {  
	try {
	    in = new java.io.BufferedReader(new java.io.FileReader(args[0]));
	    sc = new Yylex(in);
	    p = new parser(sc);
	    sroot = p.parse();
	    System.out.println("Analisis lexico y sintactico correctos");
	    root = (S) sroot.value;
	    root.computeAH1();
	    System.out.println("Analisis semantico correctos");
	    CodeGenerator(args[1],root);



	} catch(IOException e) {
	    System.out.println("Error abriendo fichero: " + args[0]);
	    error= true;
	}
    }
  }

private static void CodeGenerator(String ClassName, S ast){
     try{
     
	   BufferedWriter w = new BufferedWriter(new FileWriter(ClassName + ".java"));
	    w.write("import GenerateCodeLib.*;");
	    w.newLine();
    	    w.write("import java.io.*;");
	    w.newLine();
	    w.write("import java.lang.*;");
	    w.newLine();
	    w.write("import Errors.*;");
	    w.newLine();
	    w.write("import java.util.*;");
	    w.newLine();
	    w.newLine();
	    w.write("public class "+ClassName+"{");
	    w.newLine();
	    ast.CodeGenerator(w);
	    w.newLine();
	    w.write("}");
	    w.newLine();
	    w.close();  
	    System.out.println("Code generated in file " + ClassName + ".java");

	  }catch (IOException e){
	    System.out.println("Error al generar codigo");
     }
 }
}

