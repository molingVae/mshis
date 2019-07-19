package com.mshis.medicalSystem.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * description:
 * author: 沫凌
 * create: 2019-07-14 9:29
 */
@Data
@AllArgsConstructor
public class PageInfo implements Serializable {

    private long total;
    private List row;
}
