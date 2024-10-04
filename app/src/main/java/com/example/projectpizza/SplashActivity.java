package com.example.projectpizza;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashActivity extends AppCompatActivity {
    private ImageView iiiim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);
        Thread tr= new Thread(){
            @Override
            public void run(){
                try {
                    sleep(  4000);
                    Intent in=new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(in);
                    SplashActivity.this.finish();
                }catch(InterruptedException it){
                    it.printStackTrace();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }

        };
        tr.start();
        iiiim=findViewById(R.id.iiiim);
        Animation aniRotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim);
        iiiim.startAnimation(aniRotate);
    }
}