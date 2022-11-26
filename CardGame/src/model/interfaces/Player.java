https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
package model.interfaces;

/**
 * Assignment interface for SADI representing the player
 * to be implemented by SimplePlayer class with the following constructor:
 * 	  public SimplePlayer(String playerId, String playerName, int initialPoints)
 * 
 * NOTE: playerID is unique and if another player with same id is added it replaces the previous player
 * 
 * @author Caspar Ryan
 * 
 */
public interface Player
{
   /**
    * @return human readable player name
    */
   public abstract String getPlayerName();

   /**
    * @param playerName
    *            human readable player name
    */
   public abstract void setPlayerName(String playerName);

   /**
    * 
    * @return number of points from setPoints()
    */
   public abstract int getPoints();

   /**
    * @param points
    *            for betting (updated by GameEngineImpl with each win or loss)
    */
   public abstract void setPoints(int points);

   /**
    * @return the player ID which is generated by the implementing class
    */
   public abstract String getPlayerId();

   /**
    * @param bet
    *            the bet in points
    * @return true 
    *    if bet is greater than or equal to 0 and player had sufficient points to place the bet
    */
   public abstract boolean placeBet(int bet);

   /**
    * @return the bet as set with placeBet()
    */
   public abstract int getBet();

   /**
    * reset the bet to 0 for next round (in case player does not bet again in next round)
    */
   public abstract void resetBet();

   /**
    * @return the result of the most recent hand
    * 
    * @see view.interfaces.GameEngineCallback
    */
   public abstract int getResult();

   /**
    * 
    * @param result
    *            the result of the most recent hand
    * @see view.interfaces.GameEngineCallback
    */
   public abstract void setResult(int result);

   /**
    * 
    * @return a human readable String that lists the values of this Player
    *         instance (see OutputTrace.txt)
    */
   @Override
   public abstract String toString();
}