public class Multi{

 public int multiplicacion(int a, int b){

 

 if(b==1)

 return a;

 if(b>0)

 {

 return a+multiplicacion(a,b-1);

 }

 else 

 {

 return -a +multiplicacion(a,b+1);

 }
 }
}









