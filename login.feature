Feature: Adintelle login feature

  @p12
  Scenario: Login scenario
    Then user enters username
    Then user enters the password
    Then user lands on press app
      | press |
    Then user selects the client and brand
      | client | Brand         |
      | Laxmi  | organic india |
    Then user creates a new Campaign
      | ps11 |
    Then user creates a new estimate entries
      | publication | width | height | rate |
      | Sakal       |     2 |      3 | 2000 |
    Then user approves the Estimate
      | Auto New Camp ABC 2 |
    Then user pass the PO number
      | xyzpps12 |
    Then user create Schduling
      | INS |
      |   1 |
    Then user create Ro
    Then user create Client Bill
