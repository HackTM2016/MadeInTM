package ro.madeintm.madeintm.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import ro.madeintm.madeintm.R;


public class CreateStoryActivity extends LocationAwareActivity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_story);
        ImageButton addPhoto = (ImageButton) findViewById(R.id.imageButtonPhoto);
        addPhoto.setOnClickListener(this);
        ImageButton addText = (ImageButton) findViewById(R.id.imageButtonText);
        addText.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageButtonPhoto: {
                break;
            }
            case R.id.imageButtonText: {
                break;
            }
        }
    }
}
