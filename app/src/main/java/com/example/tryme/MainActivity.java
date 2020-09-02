 package com.example.tryme;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

 public class MainActivity extends AppCompatActivity {

    private View windowView;
    private Button tryMeButton;
    private int[] colors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors=new int[]{Color.BLACK,Color.BLUE,Color.RED,Color.YELLOW,Color.WHITE,Color.GREEN,Color.GRAY,Color.LTGRAY};

        windowView=(View) findViewById(R.id.windowViewId);


        tryMeButton=(Button) findViewById(R.id.tryMeButton);
        tryMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int colorArrayLength=colors.length;
                Random random =new Random();
                int randomNum=random.nextInt(colorArrayLength);

                windowView.setBackgroundColor(colors[randomNum]);

                Log.d("Test","tap");

            }
        });
    }
}
