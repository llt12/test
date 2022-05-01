package org.yanqun.entity;

public class Cardinfo {
    private int cardid;

    private String cardidnfo;

    public int getCardid() {
        return cardid;
    }

    public void setCardid(int cardid) {
        this.cardid = cardid;
    }

    public String getCardidnfo() {
        return cardidnfo;
    }

    public void setCardidnfo(String cardidnfo) {
        this.cardidnfo = cardidnfo == null ? null : cardidnfo.trim();
    }
}