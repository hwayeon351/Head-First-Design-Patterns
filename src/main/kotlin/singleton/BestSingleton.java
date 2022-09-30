package singleton;

public class BestSingleton {
    private BestSingleton() {}

    private static class SingletonHolder {
        //내부 클래스 SingletonHolder가 로딩될 때, 초기화 수행 -> 싱글톤 인스턴스 생성
        private static final BestSingleton instance = new BestSingleton();
    }

    public static BestSingleton getInstance() {
        return SingletonHolder.instance;
    }
}
