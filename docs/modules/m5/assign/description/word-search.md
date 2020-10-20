# Word Search Game

[![Stilfehler, CC BY-SA 3.0 <https://creativecommons.org/licenses/by-sa/3.0>, via Wikimedia Commons; https://en.wikipedia.org/wiki/Boggle#/media/File:Boggle.jpg](img/boggleWiki.jpg)](https://commons.wikimedia.org/wiki/File:Boggle.jpg)


## Problem Overview

In this assignment, you will implement a version of a word search game much
like [Boggle](https://en.wikipedia.org/wiki/Boggle) and other similar word
games. The approach you take to finding words on the board will be a direct
application of [depth-first search](https://en.wikipedia.org/wiki/Depth-first_search) with
[backtracking](https://en.wikipedia.org/wiki/Backtracking).

The version of the game that you will implement is played on a square board
according to the following rules.

1. Each position on the board contains one or more uppercase letters.
1. Words are formed by joining the contents of adjacent positions on the board.
1. Positions may be joined horizontally, vertically, or diagonally, and the board does not wrap around.
1. No position on the board may be used more than once within any one word.
1. A specified minimum word length (number of letters) is required for all valid words.
1. A specified lexicon is used to define the set of all valid words.

Below, from left to right, is a sample 4x4 board with single letters in each
position, a sequence of positions forming the word PEACE, and the list of all
words with a minimum length of 5 found on the board using the words in the
standard Unix `/usr/share/dict/words` file as the lexicon.

![Sample board, words, and sequence](img/overview.png)

A string is said to be **on the board** if it can be constructed according to
rules 1 through 4. A string is said to be a **valid word** if it is contained
in the specified lexicon (rule 6). A **scorable word** is a valid word of at
least the specified minimum length (rule 5) that is on the board.

HNTQ is on the board, but is not a valid word. PLACE, POPE, and PALE are valid
words, but are not on the board. PEACE is a scorable word for any minimum
length between 1 and 5. BOY is a valid word and it is on the board, but it
would not be a scorable word if the specified minimum length is 4 or greater.

The score for a scorable word is calculated as follows: one point for the
minimum number of characters, and one point for each character beyond the
minimum number. Thus, each scorable word of length K > M is worth 1 + (K - M)
points, where M is the specified minimum length. For example, the scorable
words of length five or more on the board above would earn a score of 31. (22
words of length 5, 3 words of length 6, and 1 word of length 7 give 22 + 6 + 3
= 31 points.)


## Implementation Details

You must implement your solution to the assignment in terms of two provided
files: `WordSearchGame.java` and `WordSearchGameFactory.java`, **plus** one
class that you create from scratch all on your own. The interface
`WordSearchGame` describes all the behavior that is necessary to play the
game. So, we can think of this interface as the specification for a *game
engine*. You must develop your own game engine that meets this specification.
That is, you must write a class that implements the `WordSearchGame`
interface. You can name this class anything you want and you can add as many
additional methods as you like. 

The `WordSearchGameFactory` is a class with a single 
[*factory method*](https://en.wikipedia.org/wiki/Factory_method_pattern) for creating
game engines. You must modify the `createGame` method to return an instance of
your class that implements the `WordSearchGame` interface. Factory classes
like this are convenient ways of completely separating an implementation (your
class) from a specification (the provided interface). For example, the test
suite used for grading has been written completely in terms of the interface
and without any knowledge of the specific classes used in your implementation.

A brief example client along with the corresponding output are given below.
Although the class that implements the `WordSearchGame` interface must be in
the same directory, the `ExampleGameClient` code is independent of its name or
any other details of the class.

```java
public class ExampleGameClient {
    public static void main(String[] args) {
       WordSearchGame game = WordSearchGameFactory.createGame();
       game.loadLexicon("wordfiles/words.txt");
       game.setBoard(new String[]{"E", "E", "C", "A", "A", "L", "E", "P", "H", 
                                  "N", "B", "O", "Q", "T", "T", "Y"});
       System.out.print("LENT is on the board at the following positions: ");
       System.out.println(game.isOnBoard("LENT"));
       System.out.print("POPE is not on the board: ");
       System.out.println(game.isOnBoard("POPE"));
       System.out.println("All words of length 6 or more: ");
       System.out.println(game.getAllValidWords(6));
    }
}
```

Corresponding output:  

```
LENT is on the board at the following positions: [5, 6, 9, 14]
POPE is not on the board: []
All words of length 6 or more: 
[ALEPOT, BENTHAL, PELEAN, TOECAP]
```


## Methods related to the lexicon

The three methods in the `WordSearchGame` interface that relate to loading and
searching the lexicon are `loadLexicon`, `isValidWord`, and `isValidPrefix`.
While `loadLexicon` is called only once per game, `isValidWord` and
`isValidPrefix` will be called heavily throughout game play. These two methods
**must be efficient** if the game is to run with reasonable response times
when using large lexicons. The choice of collection or data structure to store
the lexicon will determine just how efficient these methods can be.  

You have two basic choices to represent the lexicon: use a prebuilt collection
from the JCF or implement your own custom data structure or collection. If you
choose the former option,
[`TreeSet`](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/TreeSet.html)
will offer very good performance and provide very convenient methods. If you
choose the latter option, a [*trie*](https://en.wikipedia.org/wiki/Trie) will
provide even better (time) performance and will be a fun challenge to
implement. The choice is completely up to you. A good (and optional) idea
would be to develop your solution with a `TreeSet` to store the lexicon and
then, if you have plenty of time at the end, make an attempt at building your
own trie (or similar custom data structure).

The `loadLexicon` method reads a list of words from a text file and stores
each unique word in the data structure or collection that you select to
represent the lexicon. You will notice that many of the words in the provided
lexicon files are in lowercase while the game board is in uppercase. Be sure
that the lexicon is loaded and all string comparisons are made in a
case-insensitive manner. You will also notice that the provided lexicon files
have different content and formats. Using a simple scanner, however, it is
possible to use the same code to read in all the provided lexicon files.

Note that the lexicon must be loaded before calling many of the other
`WordSearchGame` methods. If any method that is dependent on a lexicon is
called before `loadLexicon`, your code must throw an `IllegalStateException`.
See the source code documentation for details.

The `isValidWord` method searches the data structure that holds the lexicon
for a specified string and indicates whether or not that string is present. If
the string is present then it is a valid word. If the string is not present
then it is not a valid word.

The `isValidPrefix` method searches the data structure that holds the lexicon
to determine if any word in the lexicon begins with the specified string. For
the purposes of this method, a string should be considered a prefix of itself.
For example, "cat" is a prefix of "cat" as it is of "catalog".


## Methods related to the board

The `setBoard` method accepts an array of length N^2 that specifies the
content of each position on the NxN board. The elements of the array are the
Strings on the board listed in 
[row-major order](https://en.wikipedia.org/wiki/Row-_and_column-major_order). 
Thus, the elements in the array from index 0 to N^2 - 1 correspond to the
positions on the board from left to right, top to bottom. The element at index
0 stores the contents of the board position (0, 0) - the upper left corner -
and the element at index N^2 - 1 stores the contents of the board position
(N-1, N-1) - the bottom right corner. In general, the String at index 
row * N + col is the content of board position (row, col). 

For example, the array `a = ["E", "E", "C", "A", "A", "L", "E", "P", "H", "N",
"B", "O", "Q", "T", "T", "Y"]` would correspond to the board show below on the
left. The same board is shown below on the right but with each element
annotated with its row-major position. Note that the letter N is at board
position (2, 1), which corresponds to row-major position 2 * 4 + 1 = 9.

![Sample board annotated with row-major position numbers.](img/row-major.png)

The primary responsibility of the `setBoard` method is to populate the data
structure that you choose to represent the board with the contents of the
provided array of Strings. Once again, the choice of data structure to
represent the board should be made in support of the algorithms that will
depend on it (see game play methods below). Two obvious data structure choices
include (a) just keeping the one-dimensional array of strings as the board
representation or (b) creating a two-dimensional array of strings to directly
represent the two-dimensional board being modeled. Other choices are possible,
and the one you pick is at your discretion.

The implementing class of the `WordSearchGame` interface must have a default
board. Specifically, the above board should be set as the default so that it
is available for game play even if the `setBoard` method has not been called.

The `getBoard` method returns a string representation of the current board
suitable for printing to standard out (i.e., as an argument to
`System.out.println`). There is no particular format required. Choose the
format that is most helpful to you. This method will not be tested or graded.


## Methods related to game play

The methods that implement game play options are `getAllValidWords`,
`isOnBoard`, and `getScoreForWords`. The `getAllValidWords` method returns a
[`SortedSet`](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/SortedSet.html)
of strings containing all words on the board that are of a specified minimum
length and can be constructed according to the game rules. If no words can be
found, this method returns an empty `SortedSet`. 

The `isOnBoard` method takes a string parameter and returns true if that
string is on the board and false otherwise. If the string is on the board,
this method returns a
[`List`](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/List.html)
of
[`Integers`](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/Integer.html)
representing the row-major positions of each *substring*. (Remember: the board
positions are filled with strings, not necessarily just single characters).
For example, `isOnBoard("PEACE")` would return the list `[7, 6, 3, 2, 1]`. 

![Example board for isOnBoard("PEACE");](img/isOnBoard.png)

Both `getAllValidWords` and `isOnBoard` can be implemented using slightly
different versions of depth-first search. The specific depth-first algorithms
that you implement must be efficient enough for use on large game boards with
large lexicons.

The `getScoreForWords` method returns the cumulative score of all the *scorable* words in the given `SortedSet`. 


## Provided word list files

You have been provided with several word list files for creating lexicons. 

- [`CSW12.txt`](data/CSW12.txt): 270,163 unique words, used in international Scrabble tournaments
- [`OWL.txt`](data/OWL.txt): 167,964 unique words, used in North American Scrabble tournaments
- [`words.txt`](data/words.txt): 234,371 unique words, provided with Unix distributions
- [`words_medium.txt`](data/words_medium.txt): 172,823 unique words, subset of the Unix list
- [`words_small.txt`](data/words_small.txt): 19,912 unique words, small subset of the Unix list

Your solution should run efficiently with each of these files used for the lexicon.


## Acknowledgements

Word search games of various sorts are popular CS 2 assignments because they
bring together several important topics all in one place. This version of the
word search problem owes thanks to (at least): Julie Zelenski, Owen Astrachan,
and Mike Smith.


