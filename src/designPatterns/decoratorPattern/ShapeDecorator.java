package designPatterns.decoratorPattern;

/**
 * 创建实现了 Shape 接口的抽象装饰类
 *
 * @Author
 * @Date 2020/6/1 12:31
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
