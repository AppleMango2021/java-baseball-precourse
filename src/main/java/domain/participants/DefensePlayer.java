package domain.participants;

import java.util.Random;

import domain.Numbers;

public class DefensePlayer {

    private Numbers answer;

    public DefensePlayer(){}

    public Numbers decideAnswerNumber() {
        answer = new Numbers();
        int digit;
        while(answer.getDigits().size()<Numbers.MAX_SIZE){
            digit = generateRandomNumber();
            answer.add(digit);
        }
        return answer;
    }

    private int generateRandomNumber() {
        Random random = new Random();
        int generatedNumber;
        do{
            generatedNumber = random.nextInt(10);
        }while(isDuplicated(generatedNumber));

        return generatedNumber;
    }

    private boolean isDuplicated(int generatedNumber) {
        return answer.getDigits().contains(generatedNumber);
    }

    public Numbers getAnswer() {
        return answer;
    }
}