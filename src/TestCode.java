import nl.igf.text.*;
import java.util.List;

public class TestCode {

    public static void testWithDummyData() {
        String text = """
                    The Ordina understands the power of disruptive digital technologies /and the cooperation in a digital ecosystems. And our world, AND the digital technologies! 
                    And we can #put ourselves in ** our the shoes of our customers’ shoes and in their digital and their business and their world. 
                """;

        WordFrequencyAnalyzerImpl analyzer = new WordFrequencyAnalyzerImpl();
        int hf = analyzer.calculateHighestFrequency(text);
        int wf = analyzer.calculateFrequencyForWord(text, "digital");
        int wf2 = analyzer.calculateFrequencyForWord(text, "thiswordisnotintext");
        List<WordFrequency> sortedList = analyzer.calculateMostFrequentNWords(text, 23);

        System.out.println("Method: Highest frequency: " + hf);
        System.out.println("Method: Frequency for a word: " + wf);
        System.out.println("Method: Frequency for thiswordisnotintext: " + wf2);
        System.out.println("Method: The most frequent words: ");
        sortedList.forEach(System.out::println);
    }
}
