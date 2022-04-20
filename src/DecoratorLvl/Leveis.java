/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DecoratorLvl;

/**
 *
 * @author Willian Moreira
 */
    public abstract class Leveis {
    
    protected String level;    
    protected int vida;
    
    public String getLevel() {
        return level;
    }
    
    public void setLevel(String level){
        this.level = level;
    }
    
    public int getVida() {
        return vida;
    }
    
    public void setVida(int vida) {
        this.vida = vida;
    }  
}
