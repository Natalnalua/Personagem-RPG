package racas;

public class Humano extends Raca{
    
    public Humano() {
        this.setNome("Marco");
        this.setDestreza(10);
        this.setVelocidade(1.5);
    } 

    @Override
    public double getVelocidade() {
        return super.getVelocidade(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getDestreza() {
        return super.getDestreza(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getNome() {
        return super.getNome(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
