Feature:user1

  @loginpgeSuccess
  Scenario : scenario 1
    Given launch the url
    When enter  valid username & password
    Then i should see the login successful

  @loginpgeUnsuccess
  Scenario: scenario 2
    Given launch url
    When enter Invalid username & valid password
    Then i should see the login unsuccesfully