public class Prueba_unitaria {

	public boolean prueba(Multi ejemplo1, int val1, int val2, int result){
		ejemplo1.multiplicacion(val1,val2);

		if (result==ejemplo1.multiplicacion(val1,val2))
			return true;
		else {
			return false;
			}
}
	
		

}