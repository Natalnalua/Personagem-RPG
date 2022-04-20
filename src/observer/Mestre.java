package observer;

public class Mestre implements IMestre{
    
    private String nome;
    private IFichas f;

    public Mestre(String nome, IFichas f) {
	this.nome = nome;
	this.f = f;
	f.registrarMestre(this);
    }
	
    @Override
    public void update(Ficha e) {
	System.out.println(nome+ " recebeu a ficha "+e.getNumFicha()+ " de "+e.getNome());

    }
	
    public void cancelarAssinatura() {
	f.removerMestre(this);
    }
}
