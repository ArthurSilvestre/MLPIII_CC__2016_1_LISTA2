//arquivo: Data.java
public class Data {
	public int dia;
	public int mes;
	public int ano;

	public Data() {}
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data(int dia, int mes) {
		this.dia = dia;
		this.mes = mes;
		this.ano = 2016;
	}
	
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}
}