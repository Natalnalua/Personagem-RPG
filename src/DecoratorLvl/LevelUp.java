/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DecoratorLvl;

/**
 *
 * @author Willian Moreira
 */
public abstract class LevelUp extends Leveis {
    
    private final Leveis leveis;
    
    public LevelUp(Leveis leveis) {
        this.leveis = leveis;
    }
    public Leveis getLeveis() {
        return leveis;
    }
    
    @Override
    public int getVida() {
        return this.vida + leveis.getVida();
    }
    
    @Override
    public String getLevel() {
        return leveis.getLevel();
    }
}
