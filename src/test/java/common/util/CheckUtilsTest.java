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
}
