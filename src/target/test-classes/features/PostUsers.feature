@lookforusers
Feature: Delete all users

  Background: User already have access to http://reqres API

    Scenario: User want to post all users
      Given User click on list all button
      Then User should see status code 200

    Scenario Outline: User want to post a specific register
      Given User look for a single register
      When User enter id as "<user_id>"
      And User click on postUser button
      Then User should post status code <number>


