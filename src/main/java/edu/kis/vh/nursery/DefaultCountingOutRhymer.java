package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int ERROR_CODE_DEFAULT = -1;
    private static final int TOTAL_START = -1;
    private static final int NUMBERS_LENGTH = 12;
    private final int[] numbers = new int[NUMBERS_LENGTH];

    private int total = TOTAL_START;

    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    protected boolean callCheck() {
        return total == TOTAL_START;
    }

    protected boolean isFull() {
        return total == NUMBERS_LENGTH - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_CODE_DEFAULT;
        return numbers[total];
    }

    protected int countOut() {
        if (callCheck())
            return ERROR_CODE_DEFAULT;
        return numbers[total--];
    }

}
