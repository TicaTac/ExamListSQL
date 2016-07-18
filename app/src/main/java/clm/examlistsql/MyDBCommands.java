package clm.examlistsql;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;

/**
 * Created by CLM on 7/18/2016.
 */
public  class MyDBCommands {
    // TODONE var : DBHelper,  Context

    Context c;
    MySQLiteHelper helper;
    // TODONE CTOR

    public MyDBCommands(Context c) {
        this.c = c;
        helper= new MySQLiteHelper(c);
    }

    // TODONE ADD
    public void addToDB(Exam examData){
        ContentValues cv=new ContentValues();

        cv.put(MyConstants.STUDENT_NAME,examData.studentName);
        cv.put(MyConstants.STUDENT_GRADE,examData.examGrade);
        cv.put(MyConstants.EXAM_NAME,examData.examName);


        helper.getWritableDatabase().insert(MyConstants.TABLE,null,cv);

    }

    // TODONE GET
    public Cursor getDataFromDBAsCursor (){
        return  helper.getReadableDatabase().rawQuery("SELECT * FROM "+MyConstants.TABLE,null);
    }

    public Cursor getDataFromDBAsCursor (int ID){
        return  helper.getReadableDatabase()
                .rawQuery("SELECT * FROM "+MyConstants.TABLE
                        +" WHERE "+MyConstants.ID+"= "+ID,null);
    }

    // TODONE UPDATE

    public void updateExam(Exam examData) {
        ContentValues cv = new ContentValues();

        cv.put(MyConstants.STUDENT_NAME, examData.studentName);
        cv.put(MyConstants.STUDENT_GRADE, examData.examGrade);
        cv.put(MyConstants.EXAM_NAME, examData.examName);

        helper.getWritableDatabase().update(MyConstants.TABLE, cv, "" + MyConstants.ID + "= ?", new String[]{"" + examData.ID});
    }




    // TODO DELETE

    public void deleteExam(int ID)
    {
        helper.getWritableDatabase().delete(MyConstants.TABLE,MyConstants.ID+"=?",new String[]{""+ID});
    }
}
