/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solidprinciple;

/**
 *
 * @author hassa
 */
public class Controller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fighting f=new Fighting();
        double randomNumber1 = Math.random();
        double humanPower=randomNumber1*3434;
        double randomNumber2 = Math.random();
        double computerPower=randomNumber2*3434;
        
        
        
        Icharacter human=new Warrior(humanPower);
        
        Icharacter computerPlayer=new Dragon(computerPower);
        
       
        f.startFight(human, computerPlayer);
    }
    
}
