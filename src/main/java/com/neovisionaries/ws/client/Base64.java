/*
 * Copyright (C) 2015 Neo Visionaries Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.neovisionaries.ws.client;


import java.util.Base64.Encoder;

class Base64
{
    private static final Encoder encoder = java.util.Base64.getEncoder();

    public static String encode(String data)
    {
        if (data == null)
        {
            return null;
        }

        return encoder.encodeToString(Misc.getBytesUTF8(data));
    }


    public static String encode(byte[] data)
    {
        if (data == null)
        {
            return null;
        }

        return encoder.encodeToString(data);
    }
}
