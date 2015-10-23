package simon_4_evens_odds;

public class Simon_4_Evens_Odds {
  public static void main(String[] args) {
      
      int counter_even = 0;
      int counter_odd = 0;
      //the counter variable is outside
      //the loop -- otherwise
      for(int i = 0; i < 100; i++) {
      if(i % 2 == 0) {
      counter_even++;
      System.out.println("this is a counter" + "in the for loop: " + counter_even);
      
}
      else{
          //add counter for odds
          //print at the end the number of odds and number of evens
      }
} System.out.println("the final count is..." + counter_even);

}
  
}