package testNet;

import org.testng.annotations.Test;

public class TestString {

    @Test
    public void test字符串(){
        String str = "hello,\uD835\uDD5D\uD835\uDD60\uD835\uDD60\uD835\uDD5C";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.codePointCount(0,str.length()));
    }
    @Test
    public void testStringFormat(){
//          %s 字符串
//          %c 字符类型
//          %b 布尔类型
//          %d 整数类型（⼗进制数）
//          %x 整数类型（⼗六进制数）
//          %o 整数类型（⼋进制数）
//          %f 浮点类型
//          %a 浮点类型（⼗六进制数）
//          %% 百分⽐类型
//          %n 换⾏
        System.out.println(String.format("我今天走了%d公里,到了%d地方",new Integer[]{99,8}));
        System.out.printf("我看到了石破天的%s%n看到了狗杂种的%s","狡猾","善良");
    }

    @Test
    public void test字符串比较(){
        String str1 = "hello,world!";
        String str2 = "Hello,World!";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
    }

    @Test
    public void testStartWith(){
        String str = "hello,world!";
        System.out.println(str.startsWith("he"));
        System.out.println(str.startsWith("ht"));
        System.out.println(str.endsWith("d!"));
    }

    @Test
    public void test包含(){
        String str = "hello,world!";
        System.out.println(str.contains("ll"));
    }

    @Test
    public void testFind(){
        String str = "hello,world!";
        System.out.println(str.indexOf("e"));
        System.out.println(str.indexOf('e'));
        System.out.println(str.indexOf(101));
        System.out.println((char)101);
    }

    @Test
    public void test替换(){
        String str = "hello,world!";
        str = str.replace("l","L");
        System.out.println(str);
    }

    @Test
    public void test去空格(){
        String str = "  hello  world!  ";
        str = str.trim();           //可以去掉手尾空格
        System.out.println(str);
    }

    @Test
    public void test大小写转换(){
        String str = "Hello,World!";
        System.out.println(str.toLowerCase());
        System.out.println(str);
        System.out.println(str.toUpperCase());
    }
}
