package P08_AbstractFactory;

import P08_AbstractFactory.factory.Factory;
import P08_AbstractFactory.factory.Link;
import P08_AbstractFactory.factory.Page;
import P08_AbstractFactory.factory.Tray;


/**
 * 编译方法:
 *  在项目根目录
 *    javac P08_AbstractFactory/Main.java P08_AbstractFactory/listfactory/ListFactory.java
 * 执行:
 *    java P08_AbstractFactory.Main P08_AbstractFactory.listfactory.ListFactory
 * */
public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main listfactory.ListFactory");
            System.exit(0);
        }

        Factory factory = Factory.getFactory(args[0]);

        Link github = factory.createLink("github", "https://github.com");
        Link gitlab = factory.createLink("gitlab", "https://gitlab.com");

        Link toutiao = factory.createLink("toutiao", "https://toutiao.com");
        Link juejin = factory.createLink("juejin", "https://juejin.im");

        Tray gitTray = factory.createTray("gits");
        gitTray.add(github);
        gitTray.add(gitlab);

        Tray techTray = factory.createTray("techs");
        techTray.add(toutiao);
        techTray.add(juejin);

        Page page = factory.createPage("LinkPage", "ilyar");
        page.add(gitTray);
        page.add(techTray);
        page.output();

    }
}
