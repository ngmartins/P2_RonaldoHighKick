package impl;

import org.omg.CORBA.Object;

import java.util.List;

class Ronaldo{

    public static final String RONALDO = "Ronaldo";
    private static int nbrOfOccurrences =0;

    public static int highKick(List<String> list, Object... objects){

        for (String s : list) {
            if (s.startsWith(RONALDO)){
                kick(s, objects);
            }
        }
        return nbrOfOccurrences;
    }

    private static void kick(String s, Object[] objects) {
        nbrOfOccurrences++;
    }

}
