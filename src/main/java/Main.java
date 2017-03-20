import java.util.ArrayList;
import java.util.Random;

/**
 * Created by andrew on 3/20/17.
 */
public class Main {
    public static ArrayList<Team> list = new ArrayList();
    public static void main(String[] args) {
        /* *** EAST *** */
        Team nova = new Team(); nova.make("Villanova", 1); list.add(nova);
        Team msm = new Team(); msm.make("Mount Saint Mary's", 16); list.add(msm);

        Team wis = new Team(); wis.make("Wisconsin", 8); list.add(wis);
        Team vt = new Team(); vt.make("VirginiaTech", 9); list.add(vt);

        Team uva = new Team(); uva.make("Virginia", 5); list.add(uva);
        Team uncw = new Team(); uncw.make("UNCWilm", 12); list.add(uncw);

        Team fla = new Team(); fla.make("Florida", 4); list.add(fla);
        Team etsu = new Team(); etsu.make("ETennSt", 13); list.add(etsu);

        Team smu = new Team(); smu.make("SMU", 6); list.add(smu);
        Team usc = new Team(); usc.make("PROV/USC", 11); list.add(usc);

        Team bay = new Team(); bay.make("Baylor", 3); list.add(bay);
        Team nms = new Team(); nms.make("NMState", 14); list.add(nms);

        Team sc = new Team(); sc.make("SCarolina", 7); list.add(sc);
        Team marq = new Team(); marq.make("Marquette", 10); list.add(marq);

        Team duke = new Team(); duke.make("Duke", 2); list.add(duke);
        Team troy = new Team(); troy.make("Troy", 15); list.add(troy);

        /* *** MIDWEST *** */
        Team ku = new Team(); ku.make("Kansas", 1); list.add(ku);
        Team ucd = new Team(); ucd.make("UCD", 16); list.add(ucd);

        Team mia = new Team(); mia.make("MiamiFL", 8); list.add(mia);
        Team msu = new Team(); msu.make("MichiganSt", 9); list.add(msu);

        // FIX BELOW

        /*Team name = new Team(); nova.make("IowaState", 20);
        Team name = new Team(); nova.make("Nevada", 20);

        Team name = new Team(); nova.make("Purdue", 20);
        Team name = new Team(); nova.make("Vermont", 20);


        Team name = new Team(); nova.make("Creighton", 20);
        Team name = new Team(); nova.make("RhodeIsland", 20);

        Team name = new Team(); nova.make("Oregon", 20);
        Team iona = new Team(); nova.make("Iona", 20);


        Team name = new Team(); nova.make("Michigan", 20);
        Team name = new Team(); nova.make("OklaState", 20);

        Team name = new Team(); nova.make("Louisville", 20);
        Team name = new Team(); nova.make("JaxState", 20);


        Team name = new Team(); nova.make("Gonzaga", 20);
        Team name = new Team(); nova.make("SDakotaSt", 20);

        Team name = new Team(); nova.make("NWestern", 20);
        Team name = new Team(); nova.make("Vanderbilt", 20);


        Team nd = new Team(); nova.make("NotreDame", 20);
        Team name = new Team(); nova.make("Princeton", 20);

        Team wva = new Team(); nova.make("WVirginia", 20);
        Team name = new Team(); nova.make("Bucknell", 20);


        Team name = new Team(); nova.make("Maryland", 20);
        Team name = new Team(); nova.make("Xavier", 20);

        Team name = new Team(); nova.make("FloridaState", 20);
        Team fgcu = new Team(); nova.make("FGCU", 20);


        Team name = new Team(); nova.make("StMarys", 20);
        Team vcu = new Team(); nova.make("VCU", 20);

        Team name = new Team(); nova.make("Arizona", 20);
        Team name = new Team(); nova.make("NDakota", 20);


        Team unc = new Team(); nova.make("UNC", 20);
        Team txso = new Team(); nova.make("TXSO", 20);

        Team name = new Team(); nova.make("Arkansas", 20);
        Team name = new Team(); nova.make("SetonHall", 20);


        Team name = new Team(); nova.make("Minnesota", 20);
        Team name = new Team(); nova.make("MidTenn", 20);

        Team name = new Team(); nova.make("Butler", 20);
        Team name = new Team(); nova.make("Winthrop", 20);


        Team name = new Team(); nova.make("Cincinnati", 20);
        Team ksu = new Team(); nova.make("KSU", 20);

        Team ucla = new Team(); nova.make("UCLA", 20);
        Team name = new Team(); nova.make("KentSt", 20);


        Team name = new Team(); nova.make("Dayton", 20);
        Team name = new Team(); nova.make("WichitaSt", 20);

        Team name = new Team(); nova.make("Kentucky", 20);
        Team name = new Team(); nova.make("NKentucky", 20);



        list = playRound(list); // returns round of 32
        list = playRound(list); // returns sweet 16
        list = playRound(list); // returns 8
        list = playRound(list); // returns final four
        list = playRound(list); // returns championship game
        list = playRound(list); // returns champion*/
        printAL(list);
    }
    public static ArrayList<Team> playRound(ArrayList<Team> ar) {
        ArrayList<Team> nextRound = new ArrayList();
        Random rand = new Random();
        for (int i = 0; i < ar.size(); i=i+2) {
            int winner = rand.nextInt(2);
            nextRound.add(list.get(i + winner));
        }
        System.out.println(nextRound);
        System.out.println(nextRound.size());
        return nextRound;
    }
    public static void printAL(ArrayList<Team> ar) {
        for (Team t : ar) {
            System.out.println(t.name + " (" + t.seed + ")");
        }
    }

    static class Team {
        public void make(String name, int seed) {
            this.name = name;
            this.seed = seed;
        }
        String name;
        int seed;
    }
}