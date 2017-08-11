package chenglin.study.designPattern.create.factory.method;

//抽象产品
interface Product{}

//具体产品
class ProductA implements Product{}
class ProductB implements Product{}

//将简单工厂中的工厂给抽象成接口
interface Factory{
    Product getProduct();
}
//具体的工厂A，创造产品A
class FactoryA implements Factory{

    public Product getProduct() {
        return new ProductA();
    }
    
}
//具体的工厂B，创造产品B
class FactoryB implements Factory{

    public Product getProduct() {
        return new ProductB();
    }
    
}