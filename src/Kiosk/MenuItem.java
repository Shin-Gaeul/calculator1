package Kiosk;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {

    //속성 1. 이름 2. 가격 3. 설명
    private String name;
    private double price;
    private String explain;
    private List<MenuItem> menuItems = new ArrayList<>();

    //생성자
    public MenuItem(String name, double price, String explain) {
        this.name = name;
        this.price = price;
        this.explain = explain;
    }

    //기능
    /**
     *게터
     */
    @Override
    public String toString() {
        return  name+ "  |"  + price+"  |"  + explain ;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getExplain() {
        return explain;
    }
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
    public void addMenuItem(String name, double price, String explain) {
        menuItems.add(new MenuItem(name,price,explain));
    }

}
