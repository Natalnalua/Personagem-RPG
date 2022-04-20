package classesRPG;

public class Mago extends ClassesRPG {

    public Mago() {
        this.setVida(18);
        this.setArmadura(8);
        this.setForca(10);
        this.setDestreza(2);
    }
    
    @Override
    public void getAtacar() {
        System.out.println("Mago atacou");
    }

    @Override
    public void getDefender() {
        System.out.println("Mago defendeu");
    }

    @Override
    public void getHabilidade() {
        System.out.println("Mago usou a habilidade especial");
    }

}
