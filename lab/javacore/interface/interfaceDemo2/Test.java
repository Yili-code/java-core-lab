public class Test {
    public static void main(String[] args) {
        PingPangSporter pps = new PingPangSporter();
        pps.setName("John");
        pps.setAge(20);
        pps.learn();
        pps.speakEnglish();
        System.out.println(String.format("%s, %d", pps.getName(), pps.getAge()));

        BasketBallPlayer bbp = new BasketBallPlayer();
        bbp.setName("Jane");
        bbp.setAge(21);
        bbp.learn();
        System.out.println(String.format("%s, %d", bbp.getName(), bbp.getAge()));

        PingPangCoach ppc = new PingPangCoach();
        ppc.setName("Jim");
        ppc.setAge(22);
        ppc.teach();
        ppc.speakEnglish();
        System.out.println(String.format("%s, %d", ppc.getName(), ppc.getAge()));

        BasketBallCoach bbc = new BasketBallCoach();
        bbc.setName("Jack");
        bbc.setAge(23);
        bbc.teach();
        System.out.println(String.format("%s, %d", bbc.getName(), bbc.getAge()));
    }
}