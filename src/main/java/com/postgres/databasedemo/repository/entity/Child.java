package com.postgres.databasedemo.repository.entity;

import com.postgres.databasedemo.constant.ChildEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Child implements Serializable {

    private String name;

    @Enumerated(EnumType.STRING)
    private ChildEnum childNumber;
}
