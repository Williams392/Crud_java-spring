// 3.2:

package com.crud.car.service;

import com.crud.car.model.Card;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CardService implements  ICardService{

    @Autowired // importante para inyectar dependencias en Spring.
    private ICardService iCardService;

    @Override
    public List<Card> findAll() {
        return List.of();
    }

    @Override
    public int save(Card card) {
        return 0;
    }

    @Override
    public int update(Card card) {
        return 0;
    }

    @Override
    public int deleteById(int id) {
        return 0;
    }
}
