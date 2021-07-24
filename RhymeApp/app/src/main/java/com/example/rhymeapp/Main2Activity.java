package com.example.rhymeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView = findViewById(R.id.imageViewId);
        textView = findViewById(R.id.textViewId);


        Bundle bundle = getIntent().getExtras(); //receiving the value that was passed by putExtras and keeping it in the bundle variable.

        if (bundle!=null)
        {
            String rhymeName = bundle.getString("name");  //when there is some value in the bundle we have to have it through getString method  and keep it in rhymeName variable
            showDetails(rhymeName);  //showing the value inside of tje rhymeName variable through showDetails method
        }

    }

     void showDetails(String rhymeName)
     {                               //the value of rhymeName variable could be any name of rhyme whichever(rhymeButton) the user clicks
        if (rhymeName.equals("chuti")) //condition for matching rhymeNames
         {
             imageView.setImageResource(R.drawable.chuti_image);
             textView.setText(R.string.chutiRhymeText);
         }

         if (rhymeName.equals("hatti_matim_tim"))
         {
             imageView.setImageResource(R.drawable.hatti_matim_tim_image);
             textView.setText(R.string.hattiMatimTimRhymeText);
         }

         if (rhymeName.equals("safdar_daktar"))
         {
             imageView.setImageResource(R.drawable.safdar_daktar_image);
             textView.setText(R.string.safdarDaktarRhymeText);
         }
         if (rhymeName.equals("ay_bristy_jhepe"))
         {
             imageView.setImageResource(R.drawable.ay_bristy_jhepe_image);
             textView.setText(R.string.ayBrisityJhepeRhymeText);
         }

         if (rhymeName.equals("dol_dol_duluni"))
         {
             imageView.setImageResource(R.drawable.dol_dol_duluni_image);
             textView.setText(R.string.dolDolDuluniRhymeText);
         }

         if (rhymeName.equals("am_pata_jora_jora"))
         {
             imageView.setImageResource(R.drawable.am_pata_jora_jora_image);
             textView.setText(R.string.amPataJoraJoraRhymeText);
         }
         if (rhymeName.equals("noton_noton"))
         {
             imageView.setImageResource(R.drawable.noton_noton_image);
             textView.setText(R.string.notonNotonRhymeText);
         }
         if (rhymeName.equals("ata_gache_tota_pakhi"))
         {
             imageView.setImageResource(R.drawable.ata_gache_tota_pakhi_image);
             textView.setText(R.string.ataGacheTotaPakhiRhymeText);
         }


         if (rhymeName.equals("aikom_baikom"))
         {
             imageView.setImageResource(R.drawable.aikom_baikom_image);
             textView.setText(R.string.aikomBaikomRhymeText);
         }
         if (rhymeName.equals("khoka_jabe_shoshur_bari"))
         {
             imageView.setImageResource(R.drawable.khoka_jabe_shoshur_bari_image);
             textView.setText(R.string.khokaJabeShoshurBariRhymeText);
         }
         if (rhymeName.equals("chad_utheche"))
         {
             imageView.setImageResource(R.drawable.chad_utheche_image);
             textView.setText(R.string.chadUthecheRhymeText);
         }
         if (rhymeName.equals("tatir_bari_banger_basha"))
         {
             imageView.setImageResource(R.drawable.tatir_bari_banger_basha_image);
             textView.setText(R.string.tatiBariBangerBashaRhymeText);
         }
         if (rhymeName.equals("khoka_geche_mach_dhorte"))
         {
             imageView.setImageResource(R.drawable.khoka_geche_mach_dhorte_image);
             textView.setText(R.string.khokaGecheMachDhorteRhymeText);
         }
    }
}
