package com.company.Enums;

public enum Location {
    WINTERHOLD,
    WINDHELM,
    WHITERUN,
    KINGS_LANDING,
    WINTERFELL;

    @Override
    public String toString(){
        switch(this) {
            case WINTERHOLD:
                return "Winterhold";
            case WINDHELM:
                return "Windhelm";
            case WHITERUN:
                return "Whiterun";
            case KINGS_LANDING:
                return "King's Landing";
            case WINTERFELL:
                return "Winterfell";
            default:
                return "Winterhold";
        }
    }
}
