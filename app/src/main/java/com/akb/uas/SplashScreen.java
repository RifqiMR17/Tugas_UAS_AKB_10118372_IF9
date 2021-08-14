package com.akb.uas;
/**
 Nama : Rifqi Muhammad Rizqullah
 NIM : 10118372
 TGL : 14-8-2021
 */
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    Animation transisiAtas, transisiBawah;
    ImageView logo;
    TextView nama, nim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        // animasi
        transisiAtas = AnimationUtils.loadAnimation(this,R.anim.transisi_atas);
        transisiBawah = AnimationUtils.loadAnimation(this,R.anim.transisi_bawah);

        //hooks
        logo = findViewById(R.id.logo);
        nama = findViewById(R.id.nama);
        nim  = findViewById(R.id.nim);

        logo.setAnimation(transisiAtas);
        nama.setAnimation(transisiBawah);
        nim.setAnimation(transisiBawah);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 3000L);
    }
}