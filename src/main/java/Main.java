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

        Team isu = new Team(); isu.make("IowaState", 5); list.add(isu);
        Team nev = new Team(); nev.make("Nevada", 12); list.add(nev);

        Team pur = new Team(); pur.make("Purdue", 4); list.add(pur);
        Team uvm = new Team(); uvm.make("Vermont", 13); list.add(uvm);

        Team crei = new Team(); crei.make("Creighton", 6); list.add(crei);
        Team uri = new Team(); uri.make("RhodeIsland", 11); list.add(uri);

        Team ore = new Team(); ore.make("Oregon", 3); list.add(ore);
        Team iona = new Team(); iona.make("Iona", 14); list.add(iona);

        Team mich = new Team(); mich.make("Michigan", 7); list.add(mich);
        Team okst = new Team(); okst.make("Oklahoma State", 10); list.add(okst);

        Team lou = new Team(); lou.make("Louisville", 2); list.add(lou);
        Team jvst = new Team(); jvst.make("Jacksonville State", 15); list.add(jvst);

        /* *** WEST *** */
        Team gonz = new Team(); gonz.make("Gonzaga", 1); list.add(gonz);
        Team sdst = new Team(); sdst.make("SDakotaSt", 16); list.add(sdst);

        Team nw = new Team(); nw.make("Northwestern", 8); list.add(nw);
        Team van = new Team(); van.make("Vanderbilt", 9); list.add(van);

        Team nd = new Team(); nd.make("NotreDame", 5); list.add(nd);
        Team prin = new Team(); prin.make("Princeton", 12); list.add(prin);

        Team wvu = new Team(); wvu.make("WVirginia", 4); list.add(wvu);
        Team buck = new Team(); buck.make("Bucknell", 13); list.add(buck);

        Team md = new Team(); md.make("Maryland", 6); list.add(md);
        Team xav = new Team(); xav.make("Xavier", 11); list.add(xav);

        Team fsu = new Team(); fsu.make("Florida State", 3); list.add(fsu);
        Team fgcu = new Team(); fgcu.make("FGCU", 14); list.add(fgcu);

        Team smc = new Team(); smc.make("Saint Mary's", 7); list.add(smc);
        Team vcu = new Team(); vcu.make("VCU", 10); list.add(vcu);

        Team ariz = new Team(); ariz.make("Arizona", 2); list.add(ariz);
        Team und = new Team(); und.make("NDakota", 15); list.add(und);

        /* *** SOUTH *** */
        Team unc = new Team(); unc.make("UNC", 1); list.add(unc);
        Team txso = new Team(); txso.make("Texas Southern", 16); list.add(txso);

        Team ark = new Team(); ark.make("Arkansas", 8); list.add(ark);
        Team hall = new Team(); hall.make("SetonHall", 9); list.add(hall);

        Team minn = new Team(); minn.make("Minnesota", 5); list.add(minn);
        Team mtsu = new Team(); mtsu.make("Middle Tennessee", 12); list.add(mtsu);

        Team but = new Team(); but.make("Butler", 4); list.add(but);
        Team win = new Team(); win.make("Winthrop", 13); list.add(win);

        Team cin = new Team(); cin.make("Cincinnati", 6); list.add(cin);
        Team ksu = new Team(); ksu.make("KSU", 11); list.add(ksu);

        Team ucla = new Team(); ucla.make("UCLA", 3); list.add(ucla);
        Team kent = new Team(); kent.make("KentSt", 14); list.add(kent);

        Team day = new Team(); day.make("Dayton", 7); list.add(day);
        Team wich = new Team(); wich.make("WichitaSt", 10); list.add(wich);

        Team uk = new Team(); uk.make("Kentucky", 2); list.add(uk);
        Team nku = new Team(); nku.make("NKentucky", 15); list.add(nku);


        printAL(list);
        list = playRound(list); // returns round of 32
        list = playRound(list); // returns sweet 16
        list = playRound(list); // returns 8
        list = playRound(list); // returns final four
        list = playRound(list); // returns championship game
        list = playRound(list); // returns champion
    }
    public static ArrayList<Team> playRound(ArrayList<Team> ar) {
        ArrayList<Team> nextRound = new ArrayList();
        Random rand = new Random();
        for (int i = 0; i < ar.size(); i=i+2) {
            int winner = rand.nextInt(2);
            nextRound.add(list.get(i + winner));
        }
        printAL(nextRound);
        return nextRound;
    }
    public static void printAL(ArrayList<Team> ar) {
        for (Team t : ar) {
            System.out.print(t.name + " (" + t.seed + ")" + "\t");
        }
        System.out.println("\t" + ar.size());
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