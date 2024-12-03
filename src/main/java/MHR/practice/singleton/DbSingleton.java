package MHR.practice.singleton;

public class DbSingleton {

    //    private static DbSingleton instance = new DbSingleton();

    private static class LazyHolder {
        static final DbSingleton INSTANCE = new DbSingleton();
    }

    private DbSingleton() {

    }

    public static DbSingleton getInstance() {

        //    return instance;
        return LazyHolder.INSTANCE;
    }
}
