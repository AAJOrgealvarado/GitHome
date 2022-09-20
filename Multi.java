public class Multi{

 public int multiplicacion(int a, int b){

 

 if(b==1)

 return a;

 if(a>0)

 {

 return a+multiplicacion(a,b-1);

 }

 else 

 {

 return -a +multiplicacion(a,b+1);

 }
 }
}









