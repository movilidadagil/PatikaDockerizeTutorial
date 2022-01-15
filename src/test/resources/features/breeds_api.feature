Feature: List breeds and verify counts.


  @burak
Scenario: Check count for images of appenzeller, african, bulldog, bullterrier
  Given use those breeds with count appenzeller 150, african 170, bulldog 350, bullterrier 157
  When  I make request for image count for those breeds one by one
  Then  I verify counts by response

  @hasan
  Scenario: Check count for images of appenzeller, african, bulldog, bullterrier
    Given use those breeds with count "breedslist"
    When  I make request for image count for "breedslist" one by one
    Then  I verify counts by response with "breedslist"

    @emrecandan
    Scenario Outline: Check count for images of each breeds
      When I make request image count for "<breeds_name>"
      Then I verify count to <images_count>
      Examples:
        |breeds_name| images_count|
        | appenzeller| 150       |
        | african    | 171        |
        | bulldog    | 351        |
        |bullterrier | 158        |









