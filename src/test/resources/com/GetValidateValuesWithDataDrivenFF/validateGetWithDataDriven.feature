Feature: Validate Get request with DataDriven

Scenario Outline: 4.Validate data with datadrive testing
    Given hit the URI
    Then validate value for <jsonPath> is <Value>
    Examples:
			    |jsonPath							|Value														    |
			    |'books[0].title'			|'Git Pocket Guide'								  |
			    |'books[0].pages'			|'234'															|
			    |'books[0].author'		|'Richard E. Silverman'							|
			    |'books[0].publisher'	|"O'Reilly Media"										|
			    |'books[1].title'			|'Learning JavaScript Design Patterns'|
			    |'books[2].title'			|'dfsdafdsa fddsf sda'						   |