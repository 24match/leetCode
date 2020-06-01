package designPatterns.nullObjectPattern;

/**
 * @Author
 * @Date 2020/6/1 12:04
 */
public class NullCustomer extends AbstractCustomer{


    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
