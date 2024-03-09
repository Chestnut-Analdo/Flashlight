package ru.rotanov.flashlight;

import  androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private FlashClass flashClass;
    private Button btnFlash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFlash = findViewById(R.id.btnFlash);
        flashClass = new FlashClass(this);
    }

    public void onClickFlash(View view){
        if(flashClass.status()){
            flashClass.FlashOff();
            btnFlash.setText("ON");
        }else {
            flashClass.flashOn();
            btnFlash.setText("OFF");
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(flashClass.status()){}
            flashClass.FlashOff();
    }

}