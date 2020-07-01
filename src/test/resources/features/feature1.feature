Feature: Flight booking
Scenario Outline:  flight search
Given site launched using "<browser>"
When enter source city as "<fcity>"
And enter destination city as "<tcity>"
And select departure date
And click on search button
And Click duration
And select evening flight
And select lowest price flight
And Click on book button
And close site
Examples:
|browser|fcity|tcity|
|chrome|hyderabad|bengaluru|
##|safari|hyderabad|bengaluru|