package com.example.valhalagamingstore.genshinimpact;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.valhalagamingstore.Item;
import com.example.valhalagamingstore.MainActivity;
import com.example.valhalagamingstore.MyOrder;
import com.example.valhalagamingstore.R;

public class buy1980gs extends AppCompatActivity {

    Button btnOrderMore, add1980gs, btnMyOrder;
    EditText q_1980_gs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_1980_gs);

        btnOrderMore = findViewById(R.id.btnOrderMore);
        btnMyOrder = findViewById(R.id.btnMyOrder);
        add1980gs = findViewById(R.id.add1980gs);
        q_1980_gs = findViewById(R.id.qty_1980_gs);

        btnOrderMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buy1980gs.this, ListGenshinImpact.class);
                startActivity(intent);
            }
        });

        btnMyOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buy1980gs.this, MyOrder.class);
                startActivity(intent);
            }
        });

        add1980gs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Item item = new Item();
                item.name = "1980 Genesis Crystal";
                item.price = 420000;
                item.quantity = Integer.parseInt(q_1980_gs.getText().toString());
                Toast.makeText(buy1980gs.this,"You Ordered " +item.name+" With Quantity "
                        + q_1980_gs.getText().toString(),Toast.LENGTH_SHORT).show();
                MainActivity.Items.add(item);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.nav_mainmenu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.navHome:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}