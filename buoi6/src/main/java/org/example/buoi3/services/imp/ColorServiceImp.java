package org.example.buoi3.services.imp;

import org.example.buoi3.model.Color;
import org.example.buoi3.repositories.ColorRepository;
import org.example.buoi3.services.IColorService;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
