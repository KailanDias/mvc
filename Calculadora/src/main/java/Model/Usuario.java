package Model;
public class Usuario {
	private Integer id;
	private int numero1;
	private int numero2; 
	private int resultado;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getnumero1() {
		return numero1;
	}
	public void setnumero1(int numero1) {
		this.numero1 = numero1;
	}
	public int getnumero2() {
		return numero2;
	}
	public void setnumero2(int numero2) {
		this.numero2 = numero2;
	}
	
	public void dividir(){
		this.resultado = this.numero1/this.numero2;
	}
	
	public int getresultado(){
		return this.resultado;
	}
}

