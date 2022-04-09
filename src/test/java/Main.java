public class Main {
    static Philosopher[] thr;
    public static void main(String[] args) {
        Parser parser;
        if (args.length == 0)
            parser = new Parser();
        else
            parser = new Parser(args);
//        System.out.println(phil.toString());
        for (int i=0; i < parser.getNumPhilo(); i++){
            Thread myThread = new Thread(parser.getPhilo()[i]);
            myThread.get(1);
            myThread.setDaemon(true);
            myThread.start();
        }
    }
}
