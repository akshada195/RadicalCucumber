Feature: This file contains test scenarios of add employee

Scenario: 1. Validate New employee getting created and searched in HRMS system

Given Login with admin user
When Go to PIM Tab
Then validate user getting searched



Scenario: 2. Validate employee not getting created if mandatory fields missing.

Given Login with admin user
When Go to PIM Tab
Then validate user not getting searched
