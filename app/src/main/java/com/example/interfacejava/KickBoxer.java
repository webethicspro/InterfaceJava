package com.example.interfacejava;

public class KickBoxer implements Fighting {

    @Override
    public String throwJab() {
        return "Throw Harder Jab";
    }

    @Override
    public String throwCross() {
        return "Throw Harder Cross";
    }

    @Override
    public String throwHook() {
        return "Throw Harder Hook";
    }

    @Override
    public String throwUpperCut() {
        return "Throw Harder Uppercut";
    }
}
