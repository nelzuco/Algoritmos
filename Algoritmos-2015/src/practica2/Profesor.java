package practica2;

public class Profesor {
		private String nombre;
		private String apellido;
		private int edad;
		private String email;
		private String catedra;
		private String titulo;
		private String facultad;
		
		public Profesor(String nombre, String apellido, int edad, String email, String catedra, String titulo, String facultad){
			this.nombre= nombre;
			this.apellido= apellido;
			this.edad= edad;
			this.email= email;
			this.catedra= catedra;
			this.titulo= titulo;
			this.facultad= facultad;		
		}
		
		//GETTERS SETTERS
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getCatedra() {
			return catedra;
		}
		public void setCatedra(String catedra) {
			this.catedra = catedra;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getFacultad() {
			return facultad;
		}
		public void setFacultad(String facultad) {
			this.facultad = facultad;
		}
		
		//METODOS
		public void tusDatos(){
			System.out.println("Apellido: " + getApellido());
			System.out.println("Nombre: " + getNombre());
			System.out.println("Edad: " + getEdad());
			System.out.println("Email: " + getEmail());
			System.out.println("Catedra: "+ getCatedra());
			System.out.println("Titulo: "+ getTitulo());
			System.out.println("Facultad: " + getFacultad());
		}
		
}
