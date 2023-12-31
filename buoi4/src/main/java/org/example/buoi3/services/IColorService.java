package org.example.buoi3.services;

import org.example.buoi3.model.Color;

import java.util.List;

public interface IColorService {
    // phai hinh dung nhan cai gi, tra ve cai gi
    // nhan thong tin qua argument -> xu ly thong tin logic
    // tra ve thong tin thong qua doan return, tra ve co dang json
    // tao moi color -> nhan thong tin cua color -> tra ve thong tin color hoac tra ve cho nguoi dung 1 chuoi "bo may tao xong roi"
    Color createColor(String name, String type, String test);
    List<Color> getAllColor();
    List<Color> getColorByType(String type);
    Color createColorBody(Color color);
}
