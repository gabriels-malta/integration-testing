Feature: Get all users

  Background: User already have access to http://reqres API

    Scenario: User want to see all users
      Given User click on search button
      Then User should see status code 200