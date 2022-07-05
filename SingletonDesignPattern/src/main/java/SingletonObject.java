public class SingletonObject {
    private static SingletonObject instance = new SingletonObject();

    private SingletonObject(){}

    public static SingletonObject getInstance(){
        return  instance;
    }

    public void showSomething(){
        System.out.println("ZZZZZZZZ");
    }
}
