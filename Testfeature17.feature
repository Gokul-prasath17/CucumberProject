Feature: Calulator functionality 
   This describe the funnctionality of calculator
 
  Scenario Outline: Adding two numbers
Given I enter "<input_one>"
And I press "<operator>"
And I entered "<input_two>"
When I have press equal button
Then Result "<Result>" should be display

Examples:
| input_one | |operator  | | input_two  |  |Result|
|30         | | +        | | 50         |  |80    |
|50         | | -        | | 30         |  |20    |
|2          | |*         | |25          |  ||





