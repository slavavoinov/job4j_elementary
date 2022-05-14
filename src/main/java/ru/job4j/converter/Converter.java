package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float money1ToMoney2(float value1, float value2) {
        float rsl = value1 / value2;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollars = Converter.rubleToDollar(180);
        float allmoney = Converter.money1ToMoney2(70, 60);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollars + " dollars.");
        System.out.println("Currency1 are " + allmoney + " of currency2.");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        float in2 = 180;
        float expected2 = 3;
        float out2 = Converter.rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("180 rubles are 3 dollars. Test result : " + passed2);
        float in3 = 70;
        float in4 = 60;
        float expected3 = (float) 1.1666666;
        float out3 = Converter.money1ToMoney2(in3, in4);
        boolean passed3 = expected3 == out3;
        System.out.println("Currency1 are 1.1666666 of currency2. Test result : " + passed3);

    }
}
