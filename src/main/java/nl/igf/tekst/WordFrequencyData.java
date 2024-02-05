package nl.igf.tekst;

import java.util.*;

public class WordFrequencyData implements WordFrequencyAnalyzer {
    private ArrayList<SingleWordFrequency> lijst = new ArrayList<>();

    @Override
    public int calculateHighestFrequency(String tekst) {
        ArrayList<String> woorden = createListFromText(tekst);
        int frequency = 0;

        // get a list of unique words
        Set<String> uniqueWords = new HashSet<>(woorden);

        for (String w : uniqueWords) {
            int f = Collections.frequency(woorden, w);
            if (f > frequency) frequency = f;
        }

        return frequency;
    }

    @Override
    public int calculateFrequencyForWord(String tekst, String woord) {
        ArrayList<String> woorden = createListFromText(tekst);
        return Collections.frequency(woorden, woord);
    }

    @Override
    public List<WordFrequency> calculateMostFrequentNWords(String tekst, int aantal) {
        setFrequencyList(tekst);

        lijst.stream().forEach(o -> {
            System.out.println("word: " + o.getWord());
            System.out.println("frenquency: " + o.getFrequency());
        });

        return null;
    }

    private void setFrequencyList(String tekst) {
        ArrayList<String> woorden = createListFromText(tekst);
        Map<String, Integer> freqMap = new TreeMap<>();

        // get a list of unique words
        woorden.forEach(w -> freqMap.put(w, Collections.frequency(woorden, w)));

        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            lijst.add(new SingleWordFrequency(
                    entry.getKey(),
                    entry.getValue()
            ));
        }
    }

    private ArrayList<String> createListFromText(String tekst) {
        String[] woordenArray = tekst.toLowerCase().trim().split("[^a-z]+");
        ArrayList<String> woordenLijst = new ArrayList<>();

        woordenLijst.addAll(Arrays.asList(woordenArray));
        return woordenLijst;
    }
}
