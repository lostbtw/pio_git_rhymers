package edu.kis.vh.nursery;

/**
 * Działa tak samo jak klasa DefaltCountingOutRhymer z zamieniona funkcja countOut
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * Zwraca taki sam wynik jak standardowa funckja countOut (@return)
     */
    @Override
    protected int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
