package jp.co.diworks.action;

public class Test {
	public static void main(String[]ages) {
Robot aibo=new Robot();
aibo.name="アイボ";

System.out.println(aibo.name);
aibo.talk();
aibo.walk();
aibo.run();


Robot asimo=new Robot();
asimo.name="アシモ";

System.out.println(asimo.name);
asimo.talk();
asimo.walk();
asimo.run();

Robot pepper=new Robot();
pepper.name="ペッパー";

System.out.println(pepper.name);
pepper.talk();
pepper.walk();
pepper.run();

}
}
