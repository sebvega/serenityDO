# create by sanchezvegaing@gmail.com
Feature: create new orders
  I as user,
  Wish make new orders for consolidate new owners
  To increase de earn to de business


  @orderWithNewProduct
  Scenario Outline: add new product
    Given "vega" starts session
      | user   | password   |
      | <user> | <password> |
    When added new product
      | productName     | <productName>     |
      | supplier        | <supplier>        |
      | categoty        | <categoty>        |
      | quantityPerUnit | <quantityPerUnit> |
      | unitPrice       | <unitPrice>       |
      | unitsInStock    | <unitsInStock>    |
      | unitsOnOrder    | <unitsOnOrder>    |
      | reorderLevel    | <reorderLevel>    |


    And create new order
      | customer   | orderDate   | requiredDate   | employee   | product   | unitPrice   | quantity   | discount   |
      | <customer> | <orderDate> | <requiredDate> | <employee> | <product> | <unitPrice> | <quantity> | <discount> |
    Then check the order status "<messenge>"


    Examples:
      | user  | password | productName    | supplier              | categoty   | quantityPerUnit | unitPrice | unitsInStock | unitsOnOrder | reorderLevel | customer            | orderDate  | requiredDate | employee | product | quantity | discount | messenge |
      | admin | serenity | leche de cabra | Cooperativa de Quesos | Condiments | 12              | 13        | 14           | 15           | 12           | Antonio Moreno Taqu | 11/15/2022 | 11/17/2022   | Margaret | Chai    | 12       | 0.10     | aaa      |

  @madeOrderWithNewShipper
  Scenario Outline: add new shipper
    Given "vega" starts session
      | user   | password   |
      | <user> | <password> |
    When added new shipper
      | companyName | <companyName> |
      | phone       | <phone>       |


    And create new order with shipper
      | customer   | orderDate   | requiredDate   | employee   | product   | unitPrice   | quantity   | discount   | shipVia   | shipName   | shipCountry   |
      | <customer> | <orderDate> | <requiredDate> | <employee> | <product> | <unitPrice> | <quantity> | <discount> | <shipVia> | <shipName> | <shipCountry> |
    Then check the  status "<messenge>"


    Examples:
      | user  | password | companyName   | phone          | customer      | orderDate  | requiredDate | employee | product | unitPrice | unitPrice | quantity | discount | shipVia          | shipName    | shipCountry | messenge |
      | admin | serenity | Donkey Faster | (503) 555-1231 | Blauer See De | 11/15/2022 | 11/17/2022   | Margaret | Chai    | 12        | 13        | 12       | 0.10     | Federal Shipping | DaveVentura | Bahamas     | aaa      |



