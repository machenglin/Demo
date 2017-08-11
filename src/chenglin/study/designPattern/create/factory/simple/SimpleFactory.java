package chenglin.study.designPattern.create.factory.simple;
//抽象产品
interface Product{}

//具体产品
class ProductA implements Product{}
class ProductB implements Product{}


//产品工厂（下一步就是它的进化，就变成了工厂方法模式）
public class SimpleFactory {

    private SimpleFactory(){}
    
    public static Product getProduct(String productName){
        if (productName.equals("A")) {
            return new ProductA();
        }else if (productName.equals("B")) {
            return new ProductB();
        }else {
            return null;
        }
    }
}
