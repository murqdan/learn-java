package mypackage.app;

import mypackage.data.Category;

public class CatagoryApp {
    public static void main(String[] args) {
        Category category = new Category();

        category.setId("Food");
        System.out.println(category.getId());

        category.setExpensive(false);
        System.out.println(category.isExpensive());
    }
}
