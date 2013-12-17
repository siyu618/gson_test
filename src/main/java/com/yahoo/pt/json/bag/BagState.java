package com.yahoo.pt.json.bag;

public enum BagState {

    FULL("_full"),
    EMPTY("_empty"),
    NOT_FULL("_not_full");
    private String value;
    private BagState(String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static BagState getState(String str) {
        for (BagState bagState : BagState.values()) {
            if (bagState.value.equals(str)) {
                return bagState;
            }
        }
        return null;
    }
}
