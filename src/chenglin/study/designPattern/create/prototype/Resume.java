package chenglin.study.designPattern.create.prototype;

/**
 * Created by Mcl on 2017/8/11.
 */
public class Resume implements Cloneable {

    private String name;
    private String birthday;
    private String sex;
    private String school;
    private String timeArea;
    private String company;
    public Resume(String name){
        this.name = name;
    }

    // 设定个人信息
    public void setPersonInfo(String birthday,String sex,String school){
        this.birthday = birthday;
        this.sex = sex;
        this.school = school;
    }

    // 设定工作经历
    public void setWorkExperience(String timeArea,String company){
        this.timeArea = timeArea;
        this.company = company;
    }

    //克隆该实例
    public Resume clone(){
        Resume obj = null;
        try {
           obj = (Resume) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }

    public void display(){
        System.out.println("姓名：" + name);
        System.out.println("生日:" + birthday + ",性别:" + sex + ",毕业学校：" + school);
        System.out.println("工作年限:" + timeArea + ",公司:" + company);
    }

    public static void main(String[] args) {
        Resume a = new Resume("小李子");
        a.setPersonInfo("2.16", "男", "XX大学");
        a.setWorkExperience("2012.09.05", "XX科技有限公司");
        Resume b = (Resume) a.clone();
        System.out.println("----------------A--------------");
        a.display();
        System.out.println("----------------B--------------");
        b.display();
        System.out.print("A==B?");
        System.out.println( a == b);
        System.out.print("A.getClass()==B.getClass()?");
        System.out.println(a.getClass() == b.getClass());
    }
}
