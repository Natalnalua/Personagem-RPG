package classesRPG;

public class Druida extends ClassesRPG {

    public Druida() {
        this.setVida(22);
        this.setArmadura(8);
        this.setForca(9);
        this.setDestreza(2);
    }
    
    @Override
    public void getAtacar() {
        System.out.println("Druida atacou");
    }

    @Override
    public void getDefender() {
        System.out.println("Druida defendeu");
    }

    @Override
    public void getHabilidade() {
        System.out.println("Druida usou a habilidade especial");
    }

}
