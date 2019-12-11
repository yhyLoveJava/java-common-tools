创建 maven 项⽬（使⽤⾃⼰熟悉的IDE），并提交到 GitHub 上
创建数据验证⼯具类 com.zeroten.common.util.CheckUtils。（src/main/java⽬录下）
为⼯具类编写如下数据验证⽅法（使⽤静态⽅法）：
public static boolean isAnyEmpty(String... strings)
String... strings 为可变参数，你可以认为它是 String[] strings。如果 strings 中有
任意⼀个字符串为空，则返回 false，否则返回 true。
public static boolean isEmpty(Object[] arr)
判断引⽤类型数组是否为空，为空或 null 则返回 true，否则返回 false。
public static boolean equals(String str1, String str2)
判断 str1 字符串是否相等，相等则返回 true，否则返回 false。当其中⼀个是 null 时返回
false。
public static boolean equals(Integer n1, Integer n2)
判断 n1 和 n2 的值是否相等，相等则返回 true，否则返回 false。当其中⼀个是 null 时返
回 false。
编写测试类 com.zeroten.common.util.CheckUtilsTest（src/main/test⽬录下）对数据验证⼯具
类进⾏测试，设计的测试⽤例尽量把各种输⼊情况都考虑到。
将作业提交 GitHub 并写清楚提交说明。