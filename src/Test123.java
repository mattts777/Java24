import static org.junit.Assert.*;

public class Test123 {
    static int testCount = 0;
    
    public Test123(){
        testCount++;
        assertEquals(1,1);
}
    static int getTestCount() {
        return testCount;
    }
    
}