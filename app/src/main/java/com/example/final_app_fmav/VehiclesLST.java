package com.example.final_app_fmav;

import android.app.SearchManager;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.final_app_fmav.Adapters.VehicleAdapter;
import com.example.final_app_fmav.Interfaces.VehicleResultsCallBack;
import com.example.final_app_fmav.Models.Vehicle;
import com.example.final_app_fmav.Utilities.DataManager;

import java.util.ArrayList;

public class VehiclesLST extends AppCompatActivity {
    private RecyclerView main_LST_vehicles;
    private AppCompatButton back_to_main_page, go_to_map, cc_search1, cc_search2, cc_search3, type_search1, type_search2;
    private AppCompatButton price_search1,price_search2,price_search3,price_search4;
    public static final String KEY_MUSIC = "KEY_MUSIC";

    private Boolean musicChecked;
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicles_lst);
        Intent previousIntent = getIntent();
        musicChecked=previousIntent.getBooleanExtra(KEY_MUSIC,true);
        //init music feature
        SearchView searchView= findViewById(R.id.search_view_BAR);

        // init all vehicles list
        ArrayList<Vehicle> vehiclesList = DataManager.getVehicles();

        // init all UI features
        findViews();

        /// init filter and option buttons listeners

        //-----------------Options Buttons-------------
        back_to_main_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(back);
            }
        });

        go_to_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(back);
            }
        });

        //------------Filter buttons----------------

        //----------type search buttons

        type_search1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                typeSearch(1, vehiclesList);
            }
        });
        type_search2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                typeSearch(0, vehiclesList);
            }
        });
        //----------CC search buttons

        cc_search1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ccSearch(1, vehiclesList);
            }
        });
        cc_search2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ccSearch(2, vehiclesList);
            }
        });

        cc_search3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ccSearch(3, vehiclesList);
            }
        });



        //----------Price search buttons

        price_search1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                priceSearch(1, vehiclesList);
            }
        });
        price_search2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                priceSearch(2, vehiclesList);
            }
        });

        price_search3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                priceSearch(3, vehiclesList);
            }
        });

        price_search4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                priceSearch(4, vehiclesList);
            }
        });


        defaultSearchByTextToken(vehiclesList,searchView);
    }


    private void findViews() {
        main_LST_vehicles = findViewById(R.id.main_LST_vehicles);
        back_to_main_page = findViewById(R.id.back_to_main_page);
        go_to_map = findViewById(R.id.go_to_map);
        cc_search1 = findViewById(R.id.ccSearch1);
        cc_search2 = findViewById(R.id.ccSearch2);
        cc_search3 = findViewById(R.id.ccSearch3);
        type_search1 = findViewById(R.id.typeSearch1);
        type_search2 = findViewById(R.id.typeSearch2);
        price_search1=findViewById(R.id.priceSearch1);
        price_search2=findViewById(R.id.priceSearch2);
        price_search3=findViewById(R.id.priceSearch3);
        price_search4=findViewById(R.id.priceSearch4);
    }


    private void ccSearch(int ccCase, ArrayList<Vehicle> vehiclesList) {
        //cases 1-3 for CC level
        // if filter option button search for cc was pushed, a proper list will appear
        ArrayList<Vehicle> filteredVehicles = new ArrayList<>();

        for (Vehicle vehicle : vehiclesList) {
            if (ccCase == 1) {
                if (vehicle.getCc() >= 0 && vehicle.getCc() <= 500) {
                    filteredVehicles.add(vehicle);
                }
            } else if (ccCase == 2) {
                if (vehicle.getCc() > 500 && vehicle.getCc() <= 1000) {
                    filteredVehicles.add(vehicle);
                }
            } else if (ccCase == 3) {
                if (vehicle.getCc() > 1000) {
                    filteredVehicles.add(vehicle);
                }
            }
        }
        VehicleAdapter vehicleAdapter = new VehicleAdapter(getApplicationContext(), filteredVehicles);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        main_LST_vehicles.setLayoutManager(linearLayoutManager);
        main_LST_vehicles.swapAdapter(vehicleAdapter, true);
        vehicleAdapter.setVehicleResultsCallBack(new VehicleResultsCallBack() {
            @Override
            public void itemClicked(Vehicle vehicle, int position) {
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, vehicle.getTitle()+" "+vehicle.getCc()+" For Sale"); // query contains search string
                startActivity(intent);
            }
        });
    }


    private void typeSearch(int typeCase, ArrayList<Vehicle> vehiclesList) {
        //case 1 for bikes or case 0 for cars
        // if filter option button search for cc was pushed, a proper list will appear
        ArrayList<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehiclesList) {
            if (typeCase == 1) {
                if (vehicle.getType() == 1) {
                    filteredVehicles.add(vehicle);
                }
            } else if (typeCase == 0) {
                if (vehicle.getType() == 0) {
                    filteredVehicles.add(vehicle);
                }
            }
        }
        VehicleAdapter vehicleAdapter = new VehicleAdapter(getApplicationContext(), filteredVehicles);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        main_LST_vehicles.setLayoutManager(linearLayoutManager);
        main_LST_vehicles.swapAdapter(vehicleAdapter, true);
        vehicleAdapter.setVehicleResultsCallBack(new VehicleResultsCallBack() {
            @Override
            public void itemClicked(Vehicle vehicle, int position) {
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, vehicle.getTitle()+" "+vehicle.getCc()+" For Sale"); // query contains search string
                startActivity(intent);
            }
        });
    }




    private void defaultSearchByTextToken(ArrayList<Vehicle> vehiclesList,SearchView searchView){
        // if no filter option button search was pushed, user can type key words for list

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                ArrayList<Vehicle> filteredVehicles=new ArrayList<>();
                // when searching car by typing text, matching the results
                for(Vehicle vehicle: vehiclesList)
                {
                    if(vehicle.getTitle().toUpperCase().contains(s.toUpperCase()))
                    {
                        filteredVehicles.add(vehicle);
                    }
                    else if(vehicle.getTitle().toLowerCase().contains(s.toLowerCase()))
                    {
                        filteredVehicles.add(vehicle);
                    }
                }
                VehicleAdapter vehicleAdapter=new VehicleAdapter(getApplicationContext(),filteredVehicles);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
                linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
                main_LST_vehicles.setLayoutManager(linearLayoutManager);
                main_LST_vehicles.setAdapter(vehicleAdapter);
                vehicleAdapter.setVehicleResultsCallBack(new VehicleResultsCallBack() {
                    @Override
                    public void itemClicked(Vehicle vehicle, int position) {
                        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                        intent.putExtra(SearchManager.QUERY, vehicle.getTitle()+" "+vehicle.getCc()+" For Sale"); // query contains search string
                        startActivity(intent);
                    }
                });
                return true;
            }
        });

    }

    private void priceSearch(int priceCase, ArrayList<Vehicle> vehiclesList) {
        //cases 1-4 for price level
        // if filter option button search for price was pushed, a proper list will appear
        ArrayList<Vehicle> filteredVehicles = new ArrayList<>();

        for (Vehicle vehicle : vehiclesList) {
            if (priceCase == 1) {
                if (vehicle.getPrice()<=10000) {
                    filteredVehicles.add(vehicle);
                }
            } else if (priceCase == 2) {
                if (vehicle.getPrice()>10000 && vehicle.getPrice()<=50000) {
                    filteredVehicles.add(vehicle);
                }
            } else if (priceCase == 3) {
                if (vehicle.getPrice()>50000 && vehicle.getPrice()<=150000) {
                    filteredVehicles.add(vehicle);
                }
            }
            else if (priceCase == 4) {
                if (vehicle.getPrice()>150000) {
                    filteredVehicles.add(vehicle);
                }
            }
        }
        VehicleAdapter vehicleAdapter = new VehicleAdapter(getApplicationContext(), filteredVehicles);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        main_LST_vehicles.setLayoutManager(linearLayoutManager);
        main_LST_vehicles.setAdapter(vehicleAdapter);
        vehicleAdapter.setVehicleResultsCallBack(new VehicleResultsCallBack() {
            @Override
            public void itemClicked(Vehicle vehicle, int position) {
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, vehicle.getTitle()+" "+vehicle.getCc()+" For Sale"); // query contains search string
                startActivity(intent);
            }
        });
    }




}