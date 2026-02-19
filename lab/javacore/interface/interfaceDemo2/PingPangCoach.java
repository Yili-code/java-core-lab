public class PingPangCoach extends Coach implements English {
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("PingPangCoach is teaching...");
    }

    @Override
    public void speakEnglish() {
        System.out.println("PingPangCoach is speaking English...");
    }
}       