package guessNumber;

public class GuessNumber {

    private String randomNumber;
    private final int[] randomNumbers;

    public GuessNumber(String randomNumber) {
        randomNumbers = parseString(randomNumber);
        this.randomNumber = randomNumber;
    }

    public String validate(String userInput) {
        int[] inputs = parseString(userInput);
        int correct = 0;
        for(int i = 0; i < 4; i++){
            if (inputs[i] == randomNumbers[i]) {
                correct++;
            }
        }
        return correct + "a0b";
    }

    private int[] parseString(String userInput) {
        int[] inputs = new int[4];
        for (int i = 0 ; i < 4; i++) {
            inputs[i] = Integer.parseInt(userInput.substring(i, i+1));
        }
        return inputs;
    }
}
