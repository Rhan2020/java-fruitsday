package com.fruitDayDB.vo;

/**
 * Created by xi on 2015/10/6.
 */
public class Cart {
    private int fid;
    private boolean isCart;
    private boolean isStar;

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public boolean isCart() {
        return isCart;
    }

    public void setIsCart(boolean isCart) {
        this.isCart = isCart;
    }

    public boolean isStar() {
        return isStar;
    }

    public void setIsStar(boolean isStar) {
        this.isStar = isStar;
    }

    public Cart(){
        super();
    }

    @Override
    public String toString() {
        return "Cart{" +
                "fid=" + fid +
                ", isCart=" + isCart +
                ", isStar=" + isStar +
                '}';
    }
}
