Feature: Conference Registration

  Scenario: user is trying to register without entering credentials
    Given user is on conference registration page
    Then conference registration page should load with tile 'Conference Registration'
    
    When user will click on next without entering First Name
    Then 'Please fill the First Name' message should display
    
    When user will click on next without entering Last Name
    Then 'Please fill the Last Name' message should display
    
    When user will click on next without entering Email
    Then 'Please fill the Email' message should display
    
    When user will click on next without entering Contact no.
    Then 'Please fill the Contact No.' message should display
    
    When user will click on next withot entering valid Contact no. 
    Then 'Please enter valid Contact no.' message should display
    
    When user will click on next without selecting Number of people attending
    Then 'Please fill the Number of people attending' message should display
    
    When user will click on next without entering Building Name & Room No.
    Then 'Please fill the Building & Room No' message should display
    
    When user will click on next without entering Area Name
    Then 'Please fill the Area name' message should display
    
    When user will click on next without selcting City
    Then 'Please select city' message should display
    
    When user will click on next without selecting State
    Then 'Please select state' message should display
    
    When user will click on next without selecting Membership Status
    Then 'Please Select MemeberShip status' message should display
    
    When user will click on next by entering all valid details 
    Then 'Personal details are validated.' message should display
    And navigates to the payment page
   
    When user is on payement page
    Then conference registration page should load with tile 'Payment Details'
    
    When user clicks on make payment without entering Card Holder Name
    Then 'Please fill the Card holder name' message should display
    
    When user clicks on make payment without entering Debit Card Number
    Then 'Please fill the Debit card Number' message should display
    
    When user clicks on make payment without entering Expiration month
    Then 'Please fill expiration month' message should display
    
    When user clicks on make payment without entering Expiration year
    Then 'Please fill the expiration year' message should display
    
    When user clicks on make payment with valid details
    Then 'Conference Room Booking successfully done!!!' message should display