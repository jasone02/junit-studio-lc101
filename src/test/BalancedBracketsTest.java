package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void oneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void emptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void nonBracketString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("qwerty"));
    }

    @Test
    public void balancedBracketInteriorString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[qwerty]"));
    }

    @Test
    public void balancedBracketMixedString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("qw[e]rty"));
    }

    @Test
    public void imbalancedBracketInteriorString() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[qwerty]]"));
    }

    @Test
    public void imbalancedBracketMixedString() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("qw[e]rt]y"));
    }

    @Test
    public void backwardsBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void backwardsBracketInteriorString() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]qwerty["));
    }

    @Test
    public void backwardsBracketMixedString() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("qw]e[rty"));
    }

    @Test
    public void imbalancedBackwardsBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][["));
    }

}
