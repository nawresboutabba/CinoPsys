package tn.esprit.examenandroid2020.utils;

import java.util.ArrayList;
import java.util.List;

import tn.esprit.examenandroid2020.R;
import tn.esprit.examenandroid2020.entities.Player;

public class Utilities {

    public final static List<Player> playerList = new ArrayList<Player>(List.of(
            new Player(1,"Joueur 01", R.drawable.ic_profile),
            new Player(2,"Joueur 02", R.drawable.ic_profile),
            new Player(3,"Joueur 03", R.drawable.ic_profile),
            new Player(4,"Joueur 04", R.drawable.ic_profile),
            new Player(5,"Joueur 05", R.drawable.ic_profile),
            new Player(6,"Joueur 06", R.drawable.ic_profile),
            new Player(7,"Joueur 07", R.drawable.ic_profile),
            new Player(8,"Joueur 08", R.drawable.ic_profile),
            new Player(9,"Joueur 09", R.drawable.ic_profile),
            new Player(10,"Joueur 10", R.drawable.ic_profile),
            new Player(11,"Joueur 11", R.drawable.ic_profile),
            new Player(12,"Joueur 12", R.drawable.ic_profile),
            new Player(13,"Joueur 13", R.drawable.ic_profile),
            new Player(14,"Joueur 14", R.drawable.ic_profile),
            new Player(15,"Joueur 15", R.drawable.ic_profile),
            new Player(16,"Joueur 16", R.drawable.ic_profile),
            new Player(17,"Joueur 17", R.drawable.ic_profile),
            new Player(18,"Joueur 18", R.drawable.ic_profile),
            new Player(19,"Joueur 19", R.drawable.ic_profile),
            new Player(20,"Joueur 20", R.drawable.ic_profile),
            new Player(21,"Joueur 21", R.drawable.ic_profile),
            new Player(22,"Joueur 22", R.drawable.ic_profile),
            new Player(23,"Joueur 23", R.drawable.ic_profile),
            new Player(24,"Joueur 24", R.drawable.ic_profile),
            new Player(25,"Joueur 25", R.drawable.ic_profile),
            new Player(26,"Joueur 26", R.drawable.ic_profile),
            new Player(27,"Joueur 27", R.drawable.ic_profile),
            new Player(28,"Joueur 28", R.drawable.ic_profile),
            new Player(29,"Joueur 29", R.drawable.ic_profile),
            new Player(30,"Joueur 30", R.drawable.ic_profile)
    ));

    public final static List<Player> playerGameList = new ArrayList<Player>(List.of(
            new Player(1,"Joueur 01", R.drawable.ic_profile),
            new Player(2,"Joueur 02", R.drawable.ic_profile),
            new Player(3,"Joueur 03", R.drawable.ic_profile),
            new Player(4,"Joueur 04", R.drawable.ic_profile),
            new Player(5,"Joueur 05", R.drawable.ic_profile),
            new Player(6,"Joueur 06", R.drawable.ic_profile),
            new Player(7,"Joueur 07", R.drawable.ic_profile),
            new Player(8,"Joueur 08", R.drawable.ic_profile),
            new Player(9,"Joueur 09", R.drawable.ic_profile),
            new Player(10,"Joueur 10", R.drawable.ic_profile),
            new Player(11,"Joueur 11", R.drawable.ic_profile),
            new Player(12,"Joueur 12", R.drawable.ic_profile),
            new Player(13,"Joueur 13", R.drawable.ic_profile),
            new Player(14,"Joueur 14", R.drawable.ic_profile),
            new Player(15,"Joueur 15", R.drawable.ic_profile),
            new Player(16,"Joueur 16", R.drawable.ic_profile),
            new Player(17,"Joueur 17", R.drawable.ic_profile),
            new Player(18,"Joueur 18", R.drawable.ic_profile),
            new Player(19,"Joueur 19", R.drawable.ic_profile),
            new Player(20,"Joueur 20", R.drawable.ic_profile),
            new Player(21,"Joueur 21", R.drawable.ic_profile),
            new Player(22,"Joueur 22", R.drawable.ic_profile),
            new Player(23,"Joueur 23", R.drawable.ic_profile),
            new Player(24,"Joueur 24", R.drawable.ic_profile),
            new Player(25,"Joueur 25", R.drawable.ic_profile),
            new Player(26,"Joueur 26", R.drawable.ic_profile),
            new Player(27,"Joueur 27", R.drawable.ic_profile),
            new Player(28,"Joueur 28", R.drawable.ic_profile),
            new Player(29,"Joueur 29", R.drawable.ic_profile),
            new Player(30,"Joueur 30", R.drawable.ic_profile)
    ));

    public static List<Player> getPlayerList() {
        return playerList;
    }

    public static List<Player> getPlayerGameList() {
        return playerGameList;
    }

}
