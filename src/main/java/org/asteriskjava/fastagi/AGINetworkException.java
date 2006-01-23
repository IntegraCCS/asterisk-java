/*
 * Copyright  2004-2005 Stefan Reuter
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.asteriskjava.fastagi;

/**
 * The AGINetworkException usally wraps an IOException denoting a network
 * problem when talking to the Asterisk server.
 * 
 * @author srt
 * @version $Id: AGINetworkException.java,v 1.1 2005/03/11 09:37:39 srt Exp $
 */
public class AGINetworkException extends AGIException
{
    /**
     * Serial version identifier.
     */
    private static final long serialVersionUID = 3256445789629723703L;

    public AGINetworkException(String message, Throwable cause)
    {
        super(message, cause);
    }
}