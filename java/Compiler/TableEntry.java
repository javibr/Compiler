package Compiler;



public class TableEntry{

String name;
int type;

public String getName(){

	return name;
}

public int getType(){

	return type;
}

public TableEntry(String name, int type){

	this.name=name;
	this.type=type;
}

}