package designPatterns.nullObjectPattern;

/**
 * 创建扩展了抽象类的实体类。
 *
 * @Author
 * @Date 2020/6/1 12:02
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return null;
    }
}
