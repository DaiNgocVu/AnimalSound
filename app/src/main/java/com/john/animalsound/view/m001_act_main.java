package com.john.animalsound.view;

import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

import com.john.animalsound.databinding.M001ActMainBinding;

import java.util.Random;

public class m001_act_main extends BaseAct<M001ActMainBinding> {

    public static final String BEE = "Bee";
    public static final String LION = "Lion";
    public static final String MOUSE = "Mouse";
    public static final String OWL = "Owl";
    public static final String PANDA = "Panda";
    public static final String PIG = "Pig";
    public static final String RABBIT = "Rabbit";
    public static final String SNAKE = "Snake";
    public static final String TIGER = "Tiger";
    public static final String KEY_TYPE = "KEY_TYPE";
    //Vo hieu hoa nguoi dung an button BackPress
    int time = 0;

    @Override
    protected M001ActMainBinding initViewBinding() {
        return M001ActMainBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void initViews() {
        binding.ivBee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetail(BEE);
            }
        });

        binding.ivLion.setOnClickListener(view -> {
            openDetail(LION);
        });
        binding.ivMouse.setOnClickListener(view -> {
            openDetail(MOUSE);
        });
        binding.ivOwl.setOnClickListener(view -> {
            openDetail(OWL);
        });
        binding.ivPanda.setOnClickListener(view -> {
            openDetail(PANDA);
        });
        binding.ivPig.setOnClickListener(view -> {
            openDetail(PIG);
        });
        binding.ivRabbit.setOnClickListener(view -> {
            openDetail(RABBIT);
        });
        binding.ivSnake.setOnClickListener(view -> {
            openDetail(SNAKE);
        });
        binding.ivTiger.setOnClickListener(view -> {
            openDetail(TIGER);
        });

        binding.tvMiniGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMiniGame();
            }
        });
    }

    private void openDetail(String type) {
        Intent intent = new Intent();
        intent.setClass(this, m002_act_detail.class);
        intent.putExtra(KEY_TYPE, type);

        startActivity(intent);
    }

    private void openMiniGame() {
        Intent intent = new Intent();
        intent.setClass(this, m003_act_detect_name.class);
        startActivity(intent);
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    public void onBackPressed() {
        if (time == 0) {
            Toast.makeText(this, "Click again to exit app!", Toast.LENGTH_SHORT).show();
            time++;
            //X??? l?? reset time sau 2s, n???u ng?????i d??ng kh??ng b???m l???n 2 ngay
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    time = 0;
                }
            }, 2000);
        } else {
            finishAffinity();
        }
    }
}