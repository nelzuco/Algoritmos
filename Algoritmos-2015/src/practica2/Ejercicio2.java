package practica2;

public class Ejercicio2 {
		public static int[] devuelveArreglo(int n){
			int arreglo[]= new int[n];
			int mul=1;
			for (int i = 0; i < arreglo.length; i++) {
				arreglo[i]=n*mul;
				mul++;
			}
			return arreglo;
		}
}
