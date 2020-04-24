package com.mt.cloud.repository.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * author: liqm
 * 2020-04-21
 */
@Data
@Entity
@Table(name = "tb_user")
@ToString
public class User {

    @Id
    @Column
    private Long id;

    @Column
    private String name;

}
