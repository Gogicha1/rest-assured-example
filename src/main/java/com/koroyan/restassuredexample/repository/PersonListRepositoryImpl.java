package com.koroyan.restassuredexample.repository;

import com.koroyan.restassuredexample.pojos.response.GetListByNameResult;

public class PersonListRepositoryImpl implements PersonListRepository {
    PersonListData personListData = new PersonListData();

    @Override
    public GetListByNameResult getList(String name) {
        return personListData.getAllPersons();
    }

}
