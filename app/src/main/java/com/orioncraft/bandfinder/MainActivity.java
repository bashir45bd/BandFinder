package com.orioncraft.bandfinder;


import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {


    MaterialToolbar toolbar;
    NavigationView nav_View;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    BottomNavigationView bottomNavigationView;
    FrameLayout frameLayout;
    boolean backpress = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      toolbar = findViewById(R.id.toolbar);
      nav_View = findViewById(R.id.nav_View);
      drawerLayout =findViewById(R.id.drawer);
      bottomNavigationView = findViewById(R.id.bottomNavigationView);
      frameLayout = findViewById(R.id.frameLayout);


        FragmentManager myfragment = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = myfragment.beginTransaction();
        fragmentTransaction.add(R.id.frameLayout, new Acadamic());
        fragmentTransaction.commit();


       toggle = new ActionBarDrawerToggle(MainActivity.this, drawerLayout,toolbar, R.string.open, R.string.close);
       drawerLayout.addDrawerListener(toggle);


      nav_View.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


               if (item.getItemId()==R.id.shareapp){

                   shareapp(MainActivity.this);

                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                else if (item.getItemId()==R.id.rateapp){

                    Context context=MainActivity.this;
                    final String apppn = context.getPackageName();
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://play.google.com/store/apps/details?id="+apppn));
                    startActivity(intent);

                    try {

                    } catch (ActivityNotFoundException e){

                        Intent intent1 = new Intent(Intent.ACTION_VIEW);
                        intent1.setData(Uri.parse("https://play.google.com/store/apps/details?id="+apppn));
                        startActivity(intent1);

                    }

                    drawerLayout.closeDrawer(GravityCompat.START);
                }



                else if (item.getItemId()==R.id.policy){

                    Intent intent = new Intent(Intent.ACTION_VIEW);
                   intent.setData(Uri.parse("https://sites.google.com/view/extulprivacy-policy"));
                    startActivity(intent);



                    drawerLayout.closeDrawer(GravityCompat.START);
                }




                else if (item.getItemId()==R.id.more){

                    String devmane = "OrionCraft soft";
                    try {

                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q=pub: "+devmane)));

                    } catch (ActivityNotFoundException e){

                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id= "+devmane)));

                    }

                    drawerLayout.closeDrawer(GravityCompat.START);
                }

                return false;
            }
        });


        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId()==R.id.ac){

                    FragmentTransaction fragmentTransaction = myfragment.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout, new Acadamic());
                    fragmentTransaction.commit();

                }
                else if (item.getItemId()==R.id.gt) {

                    FragmentTransaction fragmentTransaction = myfragment.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout, new Genarel());
                    fragmentTransaction.commit();

                }

                return true;
            }
        });

    }//=================================

    private void shareapp (Context context){

        final String appname = context.getPackageName();
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT,"Download Now: https://play.google.com/store/apps/details?id="+appname);
        intent.setType("text/plain");
        context.startActivity(intent);

    }

    @Override
    public void onBackPressed() {


        if(backpress){
            super.onBackPressed();
        }

        else if (this.backpress=true) {

            Toast.makeText(MainActivity.this, "Press Twice to Exit.", Toast.LENGTH_LONG).show();

            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                @Override
                public void run() {

                    backpress=false;

                }
            },2000);

        }


    }



}
