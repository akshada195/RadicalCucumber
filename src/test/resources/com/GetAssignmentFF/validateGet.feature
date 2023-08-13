Feature: Validate Get request

Scenario: 1. Validate book "Git Pocket Guide" available in response
Given Hit the URI
Then validate title available in response


Scenario: 2.Validate if book is "Speaking Java Script" author should be "Axel Rauschmayer"
    Given Hit the URI
    Then validate Author for book
  