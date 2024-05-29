// 2.1:

package com.crud.car.repository;

import com.crud.car.model.Card;

import java.util.List;

public interface ICardRepository {

    public List<Card> findAll();
    public int save(Card card);
    public int update(Card card );
    public int deleteById(int id);

}
