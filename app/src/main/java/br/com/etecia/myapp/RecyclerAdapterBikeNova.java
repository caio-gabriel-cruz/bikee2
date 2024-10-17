package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapterBikeNova extends RecyclerView.Adapter<RecyclerAdapterBikeNova.ViewHolder> {

    //criando variáveis globais para representar a lista e o contexto
    private Context context;
    private List<BikeNova> lstBikeNova;

    //criando construtor

    public RecyclerAdapterBikeNova(Context context, List<BikeNova> lstBikeNova) {
        this.context = context;
        this.lstBikeNova = lstBikeNova;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_bikes_novas, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.idModeloTituloBikeNova.setText(lstBikeNova.get(position).getTitulo());
        holder.idModeloImagemBikeNova.setImageResource(lstBikeNova.get(position).getImage());

        //criar o click do card

    }

    @Override
    public int getItemCount() {
        return lstBikeNova.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView idModeloBikeNova;
        ImageView idModeloImagemBikeNova;
        TextView idModeloTituloBikeNova;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            idModeloBikeNova = itemView.findViewById(R.id.idModeloBikeNova);
            idModeloImagemBikeNova = itemView.findViewById(R.id.idModeloImagemBikeNova);
            idModeloTituloBikeNova = itemView.findViewById(R.id.idModeloTituloBikeNova);
        }
    }

}
