package com.dinus.perpustakaan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.checkerframework.checker.units.qual.A;

public class Notes extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView ls;
    DBHandler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        FloatingActionButton btn = (FloatingActionButton) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Notes.this, CatatanActivity.class);
                startActivity(intent);
            }
        });

        handler = new DBHandler(this);
        ls = (ListView) findViewById(R.id.listNotes);
        ls.setOnItemClickListener(this);
        setupListView();
    }

//    public void onBackPressed(){
//        final AlertDialog.Builder builder = new AlertDialog.Builder(Notes.this);
//        builder.setMessage("")
//    }

    private void setupListView() {
//        Cursor cursor = handler.semuaData();
//        CustomCursorAdapter customCursorAdapter = new CustomCursorAdapter (this, cursor, 1);
//        ls.setAdapter(customCursorAdapter);
//        ls.setDividerHeight(0);
    }
//
//    @Override
//    public boolean onOptionsClicked(@NonNull MenuItem item) {
//        return super.onOptionsItemSelected(item);
//    }
//
//    @Override
//    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//
//    }

//    @Override
//    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//        TextView getid = (TextView) view.findViewById(R.id.listID);
//        final long id = Long.parseLong(getid.getText().toString());
//        Cursor cur = handler.satuData(id);
//        cur.moveToFirst();
//
//        String ket = cur.getString(cur.getColumnIndex(DBHandler.row_catatan));
//        final String judulNotes = cur.getString(cur.getColumnIndex(DBHandler.row_judul));
//        final AlertDialog.Builder builder = new AlertDialog.Builder(Notes.this);
//        builder.setTitle("Daftar Catatan");
//        builder.setMessage(ket);
//        builder.setPositiveButton("HAPUS", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                dialogHapusItem(id,Notes);
//            }
//        });
//        builder.setNegativeButton("EDIT", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                Intent
//            }
//        })
//    }
//
    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}