public class BasketBallPlayer extends Sporter implements English {
    public BasketBallPlayer() {
    }

    public BasketBallPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("BasketBallPlayer is learning...");
    }

    @Override
    public void speakEnglish() {
        System.out.println("BasketBallPlayer is speaking English...");
    }
}