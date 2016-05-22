package ro.madeintm.madeintm.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import ro.madeintm.madeintm.R;
import ro.madeintm.madeintm.model.Story;

/**
 * Created by validraganescu on 21/05/16.
 */
public class StoryListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private List<Story> stories;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_list);

        stories = new ArrayList<>(NavigationActivity.stories);

        ListView listView = (ListView) findViewById(R.id.listView);
        StoryListAdapter adapter = new StoryListAdapter(getApplicationContext(), stories);

        if (listView != null) {
            listView.setDivider(null);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(this);
        }

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this, StoryActivity.class);
        intent.putExtra("object", stories.get(position));
        startActivity(intent);
    }
}
