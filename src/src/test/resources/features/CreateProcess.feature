Feature: Create a new process

  Background: User already have access to http://agapito-server.herokuapp.com

  Scenario: User want to create a new process
    Given User already in new process page
    And User fill field vara with value "789"
    And User fill field numero_processo with value "789"
    And User fill field natureza with value "789"
    And User fill field partes with value "789"
    And User fill field urgente with value "N"
    And User fill field arbitramento with value "N"
    And User fill field assistencia_social with value "789"
    And User fill field data_entrada with value "06-06-2020"
    And User fill field status with value "789"
    And User click on save button
    Then User should see status code 201
