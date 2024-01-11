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
    //Yêu cầu đầu bài: lấy thông tin các màu sắc có tên có chứa ký tự do, ví dụ nhập input là 'd', 'o' => đều in ra được kết quả
    List<Color> getByName(String name);
    //Nhập vào 1 từ, gọi là keyword => tìm ra được tất cả các thông tin chứa nó (name,type,test)
    List<Color> getByKeyword(String keyword);
    //Truyền từng thuộc tính,truyền đến đâu sửa đến đó
    Color editAttribute(Long id,String name, String type, String test);
    //Truyền vào hẳn 1 đối tượng có id là id của đối tượng cũ, sau đó đè lên đối tượng cũ
    Color editObjectColor(Long id,Color color);
}
