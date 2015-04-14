package practica4;

public class ArbolBinario <T> {
	
	public ArbolBinario(){}
	public ArbolBinario(T){}
	private ArbolBinario(NodoBinario<T>){}
	public NodoBinario getRaiz(){}
	public ArbolBinario<T> getHijoIzquierdo(){}
	public ArbolBinario<T> getHijoDerecho(){}
	public void agregarHijoIzquierdo(ArbolBinario<T> a){}
	public void agregarHijoDerecho(ArbolBinario<T> a){}
	public void eliminarHijoIzquierdo(){}
	public void eliminarHijoDerecho(){}
	public boolean esVacio(){}
	public boolean esHoja(){}
	public String toString(){}
}
