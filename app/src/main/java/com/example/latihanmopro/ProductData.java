package com.example.latihanmopro;
import java.util.ArrayList;
import android.net.Uri;

public class ProductData {
    public static String[][] data = new String[][]{
            {"Dancow", "Milk Powder Good for children's growth and development",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQxayYX7D1ZyO09gj2mFaMl_l9X-Gzq1f8oEvLNaUnPfl-YJ6gP"},
            {"Milo","Chocolate flavor that is tempting and high in calcium", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQ_B3tKtK1LQbOPQ6ePcxFDMgFXi5hNj8jTr3j21NDwLVHhKeky"},
            {"Anlene", "This milk is suitable for people who are old and have bone disease", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcT3QLIgRRmivWkqzIHrSzQwtmRTo4-za2EAS5vkLthCTKeIBQKe"},
            {"Ultra Milk", "Low fat UHT milk favored by Indonesian people","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQMb6Hm3tWy5fyNdUEcQfyCWwh5FMgMRfZOu1rN0-qjT8q-7opI"},
            {"Zee", "Child Growth Milk","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQSCYVsd8ieB_ZTI1QUkJ9_dL3UGeVHDwuKS19OS1IacSEYgcER"},
            {"Bear Brand", "Sterile milk with good taste","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTm6j7ZXL67YGBgBG4Pqin4-M-PLrzwLpoYfNz35xHvb6zqzun2"},
            {"Indo Milk", "Cheap and Very helpful for children's development","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQfrMWxAIR6ZDNYyt9fvKOaFAsJjRqopHF0c4FImQvcSc9dmX-u"}
    };
    public static String[][] data2 = new String[][]{
            {"Dancow", "Susu Bubuk Baik buat pertumbuhan anak dan masa kembang",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQxayYX7D1ZyO09gj2mFaMl_l9X-Gzq1f8oEvLNaUnPfl-YJ6gP"},
            {"Milo","Rasa Coklat yang menggoda dan tinggi kalsium", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQ_B3tKtK1LQbOPQ6ePcxFDMgFXi5hNj8jTr3j21NDwLVHhKeky"},
            {"Anlene", "Susu ini cocok bagi orang yang sudah tua dan mengalami penyakit tulang", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcT3QLIgRRmivWkqzIHrSzQwtmRTo4-za2EAS5vkLthCTKeIBQKe"},
            {"Ultra Milk", "Susu UHT yang rendah lemak digemari masyarkat indonesia","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQMb6Hm3tWy5fyNdUEcQfyCWwh5FMgMRfZOu1rN0-qjT8q-7opI"},
            {"Zee", "Susu Pertumbuhan anak","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQSCYVsd8ieB_ZTI1QUkJ9_dL3UGeVHDwuKS19OS1IacSEYgcER"},
            {"Bear Brand", "Susu steril dengan rasa yang enak","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTm6j7ZXL67YGBgBG4Pqin4-M-PLrzwLpoYfNz35xHvb6zqzun"},
            {"Indo Milk", "Murah dan Sangat membantu perkembangan anak","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQfrMWxAIR6ZDNYyt9fvKOaFAsJjRqopHF0c4FImQvcSc9dmX-u"}
    };

    public static ArrayList<Product> getListData(){
        Product product = null;
        ArrayList<Product> list = new ArrayList<>();
        for (int i = 0;i<data.length;i++){
            product = new Product();
            product.setName(data[i][0]);
            product.setDesc(data[i][1]);
            product.setPhoto(data[i][2]);

            list.add(product);
        }
        return list;
    }
    public static ArrayList<Product> getListData2(){
        Product product = null;
        ArrayList<Product> list2 = new ArrayList<>();
        for (int i = 0;i<data2.length;i++){
            product = new Product();
            product.setName(data2[i][0]);
            product.setDesc(data2[i][1]);
            product.setPhoto(data2[i][2]);

            list2.add(product);
        }
        return list2;
    }
}
