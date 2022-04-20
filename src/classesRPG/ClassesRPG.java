/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesRPG;


public abstract class ClassesRPG {
    
    private int vida;
    private int forca;
    private int armadura;
    private int destreza;

    // <editor-fold desc="Gets e Sets"> 

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }
    
    // </editor-fold> 
    
    public abstract void getAtacar();
    
    public abstract void getDefender();
    
    public abstract void getHabilidade();
    
}
