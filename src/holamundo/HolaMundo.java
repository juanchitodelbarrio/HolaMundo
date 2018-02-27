package holamundo;

public class HolaMundo {
	public static void main(String[] args) {
		System.out.println("HOLA MUNDO DESDE GIT");
		System.out.println("PRUEBA RAMA MASTER");
		System.out.println("PRUEBAS CON RAMAS");
		
		PruebaGit pruebaGit=new PruebaGit();
		pruebaGit.setCampoDeClase1("SE CAMBIA VALOR DE CAMPO DE CLASE");
		System.out.println(pruebaGit.getCampoDeClase1());
	}
}

class PruebaGit{
	public PruebaGit() {
		// TODO Auto-generated constructor stub
		campoDeClase1="ESTE ES UN CAMPO DE CLASE 1";
		campoDeClase2="ESTE ES UN CAMPO DE CLASE 2";
	}
	
	public String getCampoDeClase1() {
		return campoDeClase1;
	}

	public void setCampoDeClase1(String campoDeClase1) {
		this.campoDeClase1 = campoDeClase1;
	}
	private String campoDeClase1;
	private String campoDeClase2;
	
}

class ClaseTesteo{
	
}