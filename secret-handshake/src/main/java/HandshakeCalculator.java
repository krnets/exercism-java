import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        var shake = new ArrayList<Signal>();
        var enumVals = Signal.values();
        var enumLength = enumVals.length;

        for (int i = 0; i < enumLength; i++) {
            if (isBitOn(number, i))
                shake.add(enumVals[i]);
        }
        if (isBitOn(number, enumLength)) {
            Collections.reverse(shake);
        }
        return shake;
    }

    private boolean isBitOn(int number, int bit) {
        number >>= bit;
        return (number & 1) == 1;
    }

}
