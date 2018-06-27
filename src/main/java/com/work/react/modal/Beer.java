package com.work.react.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Beer {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Beer(String name) {
        this.name = name;
    }
}
