public class SillyMethods {
    public boolean didGuess42(int guess) {
        return guess == 42;
    }

    public String countTo(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            sb.append(i);
            if (i < n) sb.append(" ");
        }
        return sb.toString();
    }
}
