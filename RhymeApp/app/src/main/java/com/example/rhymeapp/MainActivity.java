package com.example.rhymeapp;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13;
    private Intent intent;

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawerId);
        toggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.nav_open,R.string.nav_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        button1 = findViewById(R.id.Button1Id);
        button2 = findViewById(R.id.Button2Id);
        button3 = findViewById(R.id.Button3Id);
        button4 = findViewById(R.id.Button4Id);
        button5 = findViewById(R.id.Button5Id);
        button6 = findViewById(R.id.Button6Id);
        button7 = findViewById(R.id.Button7Id);
        button8 = findViewById(R.id.Button8Id);
        button9 = findViewById(R.id.Button9Id);
        button10 = findViewById(R.id.Button10Id);
        button11 = findViewById(R.id.Button11Id);
        button12 =findViewById(R.id.Button12Id);
        button13 = findViewById(R.id.Button13Id);



        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view.getId()==R.id.Button1Id)
        {
            intent = new Intent(MainActivity.this,Main2Activity.class);          //going from one activity to another activity
            intent.putExtra("name","chuti");                                //passing value while moving to another activity
            startActivity(intent);                                                             //stating the activity

        }

        if (view.getId()==R.id.Button2Id)
        {
            intent = new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("name","hatti_matim_tim");
            startActivity(intent);

        }

        if (view.getId()==R.id.Button3Id)
        {
            intent = new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("name","safdar_daktar");
            startActivity(intent);

        }
        if (view.getId()==R.id.Button4Id)
        {
            intent = new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("name","ay_bristy_jhepe");
            startActivity(intent);

        }
        if (view.getId()==R.id.Button5Id)
        {
            intent = new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("name","dol_dol_duluni");
            startActivity(intent);

        }

        if (view.getId()==R.id.Button6Id)
        {
            intent = new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("name","am_pata_jora_jora");
            startActivity(intent);

        }

        if (view.getId()==R.id.Button7Id)
        {
            intent = new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("name","noton_noton");
            startActivity(intent);

        }

        if (view.getId()==R.id.Button8Id)
        {
            intent = new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("name","ata_gache_tota_pakhi");
            startActivity(intent);

        }

        if (view.getId()==R.id.Button9Id)
        {
            intent = new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("name","aikom_baikom");
            startActivity(intent);

        }

        if (view.getId()==R.id.Button10Id)
        {
            intent = new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("name","khoka_jabe_shoshur_bari");
            startActivity(intent);

        }

        if (view.getId()==R.id.Button11Id)
        {
            intent = new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("name","chad_utheche");
            startActivity(intent);

        }



        if (view.getId()==R.id.Button12Id)
        {
            intent = new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("name","tatir_bari_banger_basha");
            startActivity(intent);

        }

        if (view.getId()==R.id.Button13Id)
        {
            intent = new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("name","khoka_geche_mach_dhorte");
            startActivity(intent);

        }


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (toggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);

        alertDialogBuilder.setIcon(R.drawable.alerticon);
        alertDialogBuilder.setTitle(R.string.alert_title);
        alertDialogBuilder.setMessage(R.string.alert_message);
        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });




        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
