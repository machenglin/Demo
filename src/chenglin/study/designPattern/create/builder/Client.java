package chenglin.study.designPattern.create.builder;

/**
 * Created by Mcl on 2017/8/11.
 */
public class Client {
    public static void main(String[] args) {
        Person manPerson = PersonDirector.constructPerson(new ManBuilder());
    }
}
