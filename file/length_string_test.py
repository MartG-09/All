from unittest import TestCase

import length_string

class TestValidatePrime(TestCase):
    
    def test_that_number_is_prime_number(self):
        is_Valid = length_string.isprime(2)
        self.assertTrue(is_Valid)
