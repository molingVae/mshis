package com.lcp.medicalSystem.service;

import com.lcp.medicalSystem.pojo.Result;

/**
 * description:
 * author: 沫凌
 * create: 2019-07-14 9:24
 */

public interface TcmService {

    Result getTcmByTitle(String title, int page, int size);

}
