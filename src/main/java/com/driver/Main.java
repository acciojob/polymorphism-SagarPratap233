package com.driver;

public class Main {

    public static class Product{


        public int product (int x, int y){
        }
        public int product (int x, int y, int z) {
        }
        public double product (double x, double y) {
        }
    }

    Product p = new Product();
    p.product(1,2);
    p.product(1,2,3);
    p.product(0.1, 0.2);

}
