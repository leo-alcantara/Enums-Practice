package se.lexicon;

import java.util.Arrays;
import java.util.Random;

public enum Dice {

    D6(6) {
        public double roll() {
            Random random = new Random();
            return random.nextInt(6) + 1;
        }
    },
    D10(10) {
        public double roll() {
            Random random = new Random();
            return random.nextInt(10) + 1;
        }
    },
    D20(20) {
        public double roll() {
            Random random = new Random();
            return random.nextInt(20) + 1;
        }
    },
    D100(100) {
        public double roll() {
            Random random = new Random();
            return random.nextInt(100) + 1;
        }
    };

    private final int maxValue;


    Dice(int value) {
        this.maxValue = value;
    }

    public int getMaxValue() {
        return maxValue;
    }


    public double roll() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }


}
