package impl;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static impl.Ronaldo.highKick;
import static org.junit.Assert.assertEquals;

public class RonaldoTest{


    List<String> argsList = buildStringList();



    private List<String> buildStringList(){
        List<String> argsList = new LinkedList<String>();

        argsList.add("Ronaldo");
        argsList.add("qwert");
        argsList.add("Ronaldo cubano");
        argsList.add("Ronaldozito");
        argsList.add("");

        return argsList;
    }


    @Test
    public void HighKickTest() {

       assertEquals(3, highKick(argsList));

    }
}