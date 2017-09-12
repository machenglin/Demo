package chenglin.study.designPattern.create.builder;

/**
 * Created by Mcl on 2017/8/11.
 * 抽象建造者
 */
public interface PersonBuilder {
    void buildHead();
    void buildBody();
    void buildFoot();
    Person buildPerson();
}
