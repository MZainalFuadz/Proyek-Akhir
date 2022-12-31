package com.dinus.perpustakaan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;

import java.util.HashSet;

public class CatatanEditorActivity extends AppCompatActivity {

    EditText judulEditText;
    int noteId;
    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catatan_editor);
        sharedPreferences = this.getSharedPreferences("com.dinus.perpustakaan", Context.MODE_PRIVATE);
        judulEditText = findViewById(R.id.judul_editText);

//        ActionBar actionBar = getActionBar();
//
//        Intent intent = getIntent();
//        noteId = intent.getIntExtra("noteId", -1);
//
//        if(noteId != -1){
//            judulEditText.setText(CatatanActivity.notes.get(noteId));
//            actionBar.setTitle("Edit Catatan");
//        }else{
//            CatatanActivity.notes.add("");
//            noteId = CatatanActivity.notes.size() -1;
//            actionBar.setTitle("Tambah Catatan");
//        }

//        judulEditText.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                CatatanActivity.notes.set(noteId, String.valueOf(charSequence));
//                CatatanActivity.adapter.notify();
//                HashSet<String> noteSet = new HashSet<>(CatatanActivity.notes);
//                sharedPreferences.edit().putStringSet("notes", noteSet).apply();
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//            }
//        });
//
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater menuInflater = getMenuInflater();
//        menuInflater.inflate(R.menu.menu_simpan, menu);
//        return super.onCreateOptionsMenu(menu);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        super.onOptionsItemSelected(item);
//
//        if (item.getItemId() == R.id.simpan_catatan){
//            startActivity(new Intent(getApplicationContext(), CatatanActivity.class));
//            finish();
//            return true;
//        }
//        return false;
    }
}