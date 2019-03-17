package com.example.henry.listasciudades;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterCiudades extends RecyclerView.Adapter<AdapterCiudades.ViewHolderCiudades> {

    ArrayList<Ciudades> listaCiudades;

    public AdapterCiudades(ArrayList<Ciudades> listaCiudades) {
        this.listaCiudades = listaCiudades;
    }

    @NonNull
    @Override
    public AdapterCiudades.ViewHolderCiudades onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        int layout = 0;

        if(Utilidades.visualizacion == Utilidades.List){
            layout=R.layout.item_list;
        }else{
            layout=R.layout.item_grid;
        }

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(layout,null,false);

        return new AdapterCiudades.ViewHolderCiudades(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterCiudades.ViewHolderCiudades viewHolderCiudades, int i) {

        viewHolderCiudades.tvName.setText(listaCiudades.get(i).getName());

        viewHolderCiudades.ivImage.setImageResource(listaCiudades.get(i).getImage());
        if(Utilidades.visualizacion == Utilidades.List){

            viewHolderCiudades.tvIformation.setText(listaCiudades.get(i).getInformation());
        }




    }

    @Override
    public int getItemCount() {
        return listaCiudades.size();
    }

    public class ViewHolderCiudades extends RecyclerView.ViewHolder {

        TextView tvName, tvIformation;
        ImageView ivImage;


        public ViewHolderCiudades(@NonNull View itemView) {
            super(itemView);

            tvName = (TextView) itemView.findViewById(R.id.city);
            ivImage = (ImageView) itemView.findViewById(R.id.image);

            if(Utilidades.visualizacion == Utilidades.List){

                tvIformation = (TextView) itemView.findViewById(R.id.information);

            }

        }
    }
}

