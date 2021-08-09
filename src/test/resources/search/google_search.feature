Feature: name ot the feature (Google search func)

  Scenario: User open browser and try search for acodemy
    Given user opens browser
    Then user enters "acodemy"
    And click on search button
    Then user check if result count is "12"
