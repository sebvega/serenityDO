package com.choucair.www.vega.test.hooks;

import com.choucair.www.vega.test.models.PersonalData;
import io.cucumber.java.DataTableType;

import java.util.Map;


public class DataTablePersonalData {
    @DataTableType
    public PersonalData transformToPersonalData(Map<String, String> data) {
        return new PersonalData(
                data.get("user"),
                data.get("password")
        );
    }
}
