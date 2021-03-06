/*
 * Javolution - Java(TM) Solution for Real-Time and Embedded Systems
 * Copyright (C) 2005 - Javolution (http://javolution.org/)
 * All rights reserved.
 * 
 * Permission to use, copy, modify, and distribute this software is
 * freely granted, provided that this notice is preserved.
 */
package java.io;
import java.io.IOException;

public class SyncFailedException extends IOException {
    public SyncFailedException(String desc) {
        super(desc);
    }
}