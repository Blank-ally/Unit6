import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DiceGame {
    private final List<Player> players = new ArrayList<>();
    private final List<Die> dice = new ArrayList<>();
    private final int maxRolls;
    private  Player currentPlayer;

    public DiceGame(int countPlayers, int countDice, int maxRolls) {

        /*Constructor that initializes all final instance fields.

Creates the required number of Player objects and Die objects and adds them to the appropriate lists.

If the number of players is less than 2, throws an IllegalArgumentException.*/


        if (countPlayers < 2 ){
            throw new IllegalArgumentException();
        }else {
            this.maxRolls = maxRolls;
            for (int i = 0; i < countPlayers; i++) {
                Player player = new Player();
                players.add(player);
            }
            for (int i = 0; i < countDice; i++) {
                Die die = new Die(6);
                dice.add(die);
            }
        }



    }


    private boolean allDiceHeld() {
        /*Returns true if all dice are held, false otherwise.


Hint: allMatch*/
return  dice.stream().allMatch(Die ::isBeingHeld);




    }


    public boolean autoHold(int faceValue) {
        /*
If there already is a die with the given face value that is held, just return true.

If there is a die with the given face value that is unheld, hold it and return true. (If there are multiple matches,
 only hold one of them.)

If there is no die with the given face value, return false.

Hints: filter, findFirst, isPresent*/

        boolean hold = false;
        for (Die die:dice
             ) {
            if (die.getFaceValue() == faceValue){
                die.holdDie();
                hold = true ;
            }

        }
        return hold ;
    }

   public boolean currentPlayerCanRoll() { //**
        /*	Returns true if the current player has any rolls remaining and if not all dice are held.*/

if (currentPlayer.getRollsUsed() < maxRolls){ return true ;}
else return false ;

    }

    public int getCurrentPlayerNumber() {
        /*	Returns the player number of the current player.*/

        return currentPlayer.getPlayerNumber();
    }

    public int getCurrentPlayerScore() {

        /*	Returns the score of the current player.*/
      return  currentPlayer.getScore();

    }

    public String getDiceResults() {
        /*
Resets a string composed by concatenating each Die's toString.

Hints: map, Collectors.joining*/


    }

    public String getFinalWinner() {
        /*
Finds the player with the most wins and returns its toString.

Hints: Collections.max, Comparator.comparingInt*/


        return "player" + + " Wins";

    }



    public String getGameResults() {
        /*Sorts the player list field by score, highest to lowest.

Awards each player that earned the highest score a win and all others a loss.

Returns a string composed by concatenating each Player's toString.

Hints: Comparator.comparingInt, reversed

More hints: forEach

Final hints: map, Collectors.joining*/
        players.stream().max(players::compare).get();
    }

    private boolean isHoldingDie(int faceValue) {
        /*
Returns true if there is any held die with a matching face value, false otherwise.

Hints: filter, findFirst, isPresent*/


        List<Die> held =
        dice.stream().filter(Die::isBeingHeld).toList();
        for (Die die : held
             ) {  if (die.getFaceValue() ==faceValue)
        { return true;}
        else return false;
        }




    }

    public boolean nextPlayer() {
        /*If there are more players in the list after the current player, updates currentPlayer to be the next player
         and returns true.

         Otherwise, returns false.*/
        if (! currentPlayer. equals(players.size())){
            return true ;
        } else return false;


    }

    public void playerHold(char dienum) {
        /*
Finds the die with the given die number (NOT the face value) and holds it.

Hints: filter, findFirst, isPresent*/

      List <Die> Dice = dice.stream().filter(die -> die.getDieNum() == dienum).collect(Collectors.toList());




    }

    public void resetDice() {
        /*
Resets each die.

Hint: forEach*/
        for (Die die: dice
             ) {die.resetDie();

        }



    }

    public void resetPlayers() {
        /*
Resets each player.

Hint: forEach*/
        for (Player player:players
             ) { player.resetPlayer();

        }
    }

    public void rollDice() {
        /*
Logs the roll for the current player, then rolls each die.

Hint: forEach*/
        currentPlayer.roll();
        for (Die die:dice
             ) { die.rollDie();

        }
    }

    public void scoreCurrentPlayer() {
        /*
If there is currently a ship (6), captain (5), and crew (4) die held, adds the points for the remaining two dice
(the cargo) to the current player's score.

If there is not a 6, 5, and 4 held, assigns no points.

Note: The 6, 5, and 4 held as the ship, captain, and crew are not worth points.*/

    if (allDiceHeld() == true ) {
        for (Die die : dice) {
           if (!die.isBeingHeld()){
               currentPlayer.setScore(die.getFaceValue());
           }
        }
} else  currentPlayer.setScore(0);

    }

    public void startNewGame() {
    /*
Assigns the first player in the list as the current player. (The list will still be sorted by score from the previous
 round,
so winner will end up going first.)

Resets all players.*/

        currentPlayer = players.get(1);
       resetPlayers();

    }


}
