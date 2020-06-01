package designPatterns.nullObjectPattern;

/**
 * 创建一个抽象类。
 *
 * @Author
 * @Date 2020/6/1 12:02
 */
public abstract class AbstractCustomer {

    protected String name;

    public abstract boolean isNull();

    public abstract String getName();
}
