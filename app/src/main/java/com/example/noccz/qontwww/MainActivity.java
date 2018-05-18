package com.example.noccz.qontwww;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showScene(View view){
        int sceneId = 0;
        int id = view.getId();
        switch(id){
            case R.id.scene_1:
                sceneId = 1;
                break;
            case R.id.artist_scene_1:
                sceneId = 1;
                break;
            case R.id.time_scene_1:
                sceneId = 1;
                break;
            case R.id.name_scene_1:
                sceneId = 1;
                break;
            case R.id.scene_2:
                sceneId = 2;
                break;
            case R.id.artist_scene_2:
                sceneId = 2;
                break;
            case R.id.time_scene_2:
                sceneId = 2;
                break;
            case R.id.name_scene_2:
                sceneId = 2;
                break;
            case R.id.scene_3:
                sceneId = 3;
                break;
            case R.id.artist_scene_3:
                sceneId = 3;
                break;
            case R.id.time_scene_3:
                sceneId = 3;
                break;
            case R.id.name_scene_3:
                sceneId = 3;
                break;
            case R.id.scene_4:
                sceneId = 4;
                break;
            case R.id.artist_scene_4:
                sceneId = 4;
                break;
            case R.id.time_scene_4:
                sceneId = 4;
                break;
            case R.id.name_scene_4:
                sceneId = 4;
                break;
            case R.id.scene_5:
                sceneId = 5;
                break;
            case R.id.artist_scene_5:
                sceneId = 5;
                break;
            case R.id.time_scene_5:
                sceneId = 5;
                break;
            case R.id.name_scene_5:
                sceneId = 5;
                break;
        }
        generateSceneLayout(sceneId, id);
    }

    void generateSceneLayout(Integer sceneID, Integer id){
        View view = findViewById(id);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SceneActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });
        view.performClick();
    }
}
