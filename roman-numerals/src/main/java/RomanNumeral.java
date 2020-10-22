import java.util.Collections;
import java.util.TreeMap;

public class RomanNumeral {

    private int n;
    private final static TreeMap<Integer, String> romanNum = new TreeMap<>(Collections.reverseOrder());

    static {
        romanNum.put(1, "I");
        romanNum.put(4, "IV");
        romanNum.put(5, "V");
        romanNum.put(9, "IX");
        romanNum.put(10, "X");
        romanNum.put(40, "XL");
        romanNum.put(50, "L");
        romanNum.put(90, "XC");
        romanNum.put(100, "C");
        romanNum.put(400, "CD");
        romanNum.put(500, "D");
        romanNum.put(900, "CM");
        romanNum.put(1000, "M");
    }

    public RomanNumeral(int n) {
        this.n = n;
    }

    public String getRomanNumeral() {
        var sb = new StringBuilder();

        for (var e : romanNum.entrySet()) {
            var i = e.getKey();
            var roman = e.getValue();

            while (n >= i) {
                sb.append(roman);
                n -= i;
            }
        }
        return sb.toString();
    }
}
