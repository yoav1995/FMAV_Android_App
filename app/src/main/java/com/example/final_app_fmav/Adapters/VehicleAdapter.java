package com.example.final_app_fmav.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.final_app_fmav.Interfaces.VehicleResultsCallBack;
import com.example.final_app_fmav.Models.Vehicle;
import com.example.final_app_fmav.R;
import com.example.final_app_fmav.Utilities.ImageLoader;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

public class VehicleAdapter extends RecyclerView.Adapter<VehicleAdapter.VehicleViewHolder> {

    private ArrayList<Vehicle> filtered_vehicles;
    private Context context;

    private VehicleResultsCallBack vehicleResultsCallBack;
    public VehicleAdapter(Context context, ArrayList<Vehicle> filtered_vehicles) {
        this.context = context;
        this.filtered_vehicles = filtered_vehicles;
    }

    @NonNull
    @Override
    public  VehicleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.vehicle_item,parent,false);
        VehicleViewHolder vehicleViewHolder = new VehicleViewHolder(view);
        return vehicleViewHolder;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull VehicleViewHolder holder, int position) {
        Vehicle vehicle=getItem(position);
        holder.vehicle_LBL_title.setText(vehicle.getType()+", "+vehicle.getTitle());
        holder.vehicle_LBL_cc.setText("CC: "+vehicle.getCc()+"");
        holder.vehicle_LBL_details.setText("Item Details: "+vehicle.getDetails());
        holder.vehicle_LBL_km.setText("Price: "+vehicle.getPrice()+"");

        ImageLoader.getInstance().loadImage(vehicle.getPicUrl(), holder.vehicle_IMG_poster);
        if (vehicle.isFavorite())
            holder.vehicle_IMG_favorite.setImageResource(R.drawable.heart);
        else
            holder.vehicle_IMG_favorite.setImageResource(R.drawable.heart_empty);
        holder.vehicle_IMG_favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vehicle.setFavorite();
                if (vehicle.isFavorite())
                    holder.vehicle_IMG_favorite.setImageResource(R.drawable.heart);
                else
                    holder.vehicle_IMG_favorite.setImageResource(R.drawable.heart_empty);
            }
        });
    }

    private Vehicle getItem(int position) {
        return this.filtered_vehicles.get(position);
    }


    @Override
    public int getItemCount() {

        return this.filtered_vehicles == null ? 0 : this.filtered_vehicles.size();
    }

    public void setVehicleResultsCallBack(VehicleResultsCallBack vehicleResultsCallBack){
        this.vehicleResultsCallBack=vehicleResultsCallBack;
    }
    public class VehicleViewHolder extends RecyclerView.ViewHolder{
        private MaterialTextView vehicle_LBL_title;
        private MaterialTextView vehicle_LBL_cc;
        private MaterialTextView vehicle_LBL_km;
        private MaterialTextView vehicle_LBL_details;
        private ShapeableImageView vehicle_IMG_poster;
        private ShapeableImageView vehicle_IMG_favorite;


        public VehicleViewHolder(@NonNull View itemView) {
            super(itemView);
            vehicle_IMG_poster=itemView.findViewById(R.id.vehicle_IMG_poster);
            vehicle_IMG_favorite=itemView.findViewById(R.id.vehicle_IMG_favorite);
            vehicle_LBL_title=itemView.findViewById(R.id.vehicle_LBL_title);
            vehicle_LBL_cc=itemView.findViewById(R.id.vehicle_LBL_cc);
            vehicle_LBL_km=itemView.findViewById(R.id.vehicle_LBL_price);
            vehicle_LBL_details=itemView.findViewById(R.id.vehicle_LBL_details);
            vehicle_IMG_poster.setOnClickListener(view -> {
                if(vehicleResultsCallBack != null) {
                    vehicleResultsCallBack.itemClicked(getItem(getAdapterPosition()),getAdapterPosition());
                }
            });

        }

    }

}
