/*
 * @(#)Iterable.java	1.5 06/04/07
 *
 * Copyright 2006 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package java.lang;

import java.util.Iterator;


public interface Iterable<T> {


    Iterator<T> iterator();
}


