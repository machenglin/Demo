package chenglin.study.designPattern.create.factory.abstractFactory;

//抽象产品
interface Product{}

//具体产品
class ProductA implements Product{}
class ProductB implements Product{}

//多了一个抽象产品1
interface Product1{}

//具体产品1
class Product1A implements Product1{}
class Product1B implements Product1{}

//原有的工厂方法模式的工厂里添加一个方法
interface Factory{
    Product getProduct();
    //添加另外一个产品族的创造方法
    Product1 getProduct1();
}
//具体的工厂A，创造产品A
class FactoryA implements Factory{

    public Product getProduct() {
        return new ProductA();
    }
    //添加相应的实现
    public Product1 getProduct1() {
        return new Product1A();
    }
    
}
//具体的工厂B，创造产品B
class FactoryB implements Factory{

    public Product getProduct() {
        return new ProductB();
    }
    //添加相应的实现
    public Product1 getProduct1() {
        return new Product1B();
    }
    
}