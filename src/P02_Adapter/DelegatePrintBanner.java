package P02_Adapter;

/**
 * Created by ilyar on 17-10-19
 */
public class DelegatePrintBanner extends ClassPrint {

    private Banner banner;

    public DelegatePrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
