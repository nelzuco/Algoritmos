package practica2;

public class Estudiante {
		private String nombre;
		private String apellido;
		private String email;
		private int comision;
		private String direccion;
		
		
		public Estudiante(String nombre, String apellido, String email, int comision, String direccion){
			this.nombre = nombre;
			this.apellido = apellido;
			this.email = email;
			this.comision = comision;
			this.direccion = direccion;
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getComision() {
			return comision;
		}
		public void setComision(int comision) {
			this.comision = comision;
		}
		public void setDirecion(String direccion){
			this.direccion= direccion;
		}
		public String getDireccion(){
			return direccion;
		}
		
		//METODOS
		
		public void tusDatos(){
			System.out.println("Apellido: " +this.getApellido());
			System.out.println("Nombre: " + this.getNombre());
			System.out.println("Email: " + this.getEmail());
			System.out.println("Comision: " +this.getComision());
			System.out.println("Direccion: "+this.getDireccion());
			
		}
}
