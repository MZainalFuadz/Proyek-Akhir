package com.dinus.perpustakaan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

public class CatatanActivity extends AppCompatActivity {

    DBHandler handler;
    EditText Judul, Catatan;
    Button btnTambah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catatan);

        handler = new DBHandler(this);

        Judul = (EditText) findViewById(R.id.editJudul);
        Catatan = (EditText) findViewById(R.id.catatan);
        btnTambah = (Button) findViewById(R.id.btn_tambah);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String judul = Judul.getText().toString().trim();
                String catatan = Catatan.getText().toString().trim();
                if (judul.equals("") || catatan.equals("")){
                    Toast.makeText(CatatanActivity.this, "Pastikan anda mengisi semua form", Toast.LENGTH_LONG).show();
                }else {
                    ContentValues values =new ContentValues();
                    values.put(DBHandler.row_judul, judul);
                    values.put(DBHandler.row_catatan, catatan);

                    handler.tambahData(values);
                    Toast.makeText(CatatanActivity.this, "Berhasil Input Data", Toast.LENGTH_LONG).show();
                }
            }
        });




    }
}