package com.androidmarket.pdfcreator.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import androidmarket.R;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    CardView cardImageToPDF, cardTextToPDF, cardQrToPDF,
            cardExcelToPDF, cardAddWatermark, cardHistory,
            cardViewFiles, cardSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home);

        setViews();
    }

    private void setViews() {
        cardImageToPDF = findViewById(R.id.cardImageToPdf);
        cardTextToPDF = findViewById(R.id.cardTextToPdf);
        cardQrToPDF = findViewById(R.id.cardQrToPdf);
        cardExcelToPDF = findViewById(R.id.cardExcelToPdf);
        cardAddWatermark = findViewById(R.id.cardAddWatermark);
        cardHistory = findViewById(R.id.cardHistory);
        cardViewFiles = findViewById(R.id.cardViewFiles);
        cardSettings = findViewById(R.id.cardSettings);

        cardImageToPDF.setOnClickListener(this);
        cardTextToPDF.setOnClickListener(this);
        cardQrToPDF.setOnClickListener(this);
        cardExcelToPDF.setOnClickListener(this);
        cardAddWatermark.setOnClickListener(this);
        cardHistory.setOnClickListener(this);
        cardViewFiles.setOnClickListener(this);
        cardSettings.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cardImageToPdf:
                Intent intent1 = new Intent(HomeActivity.this, SecondActivity.class);
                intent1.putExtra("fragment", "imgToPdf");
                startActivity(intent1);
                break;
            case R.id.cardTextToPdf:
                Intent intent2 = new Intent(HomeActivity.this, SecondActivity.class);
                intent2.putExtra("fragment", "textToPdf");
                startActivity(intent2);
                break;
            case R.id.cardQrToPdf:
                Intent intent3 = new Intent(HomeActivity.this, SecondActivity.class);
                intent3.putExtra("fragment", "qrToPdf");
                startActivity(intent3);
                break;
            case R.id.cardExcelToPdf:
                Intent intent4 = new Intent(HomeActivity.this, SecondActivity.class);
                intent4.putExtra("fragment", "excelToPdf");
                startActivity(intent4);
                break;
            case R.id.cardAddWatermark:
                Intent intent5 = new Intent(HomeActivity.this, SecondActivity.class);
                intent5.putExtra("fragment", "watermark");
                startActivity(intent5);
                break;
            case R.id.cardHistory:
                Intent intent6 = new Intent(HomeActivity.this, SecondActivity.class);
                intent6.putExtra("fragment", "history");
                startActivity(intent6);
                break;
            case R.id.cardViewFiles:
                Intent intent7 = new Intent(HomeActivity.this, SecondActivity.class);
                intent7.putExtra("fragment", "view");
                startActivity(intent7);
                break;
            case R.id.cardSettings:
                Intent intent8 = new Intent(HomeActivity.this, SecondActivity.class);
                intent8.putExtra("fragment", "settings");
                startActivity(intent8);
                break;
        }
    }

    @Override
    public void onBackPressed() {
        // Handle onBackPressed if needed
        super.onBackPressed();
    }
}
