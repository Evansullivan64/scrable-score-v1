class ScrabbleScore {

    fun scoreWord(word: String): Int{
      var letters: CharArray = word.toCharArray()
      var score:Int = 0
        //need to find the value of each letter and add that value to score
        for(i:Int in 0..letters.size-1){
            score =score+ scoreLetter(letters[i])
        }
       return score

        //TODO calculate using the scoreLetter method below, the scrabble value of the word passed as a parameter
    }

    //TODO the program if the user enters in any chars other than capital letters...try fix this.
    //Reference: https://exercism.org/tracks/kotlin/exercises/scrabble-score/solutions?page=1
    private fun scoreLetter(char: Char): Int {
       var CHAR:Char = char.uppercaseChar()

    return when (CHAR) {
        in "AEIOULNRST" -> 1
        in "DG" -> 2
        in "BCMP" -> 3
        in "FHVWY" -> 4
        in "K" -> 5
        in "JX" -> 8
        in "QZ" -> 10
        else -> error("Unknown character")
    }


    }

    fun letterValues() = """Letter                           Value
           A, E, I, O, U, L, N, R, S, T       1
           D, G                               2
           B, C, M, P                         3
           F, H, V, W, Y                      4
           K                                  5
           J, X                               8
           Q, Z                               10"""
}