package com.lyc.javabase;

public class Test {
    static double pg = 8;
    static double cm = 13;
    static double mg = 20;

    public static void main(String[] args) {

        // 假设每种水果都买10斤

        double a = a(10, 10);

        double b = b(10, 10, 10);

        double c = c(10, 10, 10);

        double d = d(10, 10, 10);

        System.out.println("顾客A：" + a);
        System.out.println("顾客B：" + b);
        System.out.println("顾客C：" + c);
        System.out.println("顾客D：" + d);


    }

    /**
     * 1、有一家超市，出售苹果和草莓。其中苹果 8 元/斤，草莓 13 元/斤。
     * 现在顾客 A 在超市购买了若干斤苹果和草莓，需要计算一共多少钱？
     * 请编写函数，对于 A 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
     * @param a
     * @param b
     * @return
     */
    public static double a(int a, int b) {
        return pg * a + cm * a;
    }

    /**
     * 2、超市增加了一种水果芒果，其定价为 20 元/斤。
     * 现在顾客 B 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
     * 请编写函数，对于 B 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static double b(int a, int b, int c) { //
        return pg * a + cm * a + mg * c;
    }

    /**
     * 3、超市做促销活动，草莓限时打 8 折。
     * 现在顾客 C 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
     * 请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static double c(int a, int b, int c) { //
        return pg * a + cm * a * 0.8 + mg * c;
    }

    /**
     * 4、促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块。
     * 现在顾客 D 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
     * 请编写函数，对于 D 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static double d(int a, int b, int c) {
        double temp = pg * a + cm * a * 0.8 + mg * c;
        if(temp > 100) {
            temp = temp - 10;
        }
        return temp;
    }
}
