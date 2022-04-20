package racas;


public class Elfo extends Raca {
    
    public Elfo() {
        this.setNome("April");
        this.setDestreza(12);
        this.setVelocidade(2);
    } 

    @Override
    public double getVelocidade() {
        return super.getVelocidade();
    }

    @Override
    public int getDestreza() {
        return super.getDestreza();
    }

    @Override
    public String getNome() {
        return super.getNome(); 
    }
    
}
