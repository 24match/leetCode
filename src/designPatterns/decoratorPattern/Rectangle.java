package designPatterns.decoratorPattern;

/**
 * 创建实现接口的实体类。
 *
 * @Author
 * @Date 2020/6/1 12:30
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
