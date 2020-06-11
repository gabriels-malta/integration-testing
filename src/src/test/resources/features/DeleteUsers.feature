@lookforusers
Feature: Delete all users

  Background: User already have access to http://reqres API

    Scenario: User want to delete all users
      Given User click on list all button
      Then User should see status code 200

    Scenario Outline: User want to get a specific register
      Given User look for a single register
      When User enter id as "<user_id>"
      And User click on deleteUser button
      Then User should see status code <number>

    Examples:
      |user_id|number|
      |1013   |204   |
