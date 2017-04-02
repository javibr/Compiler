#!/bin/bash
java JLex.Main Yylex  
mv Yylex.java java/Lexer 
java -cp ./CUP java_cup.Main parser 
mv sym.java parser.java java/Parser 
javac -cp class -d class java/Errors/*.java 
javac -cp class -d class java/GeneratedCodeLib/*.java 
javac -cp class -d class java/Compiler/*.java 
javac -cp class -d class java/AST/*.java 
javac -d class -cp JLex/:CUP/:class/ java/Parser/parser.java java/Parser/sym.java
javac -d class -cp JLex/:CUP/:class/ java/Lexer/Yylex.java 
javac -d class -cp JLex/:CUP/:class/ java/Main.java 
java -cp CUP/java_cup/runtime/:CUP/:class Main ejemplos/Ejem1/ejem1.prg ejem1
java -cp CUP/java_cup/runtime/:CUP/:class Main ejemplos/Ejem2/ejem2.prg ejem2
java -cp CUP/java_cup/runtime/:CUP/:class Main ejemplos/Ejem3/ejem3.prg ejem3
java -cp CUP/java_cup/runtime/:CUP/:class Main ejemplos/Ejem4/ejem4.prg ejem4
java -cp CUP/java_cup/runtime/:CUP/:class Main ejemplos/Ejem5/ejem5.prg ejem5
java -cp CUP/java_cup/runtime/:CUP/:class Main ejemplos/Ejem6/ejem6.prg ejem6
javac -cp class -d class ejem1.java 
javac -cp class -d class ejem2.java
javac -cp class -d class ejem3.java
javac -cp class -d class ejem4.java
javac -cp class -d class ejem5.java
javac -cp class -d class ejem6.java
cd class
echo "##################ejem1 5##################"
java ejem1 5
echo "##################ejem1 1##################"
java ejem1 1
echo "##################ejem1 2##################"
java ejem1 2
echo "##################ejem1 10##################"
java ejem1 10
echo "##################ejem2 10##################"
java ejem2 10
echo "##################ejem2 0##################"
java ejem2 0
echo "##################ejem2 -10##################"
java ejem2 -10
echo "##################ejem3 -2##################"
java ejem3 -2
echo "##################ejem3 0##################"
java ejem3 0
echo "##################ejem3 1##################"
java ejem3 1
echo "##################ejem3 2##################"
java ejem3 2
echo "##################ejem3 2016##################"
java ejem3 2016
echo "##################ejem3 893465232##################"
java ejem3 893465232
echo "##################ejem3 893465231##################"
java ejem3 893465231
echo "##################ejem4 Luis##################"
java ejem4 Luis
echo "##################ejem5 Hola##################"
java ejem5 Hola
echo "##################ejem6 2 5##################"
java ejem6 2 5 6 9 5

