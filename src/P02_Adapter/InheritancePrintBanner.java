package P02_Adapter;

/**
 * Created by ilyar on 17-10-19
 * @author ilyar
 */
public class InheritancePrintBanner extends Banner implements InterfacePrint {
    public InheritancePrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
