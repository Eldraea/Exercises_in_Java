package myjava.exercises;


public class Main {

    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");

        //Any Player is added to our team
        adelaideCrows.addPlayer(joe);

        Team <BaseballPlayer> baseballTeam = new Team<>("Chicago Clubs");
        baseballTeam.addPlayer(pat);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");

        hawthorn.matchResult(fremantle, 1,0);
        hawthorn.matchResult(adelaideCrows, 3,8);

        adelaideCrows.matchResult(fremantle,2,1);
        melbourne.matchResult(adelaideCrows, 1, 1);


        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));
        System.out.println(hawthorn.compareTo(hawthorn));




    }
}
