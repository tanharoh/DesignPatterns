package P07_Builder;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }

        switch (args[0]) {
            case "plain": {
                TextBuilder textBuilder = new TextBuilder();
                Director director = new Director(textBuilder);
                director.construct();
                String result = textBuilder.getResult();
                System.out.println(result);
                break;
            }
            case "html": {
                HTMLBuilder htmlBuilder = new HTMLBuilder();
                Director director = new Director(htmlBuilder);
                director.construct();
                String filename = htmlBuilder.getResult();
                System.out.println(filename + "file write completed");
                break;
            }
            default:
                usage();
                System.exit(0);
        }
    }

    private static void usage() {
        System.out.println("Usage: java Main plain   write TXT document");
        System.out.println("Usage: java Main html    write HTML document");
    }
}
