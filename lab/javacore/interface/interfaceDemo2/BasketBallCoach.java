public class BasketBallCoach extends Coach implements English {
    public BasketBallCoach() {
    }

    public BasketBallCoach(String name, int age) {
        super(name, age);
    }

    @Override 
    public void teach() {
        System.out.println("BasketBallCoach is teaching...");
    }

    @Override
    public void speakEnglish() {
        System.out.println("BasketBallCoach is speaking English...");
    }
}   