package com.example.henry.listasciudades;



import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends FragmentActivity {


    FragmentListas fragmentLis;
    FragmentGrid fragmentGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentLis =new  FragmentListas();
        fragmentGrid = new FragmentGrid();



        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().add(R.id.contentFragment, fragmentLis).commit();


        }

    public void onClick(View view){


        switch (view.getId()){

            case R.id.list:
                Utilidades.visualizacion=Utilidades.List;

                break;

            case R.id.grid:
                Utilidades.visualizacion=Utilidades.Grid;

                break;

        }
        contruirFragment();

    }

    private void contruirFragment() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        if(Utilidades.visualizacion == Utilidades.List){
            transaction.replace(R.id.contentFragment, fragmentLis);
        }else {
            transaction.replace(R.id.contentFragment, fragmentGrid);
        }

        transaction.commit();
    }

}
