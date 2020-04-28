package com.example.interfacejava;

public class Boxer implements Fighting {
    @Override
    public String throwJab() {
        return "Throw Faster Jab";
    }

    @Override
    public String throwCross() {
        return "Throw Faster Cross";
    }

    @Override
    public String throwHook() {
        return "Throw Faster Hook";
    }

    @Override
    public String throwUpperCut() {
        return "Throw Faster Upper Cut";
    }
}
