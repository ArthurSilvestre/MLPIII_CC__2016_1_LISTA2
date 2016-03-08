public class Programa {
	public static void main(String[] args) {
		VeiculoDeCarga veiculo1 = new VeiculoDeCarga();
		VeiculoDePasseio veiculo2 = new VeiculoDePasseio();
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.setNome("Arthur Silvestre");
		pessoa1.setCpf(10);
		
		veiculo1.setAno(2010);
		veiculo1.setCapacidadeCarga(2000);
		veiculo1.setKmInicial(0);
		veiculo1.setKmFinal(10000);
		veiculo1.setChassi("AW92JS031A0S120MDAS0312N");
		veiculo1.setMarca("Fiat");
		veiculo1.setPlaca("AWK9201");
		veiculo1.setModelo("Gran Siena");
		veiculo1.setValorKmRodado(5000);
		veiculo1.setValorLocacao(500);
		veiculo1.setProprietario(pessoa1);
		
		System.out.println(veiculo1);
		System.out.println(veiculo2);
	}
}