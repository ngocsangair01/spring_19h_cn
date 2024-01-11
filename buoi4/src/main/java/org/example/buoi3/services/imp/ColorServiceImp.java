package org.example.buoi3.services.imp;

import org.example.buoi3.model.Color;
import org.example.buoi3.repositories.ColorRepository;
import org.example.buoi3.services.IColorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ColorServiceImp implements IColorService {

    private final ColorRepository colorRepository;

    public ColorServiceImp(ColorRepository colorRepository) {
        this.colorRepository = colorRepository;
    }

    @Override
    public Color createColor(String name, String type, String test) {
        Color color = new Color(null,name,type,test);
        colorRepository.save(color);
        return color;
    }

    @Override
    public List<Color> getAllColor() {
        return colorRepository.findAll();
    }

    @Override
    public List<Color> getColorByType(String type) {
        return colorRepository.findAllByType(type);
    }

    @Override
    public Color createColorBody(Color color) {
        colorRepository.save(color);
        return color;
    }

    @Override
    public List<Color> getByName(String name) {
        List<Color> colors = colorRepository.getByName(name);
        return colors;
    }

    @Override
    public List<Color> getByKeyword(String keyword) {
        return colorRepository.getByKeyword(keyword);
    }

    @Override
    public Color editAttribute(Long id, String name, String type, String test) {
        // B1 Tìm kiếm đối tượng theo id => set các thuộc tính cho đối tượng => Lưu đối tượng vào database
        Optional<Color> color = colorRepository.findById(id);
        color.get().setName(name);
        color.get().setType(type);
        color.get().setTest(test);
        colorRepository.save(color.get());
        return color.get();
    }

    @Override
    public Color editObjectColor(Long id, Color color) {
        colorRepository.save(color);
        return color;
    }
}
