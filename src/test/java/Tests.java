import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Tests {
    int[] out = new int[]{};
    int[]in = new int[]{2,3,4,1,2,3,4};
    @Test
    public  void test1(){
        Assertions.assertArrayEquals(out,MyTestingClass.checkArr(in));
    }
    @Test

    public  void test2(){
        Assertions.assertThrows(RuntimeException.class,()->
        {
            MyTestingClass.checkArr(new int[]{1,2,3});
        });
    }

    @Test
    public  void test3(){
        Assertions.assertTrue(MyTestingClass.OneAndFourExist(new int[]{1,1,4,1}));
    }
    @Test
    public  void test4(){
        Assertions.assertFalse(MyTestingClass.OneAndFourExist(new int[]{1,1,4,1,3}));
    }
}
