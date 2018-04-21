package impl;

import org.omg.CORBA.Object;

import java.util.List;

class Ronaldo{

    public static final String RONALDO = "Ronaldo";

    public void highKick(List<String> list, Object... objects){

        for (String s : list) {
            if (s.startsWith(RONALDO)){
                kick(s, objects);
            }

        }
    }

    private void kick(String s, Object[] objects) {
        //nothing to do
    }

}
