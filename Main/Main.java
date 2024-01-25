package Main;
interface Shape {
    void draw();
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

class ShapeFactory {
    private static final ShapeFactory instance = new ShapeFactory();

    private ShapeFactory() {}

    public static ShapeFactory getInstance() {
        return instance;
    }

    public Shape getShape(String shapeType) {
        if (shapeType.equals("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equals("CIRCLE")) {
            return new Square();
        } else {
            return null;
        }
    }
}

class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactoryObj = ShapeFactory.getInstance();
       
        Shape shape1 = shapeFactoryObj.getShape("RECTANGLE");
        shape1.draw();
        Shape shape2 = shapeFactoryObj.getShape("CIRCLE");
        shape2.draw();
    }
}


