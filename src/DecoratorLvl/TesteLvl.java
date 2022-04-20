/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DecoratorLvl;

/**
 *
 * @author Willian Moreira
 */
public class TesteLvl {
    
    public static void main(String[] args) {
        LvlDruida lvlDruida = new LvlDruida();
        LevelUp x = new Level2(lvlDruida);
        x = new Level3(x);
        x = new Level4(x);
        
       System.out.println(x.getLevel());
       System.out.println(x.getVida());
        
    }
}
