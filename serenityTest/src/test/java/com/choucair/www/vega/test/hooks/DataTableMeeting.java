package com.choucair.www.vega.test.hooks;

import com.choucair.www.vega.test.models.MeetingData;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class DataTableMeeting {
    @DataTableType
    public MeetingData transformToMeting(Map<String, String> data) {
        return new MeetingData(
                data.get("nameBussinesUnit"),
                data.get("meetingName"),
                data.get("meetingType"),
                data.get("meetingNumber"),
                data.get("starDate"),
                data.get("hourStar"),
                data.get("endDate"),
                data.get("hourEnd"),
                data.get("nameLocation"),
                data.get("addresLocation"),
                data.get("latitudeLocation"),
                data.get("longitudeLocation"),
                data.get("unit"),
                data.get("contacTitle"),
                data.get("contactFirstName"),
                data.get("contactLastName"),
                data.get("contactEmail"),
                data.get("contactId"),
                data.get("contactUser"),
                data.get("reporterTitle"),
                data.get("reporterFirstName"),
                data.get("reporterLastName"),
                data.get("reporterEmail"),
                data.get("reporterId"),
                data.get("reporterUser")
                );


    }
}
