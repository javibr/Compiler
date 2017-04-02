package Compiler;


import java.util.*;
import Errors.*;

public class ArgsTable {

private static Vector<Args> table=new Vector<Args>(); 

public Vector<Args> getVector(){

      return table;
  
}

public static void newEntry(String name){
	Args e=new Args(name);
	table.add(e);
}

public static Args search(int pos){
	Args e=null;
	e=table.get(pos);
	return e;	
  }
public static int vecSize(){
  return table.size();
}

}