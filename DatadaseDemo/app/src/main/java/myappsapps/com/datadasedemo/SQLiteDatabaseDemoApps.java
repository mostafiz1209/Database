package myappsapps.com.datadasedemo;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Mostafiz-pc on 6/6/2017.
 */
public class SQLiteDatabaseDemoApps extends SQLiteOpenHelper {

    // Database name
    private static final String DATABASE_NAME="my_db.db";
    // Table name
    private static final String TABLE_NAME="my_table";

    //Columns name
    private static final String c1="Id";
    private static final String c2="firstName";
    private static final String c3="lastName";



    public SQLiteDatabaseDemoApps(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(android.database.sqlite.SQLiteDatabase db) {

        String sql="create table "+TABLE_NAME+"("+c1+" integer primary key ,"+c2+" text ,"+c3+" text "+")";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists "+TABLE_NAME);
        onCreate(db);

    }


    public boolean addData(String id, String fname, String lname)
    {

        SQLiteDatabase sqLiteDatabase=getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(c1,id);
        contentValues.put(c2,fname);
        contentValues.put(c3,lname);

        long chekear=sqLiteDatabase.insert(TABLE_NAME,null,contentValues);
        if(chekear==-1)
            return false;
        else
        return true;

    }




}
