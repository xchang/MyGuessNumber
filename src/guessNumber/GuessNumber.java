package guessNumber;

public class GuessNumber {

    private final int[] randomNumbers;

    public GuessNumber(String randomNumber) {
        randomNumbers = parseString(randomNumber);
    }

    public String validate(String userInput) {
        int[] inputs = parseString(userInput);
        int placeCorrect = 0;
        int placeIncorrect = 0;
        for(int i = 0; i < 4; i++){
            if (inputs[i] == randomNumbers[i]) {
                placeCorrect++;
            } else if (containsInput(randomNumbers, inputs[i])) {
                placeIncorrect++;
            }
        }

        return placeCorrect + "a" + placeIncorrect + "b";
    }

    private boolean containsInput(int[] randomNumbers, int input) {
        for (int randomNumber : randomNumbers) {
            if (randomNumber == input) {
                return true;
            }
        }
        return false;
    }

    private int[] parseString(String userInput) {
        int[] inputs = new int[4];
        for (int i = 0 ; i < 4; i++) {
            inputs[i] = Integer.parseInt(userInput.substring(i, i+1));
        }
        return inputs;
    }
}
