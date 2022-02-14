import java.util.*

private val input = Scanner(System.`in`);
private val scrabbleScore = ScrabbleScore();


fun main(args: Array<String>) {
   println( scrabbleScore.letterValues())
    while (true) {
        print("Enter a word and compute the Scrabble Score: ")
        val word = input.nextLine()

        println("$word has a value of ${scrabbleScore.scoreWord(word)}")
    }
}