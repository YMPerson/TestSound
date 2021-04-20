public class TestSound {
    public static void main(String[] args) {

        System.out.println("HELLO");
        Sound.playSound("src/res/clk.wav").join();

}
}