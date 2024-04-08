class Prime{

public  static void randomdigit( ){
long a,a1,a2,a3,a4,a5,a6;
  a=System.nanoTime()%10;
 
  a1=System.nanoTime()%10;
 a2=System.nanoTime()%10;
 a3=System.nanoTime()%10;
 a4=System.nanoTime()%10;
 a5=System.nanoTime()%10;
 a6=System.nanoTime()%10;
 long arr[i]=((a*1000000)+(a1*100000)+(a2*10000)+(a3*1000)+(a4*100)+(a5*10)+a6);
}

public static  void checkisprime(int arr[])
{int count =0;
 for(int i=0;i<arr.length;i++)
 {
   if(arr[i]%2!=0){
   System.out.println(arr[i]);
   count++;
   
   }}
    System.out.println( "count" +count);
   
  
}
public static void main(String [] args)
{
 int arr[]={34,3,4,1,7};
checkisprime(arr);

}
}
