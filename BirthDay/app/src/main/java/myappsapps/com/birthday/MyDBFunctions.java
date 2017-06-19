package myappsapps.com.birthday;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;

/**
 * Created by Mostafiz-pc on 3/12/2017.
 */
public class MyDBFunctions extends SQLiteOpenHelper {
    private static final String DATABASE_NAME="mydb";
    private static final String TABLE_NAME="mytab";

    private static final String TAB_ID="id";
    private static final String TAB_NAME="name";
    private static final String TAB_DAYS="days";



    public MyDBFunctions(Context c)
    {
        super(c,DATABASE_NAME,null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String s="CREATE TABLE"+TABLE_NAME+"("+TAB_ID+" INTEGER PRIMARY KEY,"+TAB_NAME+"text,"+TAB_DAYS+"text)";
        db.execSQL(s);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    // ---adding data to a database---


    void addingDataToTable(DataTemp dt)
    {
        SQLiteDatabase sqd=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(TAB_NAME,dt.getName());
        cv.put(TAB_DAYS,dt.getDays());

        sqd.insert(TABLE_NAME,null,cv);
        sqd.close();

    }

    //------Showing data-----
    String[] my_data()
    {
        SQLiteDatabase sq=this.getReadableDatabase();
        String s="SELECT*FROM"+TABLE_NAME;
        Cursor c=sq.rawQuery(s,null);
        String[] received_data=new String[c.getCount()];

        c.moveToFirst();
        if(c.moveToFirst())
        {
            int counter=0;
            do {
                received_data[counter]=c.getString(c.getColumnIndex(TAB_NAME+""));
                counter=counter+1;
            }while(c.moveToNext());
        }



        return received_data;
    }


}
