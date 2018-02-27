package holamundo;

public class HolaMundo {
	public static void main(String[] args) {
		System.out.print("HOLA MUNDO DESDE GIT");
		System.out.print("PRUEBA RAMA MASTER");
		System.out.print("PRUEBAS CON RAMAS");
		
		PruebaGit pruebaGit=new PruebaGit();
		System.out.println(pruebaGit.getCampoDeClase1());
	}
}

class PruebaGit{
	public PruebaGit() {
		// TODO Auto-generated constructor stub
		campoDeClase1="ESTE ES UN CAMPO DE CLASE";
	}
	
	public String getCampoDeClase1() {
		return campoDeClase1;
	}

	public void setCampoDeClase1(String campoDeClase1) {
		this.campoDeClase1 = campoDeClase1;
	}

	private String campoDeClase1;
}