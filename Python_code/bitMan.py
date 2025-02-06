def has_unique_characters(s: str) -> bool:
    checker = 0
    for char in s:
        bit_index = ord(char) - ord('a')
        if (checker & (1 << bit_index)) > 0:
            return False
        checker |= (1 << bit_index)
    return True

# Test cases
print(has_unique_characters("leetcode"))  # False
print(has_unique_characters("abc"))       # True