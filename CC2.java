//Import scanenrs and such
import java.util.*;
//Start of class
public class CC2 {
    //Start of method
    public static void main(String[] args) {
        //Decaring variables
        Scanner input = new Scanner(System.in);
        String player1;
        String player2;
        System.out.print("Player 1:");
        player1=input.next();
        System.out.print("\n"+"Player 2:");
        player2=input.next();
        if(totalPoints(player1)>totalPoints(player2)){
            System.out.println("Player 1 wins!");
        }
        else if((totalPoints(player1)==totalPoints(player2))){
            System.out.println("Tie!");
        }
        else{
            System.out.println("Player 2 wins!");
        }

        
    }
    //Method to calculate the total points in a given word
    public static int totalPoints(String word){
        //Declaring two arrays, one for each character and one for each numerical value associated with each character.
        String[] letters= new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", };
        int [] points=new int[]{1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
        int wordpoint=0;
        //outer loop goes through the letters in the word
        for ( int i=0; i<word.length();i++){
            //Inner loop runs 26 times for each letter of the alphabet
            for (int j=0;j<26;j++){
                //if the letter of the word matches the letter of the alphabet then add the corresponding amount of points
                if(letters[j].equalsIgnoreCase(word.substring(i,i+1))){
                    wordpoint+=points[j];
                }

            }
        }
        return wordpoint;
    }
}
