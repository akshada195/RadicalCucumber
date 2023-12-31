@Regression
Feature: valdiate POST request

  Scenario: 1.Validate you are able to create data in system
    Given post the data to create user 
    Then validate status code is "201"
    Then validate id created for user with non null value 
    Then validate id created for user with non zero value
    
    
    Scenario: 2.Validate you are able to create user from File
    Given post the data to create user from file
    Then validate status code is "201"
    Then validate id created for user with non null value 
    Then validate id created for user with non zero value
    
    
    Scenario: 3.Validate you are able to create user from update File with name field
    Given post the data to create user from file with updated name
    Then validate status code is "201"
    Then validate id created for user with non null value 
    Then validate id created for user with non zero value
    
    Scenario: 4.Validate you are able to create user from update File with name field
    Given post the data to create user from file with updated fields
    |name|
    Then validate status code is "201"
    Then validate id created for user with non null value 
    Then validate id created for user with non zero value
    
    
    Scenario: 5.Validate you are able to create user from update File with name field
    Given post the data to create user from file with updated fields
    |name|
    |job|
    |mob|
    Then validate status code is "201"
    Then validate id created for user with non null value 
    Then validate id created for user with non zero value
    