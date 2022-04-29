package com.fju.ai;

public class Box1 extends Box {
    public Box1(){
        super(10,10,10);
    }
/*    @Override
    public boolean isFit(int length, int width, int height) {
        if (length <= this.length && width <= this.width && height <= this.height) {
            return true;
        } else {
            return false;
        }
    }*/
    @Override
    public String toString() {
        return "Box1";
    }
}
