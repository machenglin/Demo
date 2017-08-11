package chenglin.study.designPattern.create.singleton;

/**
 * Created by Mcl on 2017/8/11.
 * 懒汉式单例模式
 */
public class Singleton {
    // 一个静态的实例
    private static Singleton singleton;
    // 私有化构造器
    private Singleton(){}
    // 暴露一个静态接口获取实例
    public static Singleton getInstance(){
        // 判断对象是否创建过（线程不安全）
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
