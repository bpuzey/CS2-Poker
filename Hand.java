import java.util.*;

public class Hand implements Comparable {
   private ArrayList<Card> hand;

   public Hand(){
      hand = new ArrayList<Card>();
   }

   public void add(Card c){
      hand.add(c);
   }

   public void sortHand(){
      Collections.sort(hand);
   }

   public String toString(){
      return hand.toString();
   }

   /*
   BEST
   Royal Flush
   Straight Flush
   Four of a Kind
   Full House
   Flush
   Straight
   Three of a Kind
   Two Pair
   One Pair
   High Card
   WORST
   */
   public String handValue() {
     return "TODO: String of Best Hand; may need helper methods";
   }

   public int compareTo(Object x){
      Hand other = (Hand)x;
      return 0;//change later, just for compiling
      //TODO: Compare hands by ordering above; return -1, 1, or 0
   }
}
