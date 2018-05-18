package com.example.noccz.qontwww;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SceneActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scene_activity);
        setTitle("The best scene");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
