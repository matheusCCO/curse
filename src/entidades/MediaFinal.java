package entidades;

public class MediaFinal {
	public String nome;
	public double primeira;
	public double segunda;
	public double terceira;
	
	
	
	public double media() {
		return primeira + segunda + terceira;
	}
	
	public double notaFaltante() {
		return  60.0 - media();
	}
	
	
}


