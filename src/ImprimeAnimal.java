
public class ImprimeAnimal {

	public static void main(String[] args) { 
		
		TesteAnimais t = new TesteAnimais();
		
		
		t.Idade(new Cachorro());
		t.Nome(new Cachorro());
		t.Som(new Cachorro());
		t.Movimento(new Cachorro());
		System.out.println();
//---------------------------------------------	
		
		t.Idade(new Cavalo());
		t.Nome(new Cavalo());
		t.Som(new Cavalo());
		t.Movimento(new Cavalo());
		System.out.println();
//----------------------------------------------		 
		
		t.Idade(new Preguiça());
		t.Nome(new Preguiça());
        t.Som(new Preguiça());	
        t.Movimento(new Preguiça());
        
	}
}

