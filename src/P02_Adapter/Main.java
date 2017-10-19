package P02_Adapter;

/**
 * Created by ilyar on 17-10-19
 */
public class Main {
    public static void main(String[] args) {
        InterfacePrint interfacePrint = new InheritancePrintBanner("Hello, inheritance adapter. ");
        interfacePrint.printWeak();
        interfacePrint.printStrong();

        DelegatePrintBanner delegatePrintBanner = new DelegatePrintBanner("Hello, delegated adapter.");
        delegatePrintBanner.printWeak();
        delegatePrintBanner.printStrong();
    }
}
