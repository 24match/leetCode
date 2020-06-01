package designPatterns.decoratorPattern;

/**
 * 使用 RedShapeDecorator 来装饰 Shape 对象。
 *
 * @Author
 * @Date 2020/6/1 12:34
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
//        Shape redCircle = new RedShapeDecorator(new Circle());
//        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
