# BlackJack

Week 3 SKill Distillery Project -

BlackJack is a text-based game to model the card game BlackJack. 


### How to Run/Play
The game is ran from the play.java file
<ul>
  <p>&#x00B7 Upon execution, you will be prompted to enter your name.</br>
   &#x00B7 You and the dealer will be dealt 2 cards to begin the game </br>
   &#x00B7 if either the dealer or the player are dealt a 21 from the first 2 cards, the game will <strong>end</strong></br>
   &#x00B7 <strong> If not... </strong></br>
   &#x00B7 the game will prompt you to 'hit' or 'stay' </br>
   &#x00B7 the user will not 'hit' if they are at or above 17</br>
   &#x00B7 the game will continue until either the dealer or player hit 21 and win <em>or</em> either goes over 21 and they 'bust'</br>
   &#x00B7 The game will automatically stop execution once one of the above conditions are met.
    </p>
</ul>

### Class Structure 
The program consists of 8 classes

<ul>
  <p><strong>&#x00B7Rank</strong> class consisting of ENUM's to make up the 'rank' of each card in the deck  </br>
     <strong>&#x00B7Suit</strong> class consisting of ENUM's to make up the 'suit' of each card in the deck    </br>
     <strong>&#x00B7Card</strong> class used to create card objects implementing the 'rank' and 'suit' classes     </br>
     <strong>&#x00B7Deck</strong>  class used to create an array list of cards (52 to be exact) used as a 'deck' to draw from in the game     </br>
     <strong>&#x00B7Hand</strong> class used to create 'hand' objects that hold card objects within them to represent a 'hand' for the player as well as the dealer     </br>
     <strong>&#x00B7Player</strong> class where information is stored for both the computer (dealer) and the user. Information includes name (for user), hand, and hand value. </br>
     <strong>&#x00B7GameLogic</strong>  class where all the game logic is stored. How to win, when to quit the game, how to manipulate the deck to remove cards after they are dealt, storing hand values, etc.  </br>
     <strong>&#x00B7Play</strong>  Main class where the program is ran. Only calls the 'GameLogic' class   </br>

######Patrick Gaston
