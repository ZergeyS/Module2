package Homework01.Task01;

import Homework01.Task01.Animals.Biteable;
import Homework01.Task01.Animals.Flyable;
import Homework01.Task01.Animals.Swimable;

public class Zoo <F extends Flyable, S extends Swimable, B extends Biteable> {

    private F flyable;
    private S swimable;
    private B biteable;

    public Zoo(F flyable, S swimable, B biteable) {
        this.flyable = flyable;
        this.swimable = swimable;
        this.biteable = biteable;
    }

    public F getFlyable() {
        return flyable;
    }

    public void setFlyable(F flyable) {
        this.flyable = flyable;
    }

    public S getSwimable() {
        return swimable;
    }

    public void setSwimable(S swimable) {
        this.swimable = swimable;
    }

    public B getBiteable() {
        return biteable;
    }

    public void setBiteable(B biteable) {
        this.biteable = biteable;
    }

    void feedFlyable() {
        System.out.println("Накормили летуна");
        flyable.fly();
    }

    void feedSwimable() {
        System.out.println("Накормили плавуна");
        swimable.swim();
    }

    void feedBiteable() {
        System.out.println("Накормили кусаку");
        biteable.bite();
    }
}
