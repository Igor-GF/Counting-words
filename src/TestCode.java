import nl.igf.text.*;
import java.util.List;

public class TestCode {

    public static void testWithDummyData() {
        String text = """
                    Ordina understands the power of disruptive digital technologies /and cooperation in a digital ecosystems. 
                    And we can #put ourselves in ** our customers’ shoes and in their digital and business and world. 
                """;

        WordFrequencyAnalyzerImpl analyzer = new WordFrequencyAnalyzerImpl();
        int hf = analyzer.calculateHighestFrequency(text);
        int wf = analyzer.calculateFrequencyForWord(text, "digital");
        int wf2 = analyzer.calculateFrequencyForWord(text, "thiswordisnotintext");
        List<WordFrequency> sortedList = analyzer.calculateMostFrequentNWords(text, 10);

        System.out.println("Method: Highest frequency: " + hf);
        System.out.println("Method: Frequency for a word: " + wf);
        System.out.println("Method: Frequency for thiswordisnotintext: " + wf2);
        System.out.println("Method: The most frequent words: ");
        sortedList.forEach(System.out::println);
    }
}
