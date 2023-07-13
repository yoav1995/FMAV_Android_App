package com.example.final_app_fmav.Utilities;

import com.example.final_app_fmav.Models.LocationDetails;
import com.example.final_app_fmav.Models.Vehicle;

import java.util.ArrayList;

public class DataManager {


    // Vehicles Array
    public static ArrayList<Vehicle> getVehicles() {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        /// -----------------1---------------
        vehicles.add(new Vehicle()
                .setTitle("Hyundai i10 inspire- first hand")
                .setCc(1200)
                .setPrice(76900)
                .setKm(0)
                .setPicUrl("https://www.cartube.co.il/images/stories/hyundai/i10/2016/i10-2017-fl/new-hyundai-i10-2017-facelift-1.jpg")
                .setDetails("\nAutomatic, 5 Seats, 4*2")
                .setType(0)
        );
        /// -----------------2----------------

        vehicles.add(new Vehicle()
                .setTitle("Hyundai i20 prime- first hand")
                .setCc(1000)
                .setPrice(113900)
                .setKm(0)
                .setPicUrl("https://images.carexpert.com.au/crop/800/500/vehicles/source-g/3/e/3e55e02e.jpg")
                .setDetails("\nAutomatic-Turbo, 5 Seats, 4*2")
                .setType(0)
        );


        /// -----------------3-----------------
        vehicles.add(new Vehicle()
                .setTitle("Hyundai Tucson Prime 2.0 - first hand")
                .setCc(2000)
                .setPrice(161900)
                .setKm(0)
                .setPicUrl("https://s3.us-east-2.amazonaws.com/dealer-inspire-vps-vehicle-images/stock-images/chrome/a7012dee11047cc70cdd1a8380c7d8d4.png")
                .setDetails("\nAutomatic, 5 Seats, 4*2")
                .setType(0)
        );

        /// -----------------4--------------
        vehicles.add(new Vehicle()
                .setTitle("Hyundai Elantra Hybrid- first hand")
                .setCc(1600)
                .setPrice(159900)
                .setKm(0)
                .setPicUrl("https://images.auto.co.il/Attachment/Gallery/245452/1673932/Hyundai-Elantra-Hybrid-2023-04.jpg?width=480&format=webp")
                .setDetails("\nAutomatic,Hybrid, 5 Seats, 4*2")
                .setType(0)
        );

        /// -----------------5--------------
        vehicles.add(new Vehicle()
                .setTitle("Hyundai Sonata Hybrid- first hand")
                .setCc(2000)
                .setPrice(201900)
                .setKm(0)
                .setPicUrl("https://www.motortrend.com/uploads/2022/08/2023-Hyundai-Sonata-22.jpg")
                .setDetails("\nAutomatic,Hybrid, 5 Seats, 4*2")
                .setType(0)
        );

        /// -----------------6--------------
        vehicles.add(new Vehicle()
                .setTitle("Hyundai Palisade luxury- first hand")
                .setCc(3778)
                .setPrice(319900)
                .setKm(0)
                .setPicUrl("https://media.ed.edmunds-media.com/hyundai/palisade/2023/oem/2023_hyundai_palisade_4dr-suv_calligraphy_fq_oem_1_1600.jpg")
                .setDetails("\nAutomatic, 7 Seats, 4*4")
                .setType(0)
        );

        /// -----------------7--------------
        vehicles.add(new Vehicle()
                .setTitle("Honda Civic Hybrid Elegance- first hand")
                .setCc(2000)
                .setPrice(210900)
                .setKm(0)
                .setPicUrl("https://honda.co.il/wp-content/uploads/2017/06/1.jpg")
                .setDetails("\nAutomatic,Hybrid, 5 Seats, 4*2")
                .setType(0)
        );
        /// -----------------8--------------
        vehicles.add(new Vehicle()
                .setTitle("Honda Jazz Hybrid Elegance- first hand")
                .setCc(1500)
                .setPrice(147900)
                .setKm(0)
                .setPicUrl("https://images.autoboom.co.il/RfbJVL0SUKcqdEb4NH-5gPL6p88sgwJGW5AwQRXImCg/fit/1200/1200/sm/0/Z3M6Ly9hdXRvYm9vbS1pbWFnZXMvMDAwLzAwMC8yMzUvMjM1MjcwLmpwZw.jpg")
                .setDetails("\nAutomatic,Hybrid, 5 Seats, 4*2")
                .setType(0)
        );

        vehicles.add(new Vehicle()
                .setTitle("Hyundai IONIQ 5- first hand")
                .setCc(0)
                .setPrice(213900)
                .setKm(0)
                .setPicUrl("https://upload.wikimedia.org/wikipedia/commons/c/c1/Hyundai_Ioniq_5_IAA_2021_1X7A0189.jpg")
                .setDetails("\nElectric Car, 5 Seats, 4*2")
                .setType(0)
        );

        vehicles.add(new Vehicle()
                .setTitle("Toyota Corolla Sedan Hybrid- first hand")
                .setCc(1600)
                .setPrice(157990)
                .setKm(0)
                .setPicUrl("https://images.autoboom.co.il/KN3fhJS2NMElg6qNYyuYh1rw4MyQgrwebC0DKIkAwU8/fit/1200/1200/sm/0/Z3M6Ly9hdXRvYm9vbS1pbWFnZXMvMDAwLzAwMC8xNzEvMTcxNzg4LmpwZw.jpg")
                .setDetails("\nAutomatic,Hybrid, 5 Seats, 4*2")
                .setType(0)
        );


        vehicles.add(new Vehicle()
                .setTitle("Toyota Rav4 Hybrid- first hand")
                .setCc(0)
                .setPrice(199990)
                .setKm(0)
                .setPicUrl("https://www.iihs.org/cdn-cgi/image/width=636/api/ratings/model-year-images/3246/")
                .setDetails("\nAutomatic,Hybrid, 5 Seats, 4*2/4*4")
                .setType(0)
        );

        vehicles.add(new Vehicle()
                .setTitle("Toyota Land Cruiser- first hand")
                .setCc(2800)
                .setPrice(339990)
                .setKm(0)
                .setPicUrl("https://mysterio.yahoo.com/mysterio/api/715B340CB3EF0E4F97A4735DE08A40B9F568E06D84FC0A852520DC62F44EF069/autoblog/resizefill_w660_h372;quality_80;format_webp;cc_31536000;/https://s.aolcdn.com/os/ab/_cms/2023/06/08015312/2024_Lexus_GX_Overtrail_007.jpg")
                .setDetails("\nAutomatic,Diesel, 5/7 Seats, 4*4")
                .setType(0)
        );

        vehicles.add(new Vehicle()
                .setTitle("Mazda 3 Sedan- first hand")
                .setCc(2000)
                .setPrice(147500)
                .setKm(0)
                .setPicUrl("https://www.mazda.co.il/_next/image?url=https%3A%2F%2Fapi.mazda.co.il%2FUploads%2F%2FNew%2F3%2520SDN%2F360%2F%25D7%2597%25D7%2595%25D7%25A5%2Fpremium%2F46V%2520%25D7%2590%25D7%2593%25D7%2595%25D7%259D%2520%25D7%25A2%25D7%25A9%25D7%2599%25D7%25A8%2520%25D7%25A0%25D7%2595%25D7%25A6%25D7%25A5%2FMazda3_BPL5_BGSELAB_46V_BY3_EXT_360_24_TransparentPNG_0004.png&w=856&q=75")
                .setDetails("\nAutomatic, 5 Seats, 4*2")
                .setType(0)
        );










        /// -----------------BIKES--------------
        /// -------------------------------
        vehicles.add(new Vehicle()
                .setTitle("Honda Forza 125- first hand")
                .setCc(125)
                .setPrice(27900)
                .setKm(0)
                .setPicUrl("https://www.tuningblog.eu/wp-content/uploads/2022/11/2023-HONDA-FORZA-350-11.jpg")
                .setDetails("\nAutomatic, Big Load, Manager Type")
                .setType(1)
        );
        /// -------------------------------
        vehicles.add(new Vehicle()
                .setTitle("Honda PCX 125- first hand")
                .setCc(125)
                .setPrice(19500)
                .setKm(0)
                .setPicUrl("https://www.thrustzone.com/wp-content/uploads/2022/11/2023-Honda-PCX-125-Scooter-Revealed-2-1200x900.jpg")
                .setDetails("\nAutomatic, Light Type")
                .setType(1)
        );
        /// -------------------------------
        vehicles.add(new Vehicle()
                .setTitle("Honda Forza 350- first hand")
                .setCc(350)
                .setPrice(37900)
                .setKm(0)
                .setPicUrl("https://www.tuningblog.eu/wp-content/uploads/2022/11/2023-HONDA-FORZA-350-11.jpg")
                .setDetails("\nAutomatic, Big Load, Manager Type")
                .setType(1)
        );
        /// -------------------------------
        vehicles.add(new Vehicle()
                .setTitle("Honda X-ADV- first hand")
                .setCc(750)
                .setPrice(83900)
                .setKm(0)
                .setPicUrl("https://paultan.org/image/2023/02/2023-Honda-X-ADV-Malaysia-3-e1677482147931.jpg")
                .setDetails("\nSport, Big Load, Manager Type")
                .setType(1)
        );
        /// -------------------------------
        vehicles.add(new Vehicle()
                .setTitle("Honda CB500X- first hand")
                .setCc(500)
                .setPrice(49900)
                .setKm(0)
                .setPicUrl("https://cdp.azureedge.net/products/USA/HO/2023/MC/DUALPURP/CB500X_ABS/50/PEARL_ORGANIC_GREEN/2000000004.jpg")
                .setDetails("\nSport ")
                .setType(1)
        );
        /// -------------------------------
        vehicles.add(new Vehicle()
                .setTitle("Honda CB300R- first hand")
                .setCc(300)
                .setPrice(35900)
                .setKm(0)
                .setPicUrl("https://motomagazine.co.il/wp-content/uploads/2022/08/HONDA-CB300R-2023-30.jpg")
                .setDetails("\nSport, Light")
                .setType(1)
        );
        /// -------------------------------
        vehicles.add(new Vehicle()
                .setTitle("Honda CMX500 Rebel- first hand")
                .setCc(500)
                .setPrice(48450)
                .setKm(0)
                .setPicUrl("https://cdp.azureedge.net/products/USA/HO/2023/MC/CRUISER/REBEL_500_ABS_SE/50/TITANIUM_METALLIC/2000000001.jpg")
                .setDetails("\nLow Seat, Heavy")
                .setType(1)
        );
        /// -------------------------------
        vehicles.add(new Vehicle()
                .setTitle("Honda CB1000R- first hand")
                .setCc(1000)
                .setPrice(99900)
                .setKm(0)
                .setPicUrl("https://www.webbikeworld.com/wp-content/uploads/2023/03/2023-Honda-CB1000R-Black-Edition-0008.jpg")
                .setDetails("\nRoad, Heavy Bike")
                .setType(1)
        );

        /// -------------------------------
        vehicles.add(new Vehicle()
                .setTitle("Piaggio MP3 400- first hand")
                .setCc(400)
                .setPrice(42865)
                .setKm(0)
                .setPicUrl("https://www.oferavnir.co.il/wp-content/uploads/2019/07/20190508173037-1100x786-1.jpg")
                .setDetails("\n3 Wheels Bike")
                .setType(1)
        );

        /// -------------------------------
        vehicles.add(new Vehicle()
                .setTitle("Piaggio MP3 530- first hand")
                .setCc(530)
                .setPrice(71970)
                .setKm(0)
                .setPicUrl("https://www.oferavnir.co.il/wp-content/uploads/2019/07/01_EXCLUSIVE_GRIGIO-copia-1100x618-1.jpg")
                .setDetails("\n3 Wheels Bike")
                .setType(1)
        );

        /// -------------------------------
        vehicles.add(new Vehicle()
                .setTitle("Kymco XTown 125i- first hand")
                .setCc(125)
                .setPrice(23060)
                .setKm(0)
                .setPicUrl("https://www.oferavnir.co.il/wp-content/uploads/2019/07/01_EXCLUSIVE_GRIGIO-copia-1100x618-1.jpg")
                .setDetails("\nAutomatic, Big Load, Manager Type")
                .setType(1)
        );

        /// -------------------------------
        vehicles.add(new Vehicle()
                .setTitle("Kymco AK 550- first hand")
                .setCc(550)
                .setPrice(64970)
                .setKm(0)
                .setPicUrl("https://www.oferavnir.co.il/wp-content/uploads/2018/11/e003_a050_final_t1529226224687-X2.png")
                .setDetails("\nAutomatic, Big Load, Manager Type")
                .setType(1)
        );
        /// -------------------------------
        vehicles.add(new Vehicle()
                .setTitle("NK 250- first hand")
                .setCc(250)
                .setPrice(22970)
                .setKm(0)
                .setPicUrl("https://www.oferavnir.co.il/wp-content/uploads/2019/07/171127_CFMOTO_250NK______%C2%B0_left45__-ToClient-____-1.jpg")
                .setDetails("\nLight Bike")
                .setType(1)
        );

        /// -------------------------------
        vehicles.add(new Vehicle()
                .setTitle("Yamaha XMAX 125- first hand")
                .setCc(125)
                .setPrice(28985)
                .setKm(0)
                .setPicUrl("https://www.yamaha-motor.co.il/files/YAMAHA/MODELS/2022/XMAX125/2022-Yamaha-XMAX125-EU-Icon_Blue-Studio-001-03.jpg")
                .setDetails("\nAutomatic, Big Load, Manager Type")
                .setType(1)
        );

        /// -------------------------------
        vehicles.add(new Vehicle()
                .setTitle("Yamaha TMAX 560- first hand")
                .setCc(560)
                .setPrice(22970)
                .setKm(0)
                .setPicUrl("https://www.oferavnir.co.il/wp-content/uploads/2019/07/171127_CFMOTO_250NK______%C2%B0_left45__-ToClient-____-1.jpg")
                .setDetails("\nAutomatic, Big Load, Manager Type")
                .setType(1)
        );
        /// -------------------------------
        vehicles.add(new Vehicle()
                .setTitle("Yamaha YZF R3 - first hand")
                .setCc(320)
                .setPrice(35985)
                .setKm(0)
                .setPicUrl("https://www.yamaha-motor.co.il/files/2022-Yamaha-YZF-R320-EU-Icon_Blue-Studio-001-03.jpg")
                .setDetails("\nLight Sport Bike")
                .setType(1)
        );
        /// -------------------------------
        vehicles.add(new Vehicle()
                .setTitle("Yamaha MT 09 - first hand")
                .setCc(880)
                .setPrice(67985)
                .setKm(0)
                .setPicUrl("https://www.yamaha-motor.co.il/files/YAMAHA/MODELS/2022/MT09/2022-Yamaha-MT09-EU-Icon_Blue-Studio-001-03.jpg")
                .setDetails("\nHyper Naked Bike")
                .setType(1)
        );
        return vehicles;
    }


    ///Locations Marks Array
    public static ArrayList<LocationDetails> getLocationsDet()
    {
        ArrayList<LocationDetails> locationDetailsLst = new ArrayList<>();

        locationDetailsLst.add(new LocationDetails().
                setTitle("Metro Motor TLV").
                setLat(32.054382).
                setLng(34.772314)
        );
        locationDetailsLst.add(new LocationDetails().
                setTitle("Offer Avnir Motor")
                        .
                setLat(32.06750591118192)
                .setLng(34.78723597315868)
        );

        locationDetailsLst.add(new LocationDetails().
                setTitle("Trade Mobile Rishon")
                        .
                setLat(31.992238887601353)
                .setLng(34.7694808865096)
        );


        locationDetailsLst.add(new LocationDetails().
                setTitle("AutoDeal Bnei Brak")
                        .
                setLat(32.13686605252331)
                .setLng(34.80507344505452)
        );


        locationDetailsLst.add(new LocationDetails().
                setTitle("Elbar Ramat Gan")
                        .
                setLat(32.126293043683404)
                .setLng(34.8260489394814)
        );


        locationDetailsLst.add(new LocationDetails().
                setTitle("Auto Center Petach Tikva")
                        .
                setLat( 32.099741651253204)
                .setLng(34.847371601776786)
        );


        locationDetailsLst.add(new LocationDetails().
                setTitle("Auto Class Or Akiva")
                        .
                setLat(32.50965463662913)
                .setLng( 34.926150964107826)
        );


        locationDetailsLst.add(new LocationDetails().
                setTitle("Honda Hadera")
                        .
                setLat( 32.44200404585322)
                .setLng( 34.931805225987546)
        );



        locationDetailsLst.add(new LocationDetails().
                setTitle("Deal Motors Haifa")
                        .
                setLat(32.78329240508482)
                .setLng(35.04251471145518)
        );


        locationDetailsLst.add(new LocationDetails().
                setTitle("Auto Center Haifa")
                        .
                setLat(32.8139324440106)
                .setLng(35.05901296020385)
        );

        locationDetailsLst.add(new LocationDetails().
                setTitle("Trade In Haifa")
                        .
                setLat(32.83989728508555)
                .setLng(34.9814220187812)
        );

        locationDetailsLst.add(new LocationDetails().
                setTitle("Next Car Haifa")
                        .
                setLat(32.79938477526636)
                .setLng(35.043916159877)
        );

        locationDetailsLst.add(new LocationDetails().
                setTitle("Horowitz Car Jerusalem")
                        .
                setLat(31.790600605252013)
                .setLng(35.200133981418034)
        );


        locationDetailsLst.add(new LocationDetails().
                setTitle("Shai Bar Second Hand, Jerusalem")
                        .
                setLat(31.790454696552054)
                .setLng(35.190177621677954)
        );

        locationDetailsLst.add(new LocationDetails().
                setTitle("Avis Jerusalem")
                        .
                setLat(31.747175684517792)
                .setLng(35.21078312119597)
        );

        locationDetailsLst.add(new LocationDetails().
                setTitle("Elbar Beer Sheva")
                        .
                setLat(31.24802257922733)
                .setLng(34.81311818049755)
        );

        locationDetailsLst.add(new LocationDetails().
                setTitle("Car Lis Beer Sheva")
                        .
                setLat(31.247562250847057)
                .setLng(34.80511665438345)
        );


        locationDetailsLst.add(new LocationDetails().
                setTitle("Geely Beer Sheva")
                        .
                setLat(31.251671417209803)
                .setLng(34.83550071772815)
        );



        locationDetailsLst.add(new LocationDetails().
                setTitle("Trade In Netanaya")
                        .
                setLat(32.32638923198123)
                .setLng(34.87873673213746)
        );

        locationDetailsLst.add(new LocationDetails().
                setTitle("Auto Plus Netanya")
                        .
                setLat(32.31680568411649)
                .setLng(34.87615172718128)
        );

        locationDetailsLst.add(new LocationDetails().
                setTitle("Auto Market Netanya")
                        .
                setLat(32.31420241194158)
                .setLng(34.87702855552205)
        );

        return locationDetailsLst;
    }


}