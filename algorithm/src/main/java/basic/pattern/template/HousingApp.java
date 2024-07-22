package basic.pattern.template;

import basic.pattern.template.application.GlassHouse;
import basic.pattern.template.application.HouseTemplate;
import basic.pattern.template.application.WoodenHouse;

public class HousingApp {

    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();
        //using template method
        houseType.buildHouse();
        System.out.println("************");

        houseType = new GlassHouse();
        houseType.buildHouse();
    }

}