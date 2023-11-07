package com.koroyan.restassuredexample.repository;

import com.koroyan.restassuredexample.pojos.response.GetListByNameResult;

public interface PersonListRepository {
    GetListByNameResult getList(String name);
}