Feature: Validate Get request

Scenario: 1.Validate Demo QA up and running
    Given Hit the URI
    Then validate value for below data

    
    |books[0].title				|Git Pocket Guide										|
    |books[0].pages				|234																|
    |books[0].author			|Richard E. Silverman								|
    |books[0].publisher		|O'Reilly Media											|
    |books[1].title				|Learning JavaScript Design Patterns|