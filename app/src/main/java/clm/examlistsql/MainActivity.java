package clm.examlistsql;

import android.database.Cursor;
import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    SimpleCursorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        refreshList();




    }

    // TODO REFRESH - in listview Activity



    public void refreshList() {

        MyDBCommands commands=new MyDBCommands(this);

        Cursor c=commands.getDataFromDBAsCursor();
        String[] from = {MyConstants.EXAM_NAME,MyConstants.STUDENT_NAME,MyConstants.STUDENT_GRADE };
        int[] to = {R.id.examTV,R.id.nameTV,R.id.gradeTV};

        adapter=new SimpleCursorAdapter(this,R.layout.single_item,c,from,to);

        ListView lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(adapter);

    }


    @Override
    protected void onResume() {
        refreshList();
        super.onResume();
    }
}
