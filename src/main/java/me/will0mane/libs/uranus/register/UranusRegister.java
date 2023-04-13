package me.will0mane.libs.uranus.register;

import lombok.Getter;
import me.will0mane.libs.uranus.Uranus;

public class UranusRegister {

    @Getter
    private final Uranus uranus;

    public UranusRegister(Uranus uranus) {
        if(uranus == null) throw new IllegalArgumentException("Uranus instance cannot be null!");
        this.uranus = uranus;
    }
}
