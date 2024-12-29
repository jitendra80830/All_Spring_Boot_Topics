public class BoxWithTypeSafeting<T> {

    T container;

    public BoxWithTypeSafeting(T container) {
        this.container = container;
    }

    public T getContainer() {
        return this.container;
    }

}
