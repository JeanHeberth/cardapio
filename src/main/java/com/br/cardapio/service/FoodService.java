//package com.br.cardapio.service;
//
//import com.br.cardapio.dto.FoodRequestDTO;
//import com.br.cardapio.dto.FoodResponseDTO;
//import com.br.cardapio.entity.Food;
//import com.br.cardapio.repository.FoodRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//public class FoodService {
//
//
//    @Autowired
//    FoodRepository foodRepository;
//
//
//    public FoodResponseDTO saveFood(FoodRequestDTO dto) {
//        Food foodData = new Food(dto);
//        foodRepository.save(foodData);
//        return new FoodResponseDTO(dto);
//    }
//
//
//    public List<FoodResponseDTO> getFoods() {
//        List<FoodResponseDTO> foodList = foodRepository.findAll().stream()
//                .map(FoodResponseDTO::new).collect(Collectors.toList());
//        return foodList;
//    }
//}
