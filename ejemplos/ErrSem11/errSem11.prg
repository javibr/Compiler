PF2016 Ejemplo(argumento)

vars

int x, y;
bool argumento;

{
x:=Str2Int(argumento);
y:=0;

while(x>0) {
 y:=y+x;
 x:=x-1;
}

print("Resultado= " + Int2Str(y));

}


