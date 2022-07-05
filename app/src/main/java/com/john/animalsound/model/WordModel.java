package com.john.animalsound.model;

import java.util.Objects;

public class WordModel {
    private final String word;
    public WordModel(String word){
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    @Override
    public boolean equals(Object o) {
       WordModel wd = (WordModel) o;
       return word.equalsIgnoreCase(wd.word);
    }
}
