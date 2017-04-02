package Compiler;


import java.util.*;
import Errors.*;

public class SymbolTable{

private static Vector<TableEntry> table=new Vector<TableEntry>(); 

public static TableEntry search(String name){

	TableEntry e=null;

	for (int i=0;i<table.size();i++){

		e=table.get(i);
		if(e.getName().equals(name)){
			break;
		}	
		e=null;
	}
	return e;
}

public static int getType(String name)throws VarNoDefExc{

	TableEntry e=search(name);
	if(e==null){
		throw new VarNoDefExc(name);
	}else{
		return e.getType();
	}
}	

public static void newEntry(String name, int type)throws DobleDefExc{

	TableEntry e=search(name);
	if(e!=null){
		throw new DobleDefExc(name);
	}
	else{
		//System.out.println("La vfasfariable "+name+" con tipo "+type );
		e=new TableEntry(name,type);
		table.add(e);
	}

}

}
