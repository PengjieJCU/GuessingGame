public class ExampleUnitTest{
    @Test
    public void addition_isCorrect(){
        assertEquals(expected:4, actual:2 + 2);
    }
    @Test
    public void run_game(){
        Game game = new Game();

        boolean guessedCorrect= false;
        for (int i = 1; i < 11; ++i){
            guessedCorrect = game.check(i);
            if (guessedCorrect){
                break;
            }
        }
        assertTure(guessedCorrect);
    }
}
