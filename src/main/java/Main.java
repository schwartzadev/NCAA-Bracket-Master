import java.util.ArrayList;
import java.util.Random;

/**
 * Created by andrew on 3/20/17.
 */
public class Main {
    public static ArrayList<String> list = new ArrayList();
    public static void main(String[] args) {
        list.add("Villanova");
        list.add("UNO");

        list.add("Wisconsin");
        list.add("VirginiaTech");


        list.add("Virginia");
        list.add("UNCWilm");

        list.add("Florida");
        list.add("ETennSt");


        list.add("SMU");
        list.add("PROV/USC");

        list.add("Baylor");
        list.add("NMState");


        list.add("SCarolina");
        list.add("Marquette");

        list.add("Duke");
        list.add("Troy");


        list.add("Kansas");
        list.add("UCD");

        list.add("MiamiFL");
        list.add("MichiganSt");


        list.add("IowaState");
        list.add("Nevada");

        list.add("Purdue");
        list.add("Vermont");


        list.add("Creighton");
        list.add("RhodeIsland");

        list.add("Oregon");
        list.add("Iona");


        list.add("Michigan");
        list.add("OklaState");

        list.add("Louisville");
        list.add("JaxState");


        list.add("Gonzaga");
        list.add("SDakotaSt");

        list.add("NWestern");
        list.add("Vanderbilt");


        list.add("NotreDame");
        list.add("Princeton");

        list.add("WVirginia");
        list.add("Bucknell");


        list.add("Maryland");
        list.add("Xavier");

        list.add("FloridaState");
        list.add("FGCU");


        list.add("StMarys");
        list.add("VCU");

        list.add("Arizona");
        list.add("NDakota");


        list.add("UNC");
        list.add("TXSO");

        list.add("Arkansas");
        list.add("SetonHall");


        list.add("Minnesota");
        list.add("MidTenn");

        list.add("Butler");
        list.add("Winthrop");


        list.add("Cincinnati");
        list.add("KSU");

        list.add("UCLA");
        list.add("KentSt");


        list.add("Dayton");
        list.add("WichitaSt");

        list.add("Kentucky");
        list.add("NKentucky");


        list = playRound(list); // returns round of 32
        list = playRound(list); // returns sweet 16
        list = playRound(list); // returns 8
        list = playRound(list); // returns final four
        list = playRound(list); // returns championship game
        list = playRound(list); // returns champion
    }
    public static ArrayList<String> playRound(ArrayList<String> ar) {
        ArrayList<String> nextRound = new ArrayList();
        Random rand = new Random();
        for (int i = 0; i < ar.size(); i=i+2) {
            int winner = rand.nextInt(2);
            nextRound.add(list.get(i + winner));
        }
        System.out.println(nextRound);
        System.out.println(nextRound.size());
        return nextRound;
    }
}