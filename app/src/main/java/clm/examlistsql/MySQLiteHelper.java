package clm.examlistsql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by CLM on 7/18/2016.
 */

public class MySQLiteHelper extends SQLiteOpenHelper {

    public MySQLiteHelper(Context context) {
        super(context, MyConstants.DATABASE, null, MyConstants.VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        // if database doesn't exist - create it
        // open a link to the database
        String command="CREATE TABLE  "+MyConstants.TABLE+" ( _id  INTEGER PRIMARY KEY AUTOINCREMENT," +
                " "+ MyConstants.STUDENT_NAME +" TEXT," +
                " "+ MyConstants.STUDENT_GRADE+" INTEGER,"+
                " "+ MyConstants.EXAM_NAME +" TEXT )";

        db.execSQL(command);





    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
