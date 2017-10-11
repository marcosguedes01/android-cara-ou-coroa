package com.programacaobrasil.caraoucoroa;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends Activity {

    private ImageView imgMoeda;
    private ImageView btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        initializeControls();
        initializeEventsControls();
        initializeValuesControls();
    }

    private void initializeControls()
    {
        imgMoeda = (ImageView)findViewById(R.id.imgMoeda);
        btnVoltar = (ImageView)findViewById(R.id.btnVoltar);
    }

    private void initializeEventsControls()
    {
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void initializeValuesControls(){
        Bundle extra = getIntent().getExtras();
        if (extra != null)
        {
            String option = extra.getString("option");
            if (option.equals("cara"))
            {
                imgMoeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
            }
            else
            {
                imgMoeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));
            }
        }
    }
}
