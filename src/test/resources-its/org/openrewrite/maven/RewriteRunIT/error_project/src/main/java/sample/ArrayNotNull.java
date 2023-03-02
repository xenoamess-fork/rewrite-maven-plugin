package sample;

import org.jetbrains.annotations.NotNull;

public class ArrayNotNull {

    byte[] bytes = new byte[0];

    public byte @NotNull [] getBytes() {
        return bytes;
    }

    int[] ints = new int[0];

    public int @NotNull [] getInts() {
        return ints;
    }

    Object[] objects = new Object[0];

    public Object @NotNull [] getObjects() {
        return objects;
    }

}
