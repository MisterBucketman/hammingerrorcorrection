package hammingerrorcorrection;

public class BitGetterSetter {

    public static int getBitAt(byte data, int index) {
        int shift = 7 - index;
        return (data & (1 << shift)) >> shift;
    }

    public static byte setBitAt(byte data, int index, int bit) {
        if (bit == 1) {
            return (byte) (data | (1 << (7 - index)));
        } else {
            return (byte) (data & ~(1 << (7 - index)));
        }
    }
}

