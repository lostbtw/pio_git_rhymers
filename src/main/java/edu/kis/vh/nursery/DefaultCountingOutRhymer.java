package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int ERROR_CODE_DEFAULT = -1;
    private static final int TOTAL_START = -1;
    private static final int NUMBERS_LENGTH = 12;
    private int[] numbers = new int[NUMBERS_LENGTH];

    public int total = TOTAL_START;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTAL_START;
    }

    public boolean isFull() {
        return total == NUMBERS_LENGTH - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_CODE_DEFAULT;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_CODE_DEFAULT;
        return numbers[total--];
    }

}
