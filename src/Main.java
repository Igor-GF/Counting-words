public class Main {
    public static void main(String[] args) {
        System.out.println("Counting words App");

        String tekst = """
                        Ordina understands the power of disruptive technologies /and cooperation in a digital ecosystems. 
                        And we can #put ourselves in ** our customers’ shoes and in their digital business world. 
                    """;

        String[] wordList = tekst.toLowerCase().split("[^a-z]+");
        for (String w : wordList) {
            System.out.println(w);
        }
    }
}