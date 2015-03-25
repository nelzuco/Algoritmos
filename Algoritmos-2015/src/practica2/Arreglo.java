package practica2;

public class Arreglo {
	public static int intArray[]= {5,10,12,2,30,15};
	private static int max;
	private static int min;
	private static float avg;

	public static String datosA(){
		min= intArray[0];
		max= intArray[0];
		avg=0;
		for (int i = 1; i < intArray.length; i++) {
			if (min > intArray[i]) {
				min = intArray[i];
			}else if(max < intArray[i]){
				max= intArray[i];
			}
			avg= avg + intArray[i];
		}
		return ("numero minimo es: " + min + "numero maximos es: " + max + "el promedio es: " + avg);
	}

	public static void datosB(String resultado){
		min= intArray[0];
		max= intArray[0];
		avg=0;
		for (int i = 1; i < intArray.length; i++) {
			if (min > intArray[i]) {
				min = intArray[i];
			}else if(max < intArray[i]){
				max= intArray[i];
			}
			avg= avg + intArray[i];
		}
		resultado= "numero minimo es: " + min + "numero maximos es: " + max + "el promedio es: " + avg;  	
	}

	public static void datosC(){
		min= intArray[0];
		max= intArray[0];
		avg=0;
		for (int i = 1; i < intArray.length; i++) {
			if (min > intArray[i]) {
				min = intArray[i];
			}else if(max < intArray[i]){
				max= intArray[i];
			}
			avg= avg + intArray[i];
		}
		avg=avg/intArray.length;
		
		//imprimo datos
		System.out.println("numero minimo es: " + min);
		System.out.println("numero maximos es: " + max);
		System.out.println("el promedio es: " + avg);
		
	}
}
