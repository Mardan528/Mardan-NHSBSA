#User Story
#As a person from Wales
#I need to know what help I can get with my NHS costs
#So that I can get the treatment I need
@test
Feature: About the person free treatment

  Scenario: About the person circumstances
    Given I am a person from "Wales" date of birth "27" "05" "1988"
    When I put my circumstances into the Checker tool

      | Living with Partner                         | No   |
      | Benefits or tax credits                     | No   |
      | Are you pregnant                            | No   |
      | Injury or illness                           | No   |
      | Do you have diabetes                        | No   |
      | Do you have glaucoma                        | No   |
      | Do you live permanently in a care home      | No   |
      | Do you have Investments or property         | No   |



    Then I should get a result of whether I will get help or not
