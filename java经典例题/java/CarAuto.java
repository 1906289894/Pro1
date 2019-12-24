public class Auto {
//属性
public int num;
public String color;
public int weight;
public int speed;
//构造方法
public Auto(int num, String color, int whight, int speed) {
super();
this.num = num;
this.color = color;
this.weight = whight;
this.speed = speed;
}
//普通方法
public void jiaSu() {
System.out.println("汽车加速");
}
public void jianSu() {
System.out.println("汽车减速");
}
public void stop() {
System.out.println("停车");
}
void play(){
System.out.println("父类：这辆车有"+num+"个轮子，颜色是"+color+"，车重"+weight+"吨，最大行驶速度为"+speed);
}
}

子类代码

public class CarAuto  extends Auto {
/* private int num;
private String color;
private int weight;
private int speed;*/
String color;
int num ;
int speed;
int weight;
//子类的属性
private String airCondition;//空调类
private String CD;
//构造器继承
public CarAuto(int num, String color, int weight, int speed,
String airCondition, String cD) {
super(num, color, weight, speed);
this.num=num;
this.airCondition = airCondition;
this.CD = cD;
System.out.println("构造器：这辆小汽车有"+num+"个轮子，颜色是"+color+"，车重"
        +weight+"吨，最大行驶速度为"+speed+"，内置"+
airCondition+"车载空调，还拥有"+cD+"播放设备");
}
//继承普通方法并重写
public void jiaSu() {
System.out.println("嘀嘀嘀，小汽车加速");
}
public void jianSu() {
System.out.println("嘀嘀嘀，小汽车减速");
}

public void stop() {
System.out.println("嘀嘀嘀，小汽车停车");
}
public void play(int num, String color, int weight, int speed){
System.out.println("子类：这辆小汽车有"+num+"个轮子，颜色是"+color+"，车重"
        +weight+"吨，最大行驶速度为"+speed+"，内置"+
airCondition+"车载空调，还拥有"+CD+"播放设备");
}
public static void main(String[] args) {
//构造器
CarAuto c=new CarAuto(4, "黑色", 6, 120, "西门子空调", "CD播放器");
System.out.println("----------");
//子类play方法
c.play(6, "紫色", 6, 120);
c.jianSu();
System.out.println("------------");
//父类play方法
Auto a=new Auto(4, "红色", 4, 90);
a.play();
a.jianSu();
    }
}
