package classesRPG;

public class Guerreiro extends ClassesRPG {

    public Guerreiro() {
        this.setVida(20);
        this.setArmadura(10);
        this.setForca(8);
        this.setDestreza(2);
    }
    
    @Override
    public void getAtacar() {
        System.out.println("Guerreiro atacou");
    }

    @Override
    public void getDefender() {
        System.out.println("Guerreiro defendeu");
    }

    @Override
    public void getHabilidade() {
        System.out.println("Guerreiro usou a habilidade especial");
    }

}
