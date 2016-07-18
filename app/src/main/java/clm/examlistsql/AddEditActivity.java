package clm.examlistsql;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddEditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_edit);


        Button saveBTN = (Button) findViewById(R.id.saveBTN);



        saveBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /// save exam to db

            }
        });

    }
}
