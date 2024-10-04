package com.example.projectpizza.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.projectpizza.R;
import com.example.projectpizza.bean.Produit;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class PizzaAdapter extends BaseAdapter {
    private List<Produit> produit;
    private LayoutInflater inflater;
    private TextView txt1,txt2,txt3;
    private ImageView image1,image2,image3,image4;
    public PizzaAdapter(List<Produit> prd, Activity activity) {
        produit=prd;
        inflater=(LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return produit.size();
    }

    @Override
    public Produit getItem(int position) {
        return produit.get(position);
    }

    @Override
    public long getItemId(int position) {
        return produit.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null)
            convertView=inflater.inflate(R.layout.item,null);

        txt1=convertView.findViewById(R.id.txt1);
        txt2=convertView.findViewById(R.id.txt2);
        txt3=convertView.findViewById(R.id.txt3);
        image1=convertView.findViewById(R.id.image1);
        image2=convertView.findViewById(R.id.image2);
        image3=convertView.findViewById(R.id.image3);
        image4=convertView.findViewById(R.id.image4);

        txt1.setText(produit.get(position).getNom()+"");
        txt2.setText(produit.get(position).getNbrIngredients()+"");
        txt3.setText(produit.get(position).getDuree()+"");
        image1.setImageResource(produit.get(position).getPhoto());
        image2.setImageResource(R.drawable.man);
        image3.setImageResource(R.drawable.livraison);
        image4.setImageResource(R.drawable.flech);

        return convertView;
    }
}
