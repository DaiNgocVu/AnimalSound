package com.john.animalsound.view;

import android.view.View;
import com.john.animalsound.R;
import com.john.animalsound.databinding.M003ActDetectNameBinding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class m003_act_detect_name extends BaseAct<M003ActDetectNameBinding> {
    public static String trueAnswer, falseAnswer;
    String[] arrayAnimal = {"Bee", "Lion", "Mouse", "Owl", "Panda", "Pig", "Rabbit", "Snake", "Tiger"};
    private int score = 0;
    private int pharse = 0;

    @Override
    protected M003ActDetectNameBinding initViewBinding() {
        return M003ActDetectNameBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void initViews() {
        binding.btClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        setAnswer();
        binding.tvScore.setText("Score: " + score);
        binding.tvA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkWinnerA();
            }
        });

        binding.tvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkWinnerB();
            }
        });
    }

    private void checkWinnerB() {
        if (trueAnswer.equals(binding.tvB.getText().toString())) {
            score++;
            binding.tvScore.setText("Score: " + score);
            notify("Great!");
            setAnswer();
        } else {
            notify("Wrong answer!");
            pharse++;
            setAnswer();
        }

        checkGameOver();
    }

    private void checkGameOver() {
        if (pharse > 2) {
            notify("Game over!");
            finish();
        }
    }

    private void checkWinnerA() {

        if (trueAnswer.equals(binding.tvA.getText().toString())) {
            score++;
            binding.tvScore.setText("Score: " + score);
            notify("Great!");
            setAnswer();
        } else {
            notify("Wrong answer!");
            pharse++;
            setAnswer();
        }
        checkGameOver();
    }

    private void setAnswer() {
        List list = new ArrayList(Arrays.asList(arrayAnimal));
        Collections.shuffle(list);
        trueAnswer = list.get(0).toString();
        falseAnswer = list.get(1).toString();

        switch (trueAnswer) {
            case m001_act_main.BEE:
                binding.ivAnimal.setImageResource(R.drawable.ic_bee);
                break;
            case m001_act_main.LION:
                binding.ivAnimal.setImageResource(R.drawable.ic_lion);
                break;
            case m001_act_main.MOUSE:
                binding.ivAnimal.setImageResource(R.drawable.ic_mouse);
                break;
            case m001_act_main.OWL:
                binding.ivAnimal.setImageResource(R.drawable.ic_owl);
                break;
            case m001_act_main.PANDA:
                binding.ivAnimal.setImageResource(R.drawable.ic_panda);
                break;
            case m001_act_main.PIG:
                binding.ivAnimal.setImageResource(R.drawable.ic_pig);
                break;
            case m001_act_main.RABBIT:
                binding.ivAnimal.setImageResource(R.drawable.ic_rabbit);
                break;
            case m001_act_main.SNAKE:
                binding.ivAnimal.setImageResource(R.drawable.ic_snake);
                break;
            default:
                binding.ivAnimal.setImageResource(R.drawable.ic_tiger);
        }

        boolean rs = new Random().nextBoolean();
        if (rs) {
            binding.tvA.setText(trueAnswer);
            binding.tvB.setText(falseAnswer);
        } else {
            binding.tvA.setText(falseAnswer);
            binding.tvB.setText(trueAnswer);
        }
    }
}
