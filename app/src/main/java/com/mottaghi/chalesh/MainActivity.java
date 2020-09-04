package com.mottaghi.chalesh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtx;
    private Button butt;
    int x =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtx = findViewById(R.id.txtx);
        butt = findViewById(R.id.butt);
    }
    public void pressMe (View view){
        if (x%2==0)
        {
            txtx.setBackgroundColor(getResources().getColor(R.color.ghermez));
            txtx.setTextColor(getResources().getColor(R.color.abi));
            butt.setTranslationY(-(butt.getTop()-txtx.getBottom()));
            x++;

        }else {
            txtx.setBackgroundColor(getResources().getColor(R.color.abi));
            txtx.setTextColor(getResources().getColor(R.color.ghermez));
            x++;
            butt.setTranslationY((butt.getTop()-txtx.getBottom()));

        }
    }
}
