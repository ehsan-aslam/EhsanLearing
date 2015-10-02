package putitout.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import putitout.myapplication.adapter.MyListAdpater;

public class MainActivity extends Activity {
    public static final String Hello = "";
    private int mPrivate = 0;
    private ListView mListView;
    MyListAdpater mAdapter;
    public String[] Countries = new String[]{"Australia","India","Pakistan","Oman","Austria"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.listView);

        mListView.setAdapter(mAdapter);

//ssssss
    }


}
