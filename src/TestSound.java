public class TestSound {
    public static void main(String[] args) {

        System.out.println("HELLO");
        System.out.println("WORLD");
        System.out.println("HELLO");
        System.out.println("WORLD");
        Sound.playSound("src/res/clk.wav").join();

}
}