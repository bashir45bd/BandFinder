package com.orioncraft.bandfinder;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Show_Result extends AppCompatActivity {


    ImageView back;
    TextView bar_text,result;

    public static String Fbar_text = "";
    public static String Fresult = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result);

           back=findViewById(R.id.back);
           bar_text = findViewById(R.id.bar_text);
           result = findViewById(R.id.reslut);

           bar_text.setText(Fbar_text);
           result.setText(Fresult);




        back.setOnClickListener(v -> {
            onBackPressed();
        });

    }
}