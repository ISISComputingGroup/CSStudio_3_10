/*******************************************************************************
 * Copyright (c) 2011 Oak Ridge National Laboratory.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.csstudio.logging;

/** Detail of messages generated by {@link LogFormatter}
 *  @author Kay Kasemir
 */
public enum LogFormatDetail
{
    /** Only display time and message */
    LOW,

    /** Display time, source info, message, exception stack trace */
    HIGH;
}