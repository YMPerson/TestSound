public class TestSound {
    public static void main(String[] args) {


        for (int i = 1; i < 10 ; i++) {
            System.out.println("HELLO");
            System.out.println("WORLD");

        }
        Sound.playSound("src/res/clk.wav").join();

}
}