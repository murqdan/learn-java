package mypackage.app;

import mypackage.data.Application;
import mypackage.data.Constant;
import mypackage.data.Country;
import mypackage.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);

        System.out.println(
                MathUtil.sum(1,1,1,1,1)
        );

        Country.City city = new Country.City();

        city.setName("Yogyakarta");
        System.out.println(city.getName());

        System.out.println(Application.PROCESSORS);
    }
}
