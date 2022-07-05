public class SingletonPatternDemo {
    public static void main(String[] args) {

        //SingletonObject object = new SingletonObject();

        //SingletonObject object2;

        SingletonObject object = SingletonObject.getInstance();
        object.showSomething();
    }
}
