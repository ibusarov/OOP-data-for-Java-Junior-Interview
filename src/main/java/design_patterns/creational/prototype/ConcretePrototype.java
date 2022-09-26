package design_patterns.creational.prototype;

public class ConcretePrototype extends Prototype {

    public ConcretePrototype(String id) {
        super(id);
    }

    @Override
    public Prototype clone() {
        ConcretePrototype p = new ConcretePrototype(this.getId());
        return p;
    }
}
