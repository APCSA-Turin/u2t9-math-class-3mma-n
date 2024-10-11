public class CoinFlip {

    public CoinFlip() {}

    public String flip() {
        if (Math.random() < 0.5) {
            return "Heads";
        }
        return "Tails";
    }

    public double simulate(int numFlips) {
        double count = 0;
        for (int i = 0; i<100; i++) {
            if (flip() == "Heads") {
                count += 1;
            }
        }
        return (count / numFlips) * 100;
    }
}
