package com.example.valhalagamingstore.mobilelegend;

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

public class buy256diamond extends AppCompatActivity {

    Button btnOrderMore, add256diamond, btnMyOrder;
    EditText q_256_diamond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_256_diamond);

        btnOrderMore = findViewById(R.id.btnOrderMore);
        btnMyOrder = findViewById(R.id.btnMyOrder);
        add256diamond = findViewById(R.id.add256diamond);
        q_256_diamond = findViewById(R.id.qty_256_diamond);

        btnOrderMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buy256diamond.this, ListMobileLegend.class);
                startActivity(intent);
            }
        });

        btnMyOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buy256diamond.this, MyOrder.class);
                startActivity(intent);
            }
        });

        add256diamond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Item item = new Item();
                item.name = "256 Diamond";
                item.price = 88000;
                item.quantity = Integer.parseInt(q_256_diamond.getText().toString());
                Toast.makeText(buy256diamond.this,"You Ordered " +item.name+" With Quantity "
                        + q_256_diamond.getText().toString(),Toast.LENGTH_SHORT).show();
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