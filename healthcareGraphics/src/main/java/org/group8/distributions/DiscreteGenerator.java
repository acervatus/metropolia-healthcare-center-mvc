package org.group8.distributions;

/** A continuous generator provides a long value according to the distribution it relies on.
 */
public interface DiscreteGenerator extends Seedable {
    long sample(); 
}
