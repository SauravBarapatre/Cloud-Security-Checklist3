import static org.junit.Assert.*;

import org.junit.Test;

class SecurityChecklistTest {


    @Test

    public void testScore() {


        SecurityChecklist checklist

                = new SecurityChecklist();


        int score

                = checklist.getScore();


        assertTrue(score > 0);

    }

}
