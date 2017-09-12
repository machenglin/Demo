package chenglin.study.designPattern.create.builder;

/**
 * Created by Mcl on 2017/8/11.
 * 建造指挥者
 */
public class PersonDirector {

    public static Person constructPerson(PersonBuilder builder){
        builder.buildHead();
        builder.buildBody();
        builder.buildFoot();
        return builder.buildPerson();
    }
}
