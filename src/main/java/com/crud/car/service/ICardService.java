// 3.1:

package com.crud.car.service;

import com.crud.car.model.Card;

import java.util.List;

public interface ICardService {

    public List<Card> findAll();
    public int save(Card card);
    public int update(Card card );
    public int deleteById(int id);

}
