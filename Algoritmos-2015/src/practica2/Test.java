package practica2;

public class Test {

	public static void main(String[] args) {
		
		Estudiante[] estudiantes= new Estudiante[5];
		// crear 5 estudiantes
		estudiantes[0] = new Estudiante("juan", "lozano", "jlozano", 1, "50 y 120");
		estudiantes[1]= new Estudiante("claudia", "quintana", "clauquin", 2, "50 y 120");
		estudiantes[2]= new Estudiante("sergio", "katz", "skatz", 3, "50 y 120");
		estudiantes[3]= new Estudiante("marcelo", "barreto", "mbarreto", 4, "50 y 120");
		estudiantes[4]= new Estudiante("nelson", "zucolillo", "nzucolillo", 5, "50 y 120");
		
		Profesor[] profesores= new Profesor[4];
		//crear 4 profesores
		profesores[0] = new Profesor("Gustavo", "Rossi", 40, "gusRossi", "Objetos 2", "Doctor", "Informatica");
		profesores[1] = new Profesor("Silvia", "Gordillo", 40, "gordillo", "Base de Datos 1", "Licenciado", "Informatica");
		profesores[2] = new Profesor("Alicia", "Diaz", 40, "adiaz", "Objetos 1", "Licenciado", "Informatica");
		profesores[3] = new Profesor("Gabriel", "Baum", 40, "baum", "Ingenieria", "Ingeniero", "Informatica");
		
		for (int i = 0; i < estudiantes.length; i++) {
			estudiantes[i].tusDatos();
		}
		
		for (int i = 0; i < profesores.length; i++) {
			profesores[i].tusDatos();
		}	
	}

}
