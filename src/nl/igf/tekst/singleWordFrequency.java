package nl.igf.tekst;

public final class singleWordFrequency implements WordFrequency {
    private String word;
    private int frequency;

    public singleWordFrequency(String word, int frequency) {
        this.word = word;
        this.frequency = frequency;
    }

    public String getWord() {
        return word;
    }

    public int getFrequency() {
        return frequency;
    }
}
