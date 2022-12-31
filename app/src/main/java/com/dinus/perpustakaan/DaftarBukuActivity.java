package com.dinus.perpustakaan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;

public class DaftarBukuActivity extends AppCompatActivity {
    private RecyclerView rvBook;
    private ArrayList<ListBook> list = new ArrayList<>();
//    private TextView textName;
//    private FirebaseUser firebaseUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        textName = findViewById(R.id.text_name);
//        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
//
//        if (firebaseUser!=null) {
//            textName.setText(firebaseUser.getDisplayName());
//        }else {
//            textName.setText("Login gagal!");
//        }

        setContentView(R.layout.activity_daftar_buku);
        rvBook = findViewById(R.id.rv_book);
        rvBook.setHasFixedSize(true);

        list.addAll(DataBuku.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvBook.setLayoutManager(new LinearLayoutManager(this));
        ListBookAdapter listBookAdapter = new ListBookAdapter(list);
        rvBook.setAdapter(listBookAdapter);

        listBookAdapter.setOnItemClickCallback(new ListBookAdapter.OnItemClickCallback(){
            @Override
            public void onItemClicked(ListBook listBook){
                Intent moveIntent = new Intent(DaftarBukuActivity.this, DetailBukuActivity.class);
                moveIntent.putExtra(DetailBukuActivity.ITEM_EXTRA, listBook);
                startActivity(moveIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()){
            case R.id.action_logout:
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                break;
            case R.id.catatan:
                startActivity(new Intent(getApplicationContext(), CatatanActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}