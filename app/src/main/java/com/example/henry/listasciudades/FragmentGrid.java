package com.example.henry.listasciudades;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentGrid extends Fragment {


    View vista;
    RecyclerView recyclerViewCity;
    ArrayList<Ciudades> listCity;

    public FragmentGrid() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_fragment_grid, container, false);

        listCity = new ArrayList<>();
        recyclerViewCity = (RecyclerView)vista.findViewById(R.id.RecyclerViewGrid);
        recyclerViewCity.setLayoutManager(new GridLayoutManager(getContext(),2));


        fillCity();

        AdapterCiudades city = new AdapterCiudades(listCity);
        recyclerViewCity.setAdapter(city);


        return vista;
    }

    private void fillCity() {

        listCity.add(new Ciudades("Amsterdan",R.drawable.amsterdan,"Es la capital oficial de los Países Bajos, tiene una población de unos 810 000 habitantes y una superficie de 219 km²"));
        listCity.add(new Ciudades("Berlin",R.drawable.berlin,"Es la capital de Alemania, con una población de 3,5 millones de habitantes y una superfice de 891,68 km²"));
        listCity.add(new Ciudades("Bruselas",R.drawable.bruselas,"Es la capital de Bélgica, tiene una población de unos 170 000 habitantes y una superficie de 32.61 km²"));
        listCity.add(new Ciudades("Londres",R.drawable.londres,"Es la capital y mayor ciudad de Inglaterra y del Reino Unido con 10 470 000 habitantes y 1572 km² de superficie"));
        listCity.add(new Ciudades("Madrid",R.drawable.madrid,"Es la capital de España, tiene una población de 3 223 334 habitantes y una superficie de 604,45 km²"));
        listCity.add(new Ciudades("Paris",R.drawable.paris,"Es la capital de Francia,  tiene una población de 2 273 305 habitantes y una superficie de 105,4 km²"));
        listCity.add(new Ciudades("Roma",R.drawable.roma,"Es la capital de Italia, tien una población de 2 877 215 habitantes y una superficie de 1287,36 km²"));


    }

}
