package chenglin.study.designPattern.create.singleton;

/**
 * Created by Mcl on 2017/8/11.
 */
public class Singleton02 {

    private Singleton02() {
    }

    private static class SingletonInstance {
        static Singleton02 singleton = new Singleton02();
    }
    // 第一调用静态内部类，才会加载singleton实例的生成，并且JVM会帮我们保证唯一。
    public static Singleton02 getInstance() {
        return SingletonInstance.singleton;
    }
}
