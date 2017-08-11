package chenglin.study.designPattern.create.singleton;

/**
 * Created by Mcl on 2017/8/11.
 * 饿汉示单例模式
 */
public class Singleton01 {
    private static Singleton01 singleton = new Singleton01();

    private Singleton01(){}

    public static Singleton01 getInstance(){
        return singleton;
    }
}
