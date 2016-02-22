/*
 * Copyright 2016 Aroma Tech.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

 
package tech.aroma.banana.exceptions;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Parent of all Banana Client Exceptions.
 * 
 * @author SirWellington
 */
public class BananaException extends RuntimeException
{

    private final static Logger LOG = LoggerFactory.getLogger(BananaException.class);

    public BananaException()
    {
    }

    public BananaException(String message)
    {
        super(message);
    }

    public BananaException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public BananaException(Throwable cause)
    {
        super(cause);
    }

}