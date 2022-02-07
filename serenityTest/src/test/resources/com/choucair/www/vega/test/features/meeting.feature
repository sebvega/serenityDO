# create by sanchezvegaing@gmail.com
Feature: fill instance in meetings


  @fullMeetingHappiness
  Scenario Outline: fill in meeting fields
    Given "vega" starts session
      | user   | password   |
      | <user> | <password> |
    When added business unit
      | nameBusiness | <nameBusiness> |


    And configured meeting
      | nameBussinesUnit   | meetingName   | meetingType   | meetingNumber   | starDate   | hourStar   | endDate   | hourEnd   | nameLocation   | addresLocation   | latitudeLocation   | longitudeLocation   | unit   | contacTitle   | contactFirstName   | contactLastName   | contactEmail   | contactId   | contactUser   | reporterTitle   | reporterFirstName   | reporterLastName   | reporterEmail   | reporterId   | reporterUser   |
      | <nameBussinesUnit> | <meetingName> | <meetingType> | <meetingNumber> | <starDate> | <hourStar> | <endDate> | <hourEnd> | <nameLocation> | <addresLocation> | <latitudeLocation> | <longitudeLocation> | <unit> | <contacTitle> | <contactFirstName> | <contactLastName> | <contactEmail> | <contactId> | <contactUser> | <reporterTitle> | <reporterFirstName> | <reporterLastName> | <reporterEmail> | <reporterId> | <reporterUser> |
    Then check the status "<messenge>"


    Examples:
      | user  | password | nameBusiness  | nameBussinesUnit | meetingName | meetingType | meetingNumber | starDate   | hourStar | endDate    | hourEnd | nameLocation | addresLocation | latitudeLocation | longitudeLocation | unit       | contacTitle                   | contactFirstName | contactLastName | contactEmail                | contactId | contactUser | reporterTitle             | reporterFirstName | reporterLastName | reporterEmail     | reporterId | reporterUser | messenge |
      | admin | serenity | Business vega | meet to boss     | 1757        | 176430      | 123456        | 10/02/2022 | 07:30    | 10/02/2022 | 08:00   | block center | cra123#12-21   | 73.42542         | 45.43242          | salamander | meet a new elemento to family | juan sebastian   | sancehz vega    | sanchezvega@sanchezvega.com | 1112343   | admin       | initialitation to context | david             | vergara          | david@vergara.com | 1112321    | admin        | aaa         |