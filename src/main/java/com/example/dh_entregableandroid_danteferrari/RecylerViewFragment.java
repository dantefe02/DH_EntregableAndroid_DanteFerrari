package com.example.dh_entregableandroid_danteferrari;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecylerViewFragment extends Fragment {

    public RecylerViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recyler_view, container, false);

        RecyclerView recyclerViewProductos = view.findViewById(R.id.fragmentRecyclerView_RecyclerView);

        List<Producto> productoList = ProvedorDeProductos.getProductos();
        ProductoAdapter productoAdapter = new ProductoAdapter(productoList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), RecyclerView.VERTICAL, false);

        recyclerViewProductos.setLayoutManager(linearLayoutManager);
        recyclerViewProductos.setAdapter(productoAdapter);


        return view;
    }
}
