
package ca.sheridancollege.project;

/**
 *
 * @author Sukhmanpreet Kaur, Apr 12, 2022
 */
//Singleton
public class BlackJack extends Game{
    
    private static BlackJack Bj;
    @Override
    public void play() {
        
    }

    @Override
    public void declareWinner() {
        
    }
    

    @Override
    public void setGameName(String gameName) {
        super.setGameName(gameName); 
    }
    private BlackJack(){
        
    }
    public static BlackJack getInstance(){
        if(Bj==null){
            Bj= new BlackJack();
        }
        return Bj;
    }
    public boolean checkBusted(int score){
        if(score>21){
            return true;
        }
        else
            return false;
    }
    public void getRegistered(String firstName, String lastName){
        
    }
    public void displayScore(Player player){
        
    }
    public void restart(){
        
    }
}
