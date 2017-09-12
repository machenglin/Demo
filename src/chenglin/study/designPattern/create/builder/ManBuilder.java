package chenglin.study.designPattern.create.builder;

/**
 * Created by Mcl on 2017/8/11.
 * 具体的男人建造者
 */
public class ManBuilder implements PersonBuilder {
    Person person;

    public ManBuilder() {
        person = new Man();
    }

    @Override
    public void buildHead() {
        System.out.println("建造男人的头");
    }

    @Override
    public void buildBody() {
        System.out.println("建造男人的身体");
    }

    @Override
    public void buildFoot() {
        System.out.println("建造男人的脚");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
