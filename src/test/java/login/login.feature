Feature:login
   @loginSuccess
   Scenario: scenario 1
     Given launch url
     When enter valid username & password
     Then i should see the login succesfully


   @loginUnsuccess @unsuccessFirst
  Scenario: scenario 2
    Given launch the url
    When enter Invalid username & valid password
    Then i should see the login unsuccesfully


   @loginUnsuccess @unsuccessSecound
  Scenario: scenario 3
    Given launch url
    When enter valid username & Invalid password
    Then i should see the login unsuccesfully








