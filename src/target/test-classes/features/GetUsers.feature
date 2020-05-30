@looforusers
Feature: Get all users

  Background: User already have access to http://reqres API

    Scenario: User want to see all users
      Given User click on list all button
      Then User should see status code 200

    Scenario Outline: User want to get a specific register
      Given User look for a single register
      When User enter id as "<user_id>"
      And User click on getUser button
      Then User should see status code <number>

    Examples:
      |user_id|number|
      |2    |200   |
      |23   |404   |