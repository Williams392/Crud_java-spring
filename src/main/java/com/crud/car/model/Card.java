// 2.2:

package com.crud.car.model;

import lombok.Data;

@Data
public class Card {

    int id_card;
    String name;
    String number;
    String type;
    int cvv;
    int status;

}
