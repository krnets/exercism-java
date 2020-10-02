import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class ProteinTranslator {
    private static final Map<String, String> AMINO_ACIDS = new HashMap<>();

    static {
        fillCodonMap(List.of("UUU", "UUC"), "Phenylalanine");
        fillCodonMap(List.of("AUG"), "Methionine");
        fillCodonMap(List.of("UUU", "UUC"), "Phenylalanine");
        fillCodonMap(List.of("UUA", "UUG"), "Leucine");
        fillCodonMap(List.of("UCU", "UCC", "UCA", "UCG"), "Serine");
        fillCodonMap(List.of("UAU", "UAC"), "Tyrosine");
        fillCodonMap(List.of("UGU", "UGC"), "Cysteine");
        fillCodonMap(List.of("UGG"), "Tryptophan");
    }

    private static void fillCodonMap(List<String> codons, String protein) {
        codons.forEach(c -> AMINO_ACIDS.put(c, protein));
    }

    List<String> translate(String rnaSequence) {
        Pattern regex = Pattern.compile("(?<=\\G.{3})");

        return regex.splitAsStream(rnaSequence)
                .map(AMINO_ACIDS::get)
                .takeWhile(Objects::nonNull)
                .collect(Collectors.toList());
    }

}
