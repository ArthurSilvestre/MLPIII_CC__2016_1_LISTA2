public class Programa {
	public static void main(String[] args) {
		FitaInfantil fitaInf1 = new FitaInfantil();
		FitaLancamento fitaLan1 = new FitaLancamento(); 
		Autor autorDeTodos = new Autor("Joseph");
		
		fitaInf1.setTitulo("As aventuras de Mickey");
		fitaInf1.setAutor(autorDeTodos);
		fitaInf1.setCategoria(CategoriasDeFilmes.INFANTIL);
		fitaInf1.setPreco(10.5);
		
		fitaLan1.setTitulo("Casa assombrada");
		fitaLan1.setAutor(autorDeTodos);
		fitaLan1.setCategoria(CategoriasDeFilmes.TERROR);
		fitaLan1.setPreco(15);
		
		System.out.println(fitaInf1);
		System.out.println(fitaLan1);
	}
}
