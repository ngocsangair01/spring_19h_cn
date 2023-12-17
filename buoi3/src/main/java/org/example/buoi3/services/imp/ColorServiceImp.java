package org.example.buoi3.services.imp;

import org.example.buoi3.constants.ColdColor;
import org.example.buoi3.constants.HotColor;
import org.example.buoi3.model.Colors;
import org.example.buoi3.model.Result;
import org.example.buoi3.services.IColorService;
import org.springframework.stereotype.Service;

@Service
public class ColorServiceImp implements IColorService {

    /**
     * Compare to dùng để so sánh 2 chuỗi, khi 2 chuỗi bằng nhau thì kết quả trả về 0, khi chuỗi 1 lớn hơn chuỗi 2 thì kết quả trả về 1, khi chuỗi 1 nhỏ hơn chuỗi 2 thì kết quả trả về -1
     * **/
    @Override
    public Result checkColor(Colors colors) {
        Result result = new Result();
        if (colors.getName().toUpperCase().compareTo(HotColor.RED.name())==0 || colors.getName().toUpperCase().equals(HotColor.ORANGE.name())|| colors.getName().toUpperCase().equals(HotColor.PINK.name())){
            result.setStatus("SUCCESS");
            result.setIsHot(true);
            result.setColors1(colors);
        }
        else if(colors.getName().toUpperCase().compareTo(ColdColor.BLUE.name())==0 || colors.getName().toUpperCase().equals(ColdColor.GREEN.name())|| colors.getName().toUpperCase().equals(ColdColor.BLACK.name())){
            result.setStatus("FAIL");
            result.setIsHot(false);
            result.setColors1(colors);
        }
        else {
            result.setStatus("UNDEFINED");
            result.setIsHot(false);
            result.setColors1(colors);
        }
        return result;
    }
}
