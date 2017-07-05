package com.example.david.imkproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;




public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button konversi = (Button)findViewById(R.id.konversi);
        Button exit = (Button)findViewById(R.id.exit);
        Button about = (Button)findViewById(R.id.about);
        Button teori = (Button)findViewById(R.id.teori);

        konversi.setOnClickListener(this);
        exit.setOnClickListener(this);
        about.setOnClickListener(this);
        teori.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.konversi:
                Intent i = new Intent(this, TabLayoutActivity.class);
                startActivity(i);
                break;
            case R.id.teori:
                Intent teori = new Intent(this, Teori.class);
                startActivity(teori);
                break;
            case R.id.about:
                final AlertDialog.Builder info = new AlertDialog.Builder(MainActivity.this);
                info.setMessage("Perkenalkan! \n\n Nama : Agustinus David Susanto \n\n NPM : 50414521 \n\n Kelas : 3IA05").setPositiveButton("Lanjut",new AlertDialog.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id){
                        dialog.cancel();
                    }});
                AlertDialog dialog = info.create();
                dialog.setTitle("Informasi Aplikasi");
                dialog.show();
                break;
            case R.id.exit:
                AlertDialog.Builder keluar = new AlertDialog.Builder(MainActivity.this);
                keluar.setMessage("Anda yakin ingin keluar ?").setCancelable(false).setPositiveButton("Ya",new AlertDialog.OnClickListener(){
                    public void onClick(DialogInterface arg0,int arg1){
                        Intent exit = new Intent(Intent.ACTION_MAIN);
                        exit.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                        startActivity(exit);
                    }
                }).setNegativeButton("Tidak",new AlertDialog.OnClickListener(){
                    public void onClick(DialogInterface dialog, int arg1) {dialog.cancel(); }
                });
                AlertDialog dialog1=keluar.create();
                dialog1.setTitle("Keluar");
                dialog1.show();
                break;
        }
    }
}
