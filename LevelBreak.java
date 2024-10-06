public class LevelBreak {
    public static void main(String[] args) {
        OuterLoop:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(i+"=i "+ j+"=j");
                if (i == 3 && j == 1) {
                    break OuterLoop;
                }
            }
        }
    }
}
