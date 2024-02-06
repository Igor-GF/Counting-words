import nl.igf.tekst.WordFrequencyData;

public class Main {
    public static void main(String[] args) {
        System.out.println("Counting words App");

        String tekst = """
                    Ordina understands the power of disruptive technologies /and cooperation in a digital ecosystems. 
                    And we can #put ourselves in ** our customers’ shoes and in their digital and business and world. 
                """;

        WordFrequencyData count = new WordFrequencyData();
        int hf = count.calculateHighestFrequency(tekst);
        int wf = count.calculateFrequencyForWord(tekst, "digital");

        System.out.println("Highest frequency: " + hf);
        System.out.println("Frequency for a word: " + wf);
//        System.out.println("in: " + in);
    }
}