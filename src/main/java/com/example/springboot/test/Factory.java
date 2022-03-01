package com.example.springboot.test;

public class Factory {

    public static void main(String[] args) {
        Shape shape = getFactory().getShape("Triangle");
        shape.getArea();
    }

    public static Factory getFactory() {
        return new Factory();
    }


    public Shape getShape(String type) {
        switch (type) {
            case "Triangle":
                return new Triangle();
            case "Rectangle":
                return new Rectangle();
            case "Square":
                return new Square();
            default:
                throw new IllegalArgumentException();
        }
    }

    static interface Shape {

        public int getArea();

    }

    public static class Triangle implements Shape {

        @Override
        public int getArea() {
            return 0;
        }
    }

    public static class Rectangle implements Shape {

        @Override
        public int getArea() {
            return 0;
        }
    }


    public static class Square implements Shape {

        @Override
        public int getArea() {
            return 0;
        }
    }

}

