package com.example.checkanimation;

import android.graphics.drawable.Animatable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

// https://medium.com/@ali.muzaffar/understanding-vectordrawable-pathdata-commands-in-android-d56a6054610e
// http://www.androiddesignpatterns.com/2016/11/introduction-to-icon-animation-techniques.html#drawing-paths
public class MainActivity extends AppCompatActivity {

    private ImageView checkView;
    private ImageView crossView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkView = (ImageView) findViewById(R.id.check);
        crossView = (ImageView) findViewById(R.id.cross);
    }


    public void checkAnimation(View v) {
        crossView.setVisibility(View.INVISIBLE);
        checkView.setVisibility(View.VISIBLE);
        ((Animatable) checkView.getDrawable()).start();
    }

    public void crossAnimation(View v) {
        crossView.setVisibility(View.VISIBLE);
        checkView.setVisibility(View.INVISIBLE);
        ((Animatable) crossView.getDrawable()).start();
    }
}
