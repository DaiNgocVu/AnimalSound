package com.john.animalsound.view;

import android.content.Intent;
import android.media.MediaPlayer;
import android.view.View;

import com.john.animalsound.R;
import com.john.animalsound.databinding.M002ActDetailBinding;

public class m002_act_detail extends BaseAct<M002ActDetailBinding> {
    private MediaPlayer mPlayer;

    @Override
    protected M002ActDetailBinding initViewBinding() {
        return M002ActDetailBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void initViews() {
        Intent intent = getIntent();
        if (intent == null) return;

        String type = getIntent().getExtras().getString(m001_act_main.KEY_TYPE);

        if (type.equals(m001_act_main.BEE)) {
            binding.tvAnimal.setText(m001_act_main.BEE);
            binding.ivAnimal.setImageResource(R.drawable.ic_bee);
        }

        if (type.equals(m001_act_main.LION)) {
            binding.tvAnimal.setText(m001_act_main.LION);
            binding.ivAnimal.setImageResource(R.drawable.ic_lion);
        }

        if (type.equals(m001_act_main.MOUSE)) {
            binding.tvAnimal.setText(m001_act_main.MOUSE);
            binding.ivAnimal.setImageResource(R.drawable.ic_mouse);
        }

        if (type.equals(m001_act_main.OWL)) {
            binding.tvAnimal.setText(m001_act_main.OWL);
            binding.ivAnimal.setImageResource(R.drawable.ic_owl);
        }

        if (type.equals(m001_act_main.PANDA)) {
            binding.tvAnimal.setText(m001_act_main.PANDA);
            binding.ivAnimal.setImageResource(R.drawable.ic_panda);
        }

        if (type.equals(m001_act_main.PIG)) {
            binding.tvAnimal.setText(m001_act_main.PIG);
            binding.ivAnimal.setImageResource(R.drawable.ic_pig);
        }

        if (type.equals(m001_act_main.RABBIT)) {
            binding.tvAnimal.setText(m001_act_main.RABBIT);
            binding.ivAnimal.setImageResource(R.drawable.ic_rabbit);
        }
        if (type.equals(m001_act_main.SNAKE)) {
            binding.tvAnimal.setText(m001_act_main.SNAKE);
            binding.ivAnimal.setImageResource(R.drawable.ic_snake);
        }
        if (type.equals(m001_act_main.TIGER)) {
            binding.tvAnimal.setText(m001_act_main.TIGER);
            binding.ivAnimal.setImageResource(R.drawable.ic_tiger);
        }
        binding.btPlay.setOnClickListener(view -> {
            if (mPlayer != null && mPlayer.isPlaying()) {
                mPlayer.pause();
            }
            playSound();
        });

        binding.ivAnimal.setOnClickListener(view -> {
            if (mPlayer != null && mPlayer.isPlaying()) {
                mPlayer.pause();
            }
            playSound();
        });

        binding.ibNext.setOnClickListener(v -> nextAnimal(binding.tvAnimal.getText().toString()));

        binding.ibBack.setOnClickListener(v -> backAnimal(binding.tvAnimal.getText().toString()));

        binding.btSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDetectName(binding.tvAnimal.getText().toString());
            }
        });
    }

    private void openDetectName(String type) {
        Intent intent = new Intent();
        intent.setClass(this, m002_act_detail.class);
        intent.putExtra( m001_act_main.KEY_TYPE, type);

        startActivity(intent);
    }
    private void nextAnimal(String type) {

        if (type.equals(m001_act_main.BEE)) {
            binding.tvAnimal.setText(m001_act_main.LION);
            binding.ivAnimal.setImageResource(R.drawable.ic_lion);
        }

        if (type.equals(m001_act_main.LION)) {
            binding.tvAnimal.setText(m001_act_main.MOUSE);
            binding.ivAnimal.setImageResource(R.drawable.ic_mouse);
        }

        if (type.equals(m001_act_main.MOUSE)) {
            binding.tvAnimal.setText(m001_act_main.OWL);
            binding.ivAnimal.setImageResource(R.drawable.ic_owl);
        }

        if (type.equals(m001_act_main.OWL)) {
            binding.tvAnimal.setText(m001_act_main.PANDA);
            binding.ivAnimal.setImageResource(R.drawable.ic_panda);
        }

        if (type.equals(m001_act_main.PANDA)) {
            binding.tvAnimal.setText(m001_act_main.PIG);
            binding.ivAnimal.setImageResource(R.drawable.ic_pig);
        }

        if (type.equals(m001_act_main.PIG)) {
            binding.tvAnimal.setText(m001_act_main.RABBIT);
            binding.ivAnimal.setImageResource(R.drawable.ic_rabbit);
        }

        if (type.equals(m001_act_main.RABBIT)) {
            binding.tvAnimal.setText(m001_act_main.SNAKE);
            binding.ivAnimal.setImageResource(R.drawable.ic_snake);
        }
        if (type.equals(m001_act_main.SNAKE)) {
            binding.tvAnimal.setText(m001_act_main.TIGER);
            binding.ivAnimal.setImageResource(R.drawable.ic_tiger);
        }
        if (type.equals(m001_act_main.TIGER)) {
            binding.tvAnimal.setText(m001_act_main.BEE);
            binding.ivAnimal.setImageResource(R.drawable.ic_bee);
        }

        if (mPlayer != null && mPlayer.isPlaying()) {
            mPlayer.pause();
        }
    }

    private void backAnimal(String type) {
        if (type.equals(m001_act_main.BEE)) {
            binding.tvAnimal.setText(m001_act_main.TIGER);
            binding.ivAnimal.setImageResource(R.drawable.ic_tiger);
        }
        if (type.equals(m001_act_main.LION)) {
            binding.tvAnimal.setText(m001_act_main.BEE);
            binding.ivAnimal.setImageResource(R.drawable.ic_bee);
        }

        if (type.equals(m001_act_main.MOUSE)) {
            binding.tvAnimal.setText(m001_act_main.LION);
            binding.ivAnimal.setImageResource(R.drawable.ic_lion);
        }

        if (type.equals(m001_act_main.OWL)) {
            binding.tvAnimal.setText(m001_act_main.MOUSE);
            binding.ivAnimal.setImageResource(R.drawable.ic_mouse);
        }

        if (type.equals(m001_act_main.PANDA)) {
            binding.tvAnimal.setText(m001_act_main.OWL);
            binding.ivAnimal.setImageResource(R.drawable.ic_owl);
        }

        if (type.equals(m001_act_main.PIG)) {
            binding.tvAnimal.setText(m001_act_main.PANDA);
            binding.ivAnimal.setImageResource(R.drawable.ic_panda);
        }

        if (type.equals(m001_act_main.RABBIT)) {
            binding.tvAnimal.setText(m001_act_main.PIG);
            binding.ivAnimal.setImageResource(R.drawable.ic_pig);
        }
        if (type.equals(m001_act_main.SNAKE)) {
            binding.tvAnimal.setText(m001_act_main.RABBIT);
            binding.ivAnimal.setImageResource(R.drawable.ic_rabbit);
        }
        if (type.equals(m001_act_main.TIGER)) {
            binding.tvAnimal.setText(m001_act_main.SNAKE);
            binding.ivAnimal.setImageResource(R.drawable.ic_snake);
        }

        if (mPlayer != null && mPlayer.isPlaying()) {
            mPlayer.pause();
        }
    }

    private void playSound() {

        if (binding.tvAnimal.getText().toString().equals(m001_act_main.BEE)) {
            mPlayer = MediaPlayer.create(this, R.raw.bee);
            mPlayer.start();
        }

        if (binding.tvAnimal.getText().toString().equals(m001_act_main.LION)) {
            mPlayer = MediaPlayer.create(this, R.raw.lion);
            mPlayer.start();
        }
        if (binding.tvAnimal.getText().toString().equals(m001_act_main.MOUSE)) {
            mPlayer = MediaPlayer.create(this, R.raw.mouse);
            mPlayer.start();
        }
        if (binding.tvAnimal.getText().toString().equals(m001_act_main.OWL)) {
            mPlayer = MediaPlayer.create(this, R.raw.owl);
            mPlayer.start();
        }
        if (binding.tvAnimal.getText().toString().equals(m001_act_main.PANDA)) {
            mPlayer = MediaPlayer.create(this, R.raw.panda);
            mPlayer.start();
        }
        if (binding.tvAnimal.getText().toString().equals(m001_act_main.PIG)) {
            mPlayer = MediaPlayer.create(this, R.raw.pig);
            mPlayer.start();
        }
        if (binding.tvAnimal.getText().toString().equals(m001_act_main.RABBIT)) {
            mPlayer = MediaPlayer.create(this, R.raw.rabbit);
            mPlayer.start();
        }
        if (binding.tvAnimal.getText().toString().equals(m001_act_main.SNAKE)) {
            mPlayer = MediaPlayer.create(this, R.raw.snake);
            mPlayer.start();
        }
        if (binding.tvAnimal.getText().toString().equals(m001_act_main.TIGER)) {
            mPlayer = MediaPlayer.create(this, R.raw.tiger);
            mPlayer.start();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (mPlayer != null && mPlayer.isPlaying()) {
            mPlayer.pause();
        }
    }
}
