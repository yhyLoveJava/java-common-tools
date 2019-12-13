package common.util;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckUtilsTest {
    @Test
    public void   testIsAnyEmpty() {
        Assert.assertEquals(CheckUtils.isAnyEmpty("sjfi"),true);
        Assert.assertEquals(CheckUtils.isAnyEmpty(null),false);
        Assert.assertEquals(CheckUtils.isAnyEmpty("sjfi",null),false);
        Assert.assertEquals(CheckUtils.isAnyEmpty("sjfi","dfs"),true);
        Assert.assertEquals(CheckUtils.isAnyEmpty(null,null),false);
    }
    @Test
    public void testIsEmpty(){
        Object[] obj = new  Object[0];
        Object[] arr = {1,533,4};
        Assert.assertEquals(CheckUtils.isEmpty(null),true);
        Assert.assertEquals(CheckUtils.isEmpty(obj),true);
        Assert.assertEquals(CheckUtils.isEmpty( arr),false);
        Assert.assertEquals(CheckUtils.isEmpty(null),true);
    }

    @Test
    public void equals字符串(){
        String str1 = null;
        String str2 = null;
        Assert.assertEquals(CheckUtils.equals("hello","hello"),true);
        Assert.assertEquals(CheckUtils.equals("hello","world"),false);
        Assert.assertEquals(CheckUtils.equals(null,"world"),false);
        Assert.assertEquals(CheckUtils.equals(str1,str2),false);
    }

    @Test
    public void equalsInteger(){
        Integer int1 = null;
        Integer int2 = null;
        Assert.assertEquals(CheckUtils.equals(1,1),true);
        Assert.assertEquals(CheckUtils.equals(1,2),false);
        Assert.assertEquals(CheckUtils.equals(int1,2),false);
        Assert.assertEquals(CheckUtils.equals(int1,int2),false);
    }


}
