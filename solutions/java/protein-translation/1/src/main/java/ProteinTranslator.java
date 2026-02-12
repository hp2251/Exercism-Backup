import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class ProteinTranslator {
  private HashMap<String, String> codonToProteinMap;

  ProteinTranslator() {
    codonToProteinMap = new HashMap<>();

    codonToProteinMap.put("AUG", "Methionine");
    codonToProteinMap.put("UUU", "Phenylalanine");
    codonToProteinMap.put("UUC", "Phenylalanine");
    codonToProteinMap.put("UUA", "Leucine");
    codonToProteinMap.put("UUG", "Leucine");
    codonToProteinMap.put("UCU", "Serine");
    codonToProteinMap.put("UCC", "Serine");
    codonToProteinMap.put("UCA", "Serine");
    codonToProteinMap.put("UCG", "Serine");
    codonToProteinMap.put("UAU", "Tyrosine");
    codonToProteinMap.put("UAC", "Tyrosine");
    codonToProteinMap.put("UGU", "Cysteine");
    codonToProteinMap.put("UGC", "Cysteine");
    codonToProteinMap.put("UGG", "Tryptophan");
    codonToProteinMap.put("UAA", "STOP");
    codonToProteinMap.put("UAG", "STOP");
    codonToProteinMap.put("UGA", "STOP");
  }

  List<String> translate(String rnaSequence) {
    List<String> result = new ArrayList<String>();

    int rnaSequenceLength = rnaSequence.length();
    int startIndex = 0;
    int endIndex = 3;

    while (endIndex <= rnaSequenceLength) {
      String codon = rnaSequence.substring(startIndex, endIndex);
      String protein = codonToProteinMap.get(codon);

      if (protein.equals("STOP")) break;

      result.add(protein);
      startIndex += 3;
      endIndex += 3;
    }

    return result;
  }
}
