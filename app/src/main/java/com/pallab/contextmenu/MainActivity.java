package com.pallab.contextmenu;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.bottom);
        registerForContextMenu(btn);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.cmenu, menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int itemid;
        itemid = item.getItemId();
        if (itemid == R.id.cm1) {
            Toast.makeText(this, "This is Home Menu ...", Toast.LENGTH_SHORT).show();
        } else if (itemid == R.id.cm2) {
            Toast.makeText(this, "This is Insert Menu ...", Toast.LENGTH_SHORT).show();
        } else if (itemid == R.id.cm3) {
            Toast.makeText(this, "This is Update Menu ...", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "This is Delete Menu ...", Toast.LENGTH_SHORT).show();
        }
        return super.onContextItemSelected(item);
    }
}
