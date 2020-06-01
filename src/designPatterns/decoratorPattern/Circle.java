package designPatterns.decoratorPattern;

/**
 * @Author
 * @Date 2020/6/1 12:31
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
