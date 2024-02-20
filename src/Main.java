public class Main {
    public static void main(String[] args) {

        Ferrari f1 = new Ferrari(3.2,5,156.2);
        Ferrari f2 = new Ferrari(4.3,4,168.5);
        Ferrari f3 = new Ferrari(4.8,8,230.1);

        Renalt r1 = new Renalt(2.6,6,145.9,2.2);
        Renalt r2 = new Renalt(3.2,6,169.5,1.9);
        Renalt r3 = new Renalt(2.6,8,175.3,2.9);

        Engine[] engines = {f1,f2,f3,r1,r2,r3};

        for(Engine e : engines){
            System.out.println(e.getMaxSpeed());
        }
    }
}
