package br.com.etecia.myapp;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class BikesNovasFragment extends Fragment {

    private List<BikeNova> lstBikeNova;
    RecyclerView idRecBikeNovas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bikes_novas, container, false);
        idRecBikeNovas  = view.findViewById(R.id.idRecBikeNovas);

        // carregando os objetos na lista
        lstBikeNova = new ArrayList<>();
        lstBikeNova.add(new BikeNova("bike1",R.drawable.bike1));
        lstBikeNova.add(new BikeNova("bike2",R.drawable.bike2));
        lstBikeNova.add(new BikeNova("bike3",R.drawable.bike3));
        lstBikeNova.add(new BikeNova("bike4",R.drawable.bike4));
        lstBikeNova.add(new BikeNova("bike5",R.drawable.bike5));
        lstBikeNova.add(new BikeNova("bike6",R.drawable.bike6));
        lstBikeNova.add(new BikeNova("bike7",R.drawable.bike7));
        lstBikeNova.add(new BikeNova("bike8",R.drawable.bike8));
        lstBikeNova.add(new BikeNova("bike9",R.drawable.bike9));
        lstBikeNova.add(new BikeNova("bike10",R.drawable.bike10));

        //carregando o adptador
        RecyclerAdapterBikeNova adapterBikeNova = new RecyclerAdapterBikeNova(getContext(),lstBikeNova);
        idRecBikeNovas.setLayoutManager(new GridLayoutManager(getContext(),2));
        idRecBikeNovas.setAdapter(adapterBikeNova);

        return view;
    }
}