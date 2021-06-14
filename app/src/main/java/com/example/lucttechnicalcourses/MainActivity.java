package com.example.lucttechnicalcourses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.app.ActivityOptions;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("LUCT");
     /*   Fade fade = new Fade();
        View decor = getWindow().getDecorView();
        fade.excludeTarget(decor.findViewById(R.id.DataScience),true);
        fade.excludeTarget(android.R.id.statusBarBackground,true);
        fade.excludeTarget(android.R.id.navigationBarBackground,true);

        getWindow().setEnterTransition(fade);
        getWindow().setExitTransition()(fade);*/

        final ImageView imageView1 = findViewById(R.id.imageView1);
        final ImageView imageView2 = findViewById(R.id.imageView2);
        final ImageView imageView3 = findViewById(R.id.imageView3);

        Button WebDevelopment=(Button)findViewById(R.id.WebDevelopment);
        Button MobileAppDevelopment=(Button)findViewById(R.id.MobileAppDevelopment);
        Button DataScience=(Button)findViewById(R.id.DataScience);
        WebDevelopment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity2();
                Intent int1 = new Intent(MainActivity.this, MainActivity2.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this,imageView1, ViewCompat.getTransitionName(imageView1));
                startActivity(int1,options.toBundle());
            }
        });

        DataScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity2();
                Intent int2 = new Intent(MainActivity.this, MainActivity2.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this,imageView2, ViewCompat.getTransitionName(imageView2));
                startActivity(int2,options.toBundle());
            }
        });

        MobileAppDevelopment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity2();
                Intent int3 = new Intent(MainActivity.this, MainActivity2.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this,imageView3, ViewCompat.getTransitionName(imageView3));
                startActivity(int3,options.toBundle());
            }
        });

    }

    private void openMainActivity2() {
    }

    public void DataScience(View view) {
    }

    public void WebDevelopment(View view) {
    }

    public void MobileAppDevelopment(View view) {
    }
}