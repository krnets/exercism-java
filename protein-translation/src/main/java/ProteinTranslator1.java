/*
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ProteinTranslator {
    private static final Map<String, String> aminoAcids = new HashMap<>();

    static {
        fillCodonMap(List.of("UUU", "UUC"), "Phenylalanine");
        fillCodonMap(List.of("AUG"), "Methionine");
        fillCodonMap(List.of("UUU", "UUC"), "Phenylalanine");
        fillCodonMap(List.of("UUA", "UUG"), "Leucine");
        fillCodonMap(List.of("UCU", "UCC", "UCA", "UCG"), "Serine");
        fillCodonMap(List.of("UAU", "UAC"), "Tyrosine");
        fillCodonMap(List.of("UGU", "UGC"), "Cysteine");
        fillCodonMap(List.of("UGG"), "Tryptophan");
        fillCodonMap(List.of("UAA", "UAG", "UGA"), "STOP");
    }

    private static void fillCodonMap(List<String> codons, String protein) {
        codons.forEach(c -> aminoAcids.put(c, protein));
    }

    List<String> translate(String rnaSequence) {
        var proteins = new ArrayList<String>();

        for (int i = 0; i < rnaSequence.length(); i += 3) {
            String codon = rnaSequence.substring(i, i + 3);

            if (aminoAcids.get(codon).equals("STOP")) {
                break;
            }
            proteins.add(aminoAcids.get(codon));
        }

        return proteins;
    }
}
*/
