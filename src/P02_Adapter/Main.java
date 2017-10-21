package P02_Adapter;

/**
 * Created by ilyar on 17-10-19
 */
public class Main {
    public static void main(String[] args) {
        InterfacePrint interfacePrint = new InheritancePrintBanner("Hello, inheritance P02_Adapter. ");
        interfacePrint.printWeak();
        interfacePrint.printStrong();

        DelegatePrintBanner delegatePrintBanner = new DelegatePrintBanner("Hello, delegated P02_Adapter.");
        delegatePrintBanner.printWeak();
        delegatePrintBanner.printStrong();
    }
}
