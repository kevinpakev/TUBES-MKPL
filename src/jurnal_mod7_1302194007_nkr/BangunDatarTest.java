import org.junit.Test;
import static org.junit.Assert.*;

public class BangunDatarTest {

    @Test
    public void testBangunDatar() {
        Lingkaran_1302194007 test = new Lingkaran_1302194007("test", 2);
        double expect = 12.56;
        double actual = test.hitungLuas();
        assertEquals(expect,actual);
    }   
}
