import java.util.Map;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        var sb = new StringBuilder();
        var mapToRNA = Map.of('A', 'U', 'C', 'G', 'G', 'C', 'T', 'A');

        for (char c : dnaStrand.toCharArray()) {
            sb.append(mapToRNA.get(c));
        }
        return sb.toString();
    }

}
