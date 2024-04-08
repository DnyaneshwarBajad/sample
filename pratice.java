
 class calculator{
int a,b;
static  int  addition( int a,int b){
return a+b;
}
 static int sub(int a,int b){
return a-b;
}
 static int mul( int a, int b){
return a*b;
}
 static int div(int a,int b){
return a/b;
}

static int square(int a)
{ return a*a;
}
//static int squareroot(int a){
//return math.sqrt(a);
//}

static int cube(int a){
return a*a*a;
}


public static void main(String [] args){
int b = addition(10,23);
System.out.println(b);

int a =squareroot(64);
System.out.println(a);}
}
