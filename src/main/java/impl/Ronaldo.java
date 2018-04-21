package impl;

import org.omg.CORBA.Object;

import java.util.List;

class Ronaldo{

    private static final String RONALDO_STR = "Ronaldo";
    private static int nbrOfOccurrences =0;

    private Ronaldo(){

    }

    public static int highKick(List<String> list, Object... objects){

        for (String s : list) {
            if (s.startsWith(RONALDO_STR)){
                kick(s, objects);
            }
        }
        return nbrOfOccurrences;
    }

    private static void kick(String s, Object[] objects) {
        nbrOfOccurrences++;
    }

}
