import nl.igf.tekst.WordFrequencyData;

public class Main {
    public static void main(String[] args) {
        System.out.println("Counting words App");

        String tekst = """
                    Ordina understands the power of disruptive technologies /and cooperation in a digital ecosystems. 
                    And we can #put ourselves in ** our customers’ shoes and in their digital and business and world. 
                """;

        WordFrequencyData count = new WordFrequencyData();
        int i = count.calculateHighestFrequency(tekst);
        int in = count.calculateFrequencyForWord(tekst, "in");
        count.calculateMostFrequentNWords(tekst, 1);
//        System.out.println(i);
//        System.out.println("in: " + in);
    }
}