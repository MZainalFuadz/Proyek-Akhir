package com.dinus.perpustakaan;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DBHandler extends SQLiteOpenHelper {

    public final static String nama_database = "db_notes";
    public final static String nama_tabel = "tabel_notes";
    public final static String row_id = "id";
    public final static String row_judul = "judul_notes";
    public final static String row_catatan = "catatan_notes";
    
    private SQLiteDatabase db;
    
    public DBHandler(Context context){
        super(context, nama_database, null, 2);
        db = getWritableDatabase();
    }
    
    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " +nama_tabel+" ("+ row_id +" INTEGER PRIMARY KEY AUTOINCREMENT, "
                + row_judul + " TEXT," + row_catatan + " TEXT )";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+ nama_tabel);        
    }
    
    public Cursor semuaData(){
        Cursor cur = db.rawQuery("SELECT * FROM " + nama_tabel, null);
        return cur;
    }
    
    public Cursor satuData(long id){
        Cursor cur = db.rawQuery("SELECT * FROM "+ nama_tabel +" WHERE " + row_id + "=" +id, null);
        return cur;
    }
    
    public void tambahData(ContentValues values){
        db.insert(nama_tabel, null, values);
    }

    public void editData( ContentValues values, long id){
        db.update(nama_tabel, values, row_id+ "=" + id, null);
    }

    public void hapusData(long id){
        db.delete(nama_tabel, row_id + "=" + id, null);
    }
}
