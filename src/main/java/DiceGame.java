import java.util.ArrayList;
import java.util.List;

public class DiceGame {
    private final List<Player> players = new ArrayList<>();
    private final List<Die> dice = new ArrayList<>();
    private final int maxRolls;
    private final Player currentPlayer;

    public DiceGame(int countPlayers, int countDice, int maxRolls) {

        /*Constructor that initializes all final instance fields.

Creates the required number of Player objects and Die objects and adds them to the appropriate lists.

If the number of players is less than 2, throws an IllegalArgumentException.*/

        try { this.maxRolls = maxRolls;
            players.forEach(Player < countPlayers);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }

    }


    private boolean allDiceHeld() {
        /*Returns true if all dice are held, false otherwise.

Hint: allMatch*/
    }


    public boolean autoHold(int faceValue) {
        /*
If there already is a die with the given face value that is held, just return true.

If there is a die with the given face value that is unheld, hold it and return true. (If there are multiple matches,
 only hold one of them.)

If there is no die with the given face value, return false.

Hints: filter, findFirst, isPresent*/
    }

    public boolean currentPlayerCanRoll() {
        /*	Returns true if the current player has any rolls remaining and if not all dice are held.*/
    }

    public int getCurrentPlayerNumber() {
        /*	Returns the player number of the current player.*/
    }

    public int getCurrentPlayerScore() {

        /*	Returns the score of the current player.*/

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
    }

    public String getGameResults() {
        /*Sorts the player list field by score, highest to lowest.

Awards each player that earned the highest score a win and all others a loss.

Returns a string composed by concatenating each Player's toString.

Hints: Comparator.comparingInt, reversed

More hints: forEach

Final hints: map, Collectors.joining*/
    }

    private boolean isHoldingDie(int faceValue) {
        /*
Returns true if there is any held die with a matching face value, false otherwise.

Hints: filter, findFirst, isPresent*/
    }

    public boolean nextPlayer() {
        /*If there are more players in the list after the current player, updates currentPlayer to be the next player
         and returns true.
         Otherwise, returns false.*/
    }

    public void playerHold(char dienum) {
        /*
Finds the die with the given die number (NOT the face value) and holds it.

Hints: filter, findFirst, isPresent*/

    }

    public void resetDice() {
        /*
Resets each die.

Hint: forEach*/
    }

    public void resetPlayers() {
        /*
Resets each player.

Hint: forEach*/
    }

    public void rollDice() {
        /*
Logs the roll for the current player, then rolls each die.

Hint: forEach*/
    }

    public void scoreCurrentPlayer() {
        /*
If there is currently a ship (6), captain (5), and crew (4) die held, adds the points for the remaining two dice
(the cargo) to the current player's score.

If there is not a 6, 5, and 4 held, assigns no points.

Note: The 6, 5, and 4 held as the ship, captain, and crew are not worth points.*/
    }

    public void startNewGame() {
    /*
Assigns the first player in the list as the current player. (The list will still be sorted by score from the previous
 round,
so winner will end up going first.)

Resets all players.*/
    }


}
