package com.john.animalsound.view;

import com.john.animalsound.databinding.M003ActDetectNameBinding;
import com.john.animalsound.model.WordModel;

import java.util.ArrayList;

public class m003_act_detect_name extends BaseAct<M003ActDetectNameBinding> {
    private ArrayList<WordModel> listWord;
    private final int score = 0;

    @Override
    protected M003ActDetectNameBinding initViewBinding() {
        return M003ActDetectNameBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void initViews() {
        WordModel wm1 = new WordModel("bee");
        WordModel wm2 = new WordModel("lion");
        WordModel wm3 = new WordModel("mouse");
        WordModel wm4 = new WordModel("owl");
        WordModel wm5 = new WordModel("panda");
        WordModel wm6 = new WordModel("pig");
        WordModel wm7 = new WordModel("rabbit");
        WordModel wm8 = new WordModel("snake");
        WordModel wm9 = new WordModel("tiger");
        listWord.add(wm1);
        listWord.add(wm2);
        listWord.add(wm3);
        listWord.add(wm4);
        listWord.add(wm5);
        listWord.add(wm6);
        listWord.add(wm7);
        listWord.add(wm8);
        listWord.add(wm9);
    }
}
