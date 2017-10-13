package com.lenny.wallpaper;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageSwitcher;

public class MainActivity extends AppCompatActivity {
    Gallery mGallery;
    ImageSwitcher mSwitcher;
    Button BtnGo;
    int[] Resources = new int[]{R.drawable.image0,R.drawable.image1};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }


    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }


}
