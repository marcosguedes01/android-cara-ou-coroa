package com.programacaobrasil.caraoucoroa;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends Activity {

    private ImageView btnJogar;
    private String[] option = {"cara", "coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeControls();
        initializeEventsControls();
    }

    private void initializeControls()
    {
        btnJogar = (ImageView)findViewById(R.id.btnJogar);
    }

    private void initializeEventsControls()
    {
        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DetalheActivity.class);
                intent.putExtra("option", generateOption());

                startActivity(intent);
            }
        });
    }

    private String generateOption()
    {
        Random random = new Random();
        int num = random.nextInt(2);

        return option[num];
    }
}
