public class TestSound {
    public static void main(String[] args) {

        System.out.println("HELLO");
        System.out.println("WORLD");
        for (int i = 1; i < 10 ; i++) {
            System.out.println("Akram " + i);

        }
        Sound.playSound("src/res/clk.wav").join();

}
}