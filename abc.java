class abc{
int balance =23;
static  String surname ="frfr";
public static void main(String args[]){
abc son =new abc();
System.out.println(son.balance);
System.out.println(son);
System.out.rintln(son.surname);
son.surname="sss";
System.out.println(son.surname);

}
public int myfun(int... a){
System.out.println(balance);
return balance;
}

}
