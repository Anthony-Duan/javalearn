//import org.junit.Test;
//
//import java.text.SimpleDateFormat;
//import java.time.LocalDate;
//import java.util.Comparator;
//import java.util.Date;
//import java.util.function.Consumer;
//import java.util.function.Predicate;
//
///**
// * @ Description:
// * @ Date: Created in 08:39 2019-07-10
// * @ Author: duanjiaxing
// */
//public class LambdaTest {
//
//
//    /**
//     *  -> 箭头操作符 lambda操作符  左侧为参数列表 右侧为lambda体
//     * 格式一 无参数无返回值
//     * ()->() -> System.out.println("I am run too");
//     */
//    @Test
//    public void test1() {
//        Runnable r = new Runnable() {
//            public void run() {
//                System.out.println("I am run");
//            }
//        };
//        r.run();
//
//        System.out.println("--------------");
//        Runnable r1 = () -> System.out.println("I am run too");
//        r1.run();
//    }
//
//
//    /**
//     *格式二 有一个参数，无返回值
//     *   (x) -> System.out.println(x);
//     */
//    @Test
//    public void test2() {
//
//        Consumer<String> con = (x) -> System.out.println(x);
////        Consumer<String> con = System.out::println;
//        con.accept("dataqin is good");
//    }
//
//    /**
//     * 格式三  如果只有一个参数 小括号可以不写
//     * x -> System.out.println(x);
//     */
//    @Test
//    public void test3() {
//
//        Consumer<String> con = x -> System.out.println(x);
////        Consumer<String> con = System.out::println;
//        con.accept("dataqin is good");
//    }
//
//    /**
//     * 格式四 两个以上参数 有返回值，多条语句
//     * (x, y) -> {
//     *             System.out.println("函数式接口");
//     *             return Integer.compare(x, y);
//     *         };
//     */
//    @Test
//    public void test4() {
//
//        Comparator<Integer> comparator = (x, y) -> {
//            System.out.println("函数式接口");
//            return Integer.compare(x, y);
//        };
//        int compare = comparator.compare(2, 4);
//        System.out.println(compare);
//    }
//
//
//    /**
//     * lambda体中只有一条语句 则 return 和大括号都可以不写
//     * (x, y) -> Integer.compare(x, y);
//     */
//    @Test
//    public void test5() {
//        Comparator<Integer> comparator = (x, y) -> Integer.compare(x, y);
//
//        int compare = comparator.compare(2, 4);
//        System.out.println(compare);
//    }
//
//    /**
//     * 参数列表可以不写数据类型  java类型自动推断机制 如果写 必须所有参数都写上去
//     * (x, y) -> Integer.compare(x, y);
//     */
//    @Test
//    public void test6() {
//        Comparator<Integer> comparator = (x, y) -> Integer.compare(x, y);
//
//        int compare = comparator.compare(2, 4);
//        System.out.println(compare);
//    }
//
//    @Test
//    public void test7() {
//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);
//
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
//        String format = simpleDateFormat.format(new Date());
//        System.out.println(format);
//
//    }
//
//    @Test
//    public void test8() {
//        String s = strHandler("   去除首尾空格   ", str -> str.trim());
//        System.out.println(s);
//    }
//
//
//    public String strHandler(String str, MyFunction mf){
//        return mf.getValue(str);
//    }
//
//
//    @Test
//    public void test9() {
//        Predicate<String> predicate = s -> s.length() > 0;
//        System.out.println(predicate.test("asda"));
//
//
//        Consumer<String> stringConsumer = System.out::println;
//        stringConsumer.accept("sss");
//
//
//    }
//
//
//
//}
