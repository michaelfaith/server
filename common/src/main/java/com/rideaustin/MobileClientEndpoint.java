package com.rideaustin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marker annotation to distinguish methods called from both mobile clients
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@RiderEndpoint
@DriverEndpoint
public @interface MobileClientEndpoint {
}
