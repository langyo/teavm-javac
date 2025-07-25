/*
 *  Copyright 2025 Alexey Andreev.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.teavm.classlib.java.text;

public final class TNormalizer {
    public enum Form {
        NFD,
        NFC,
        NFKD,
        NFKC
    }

    public static boolean isNormalized(CharSequence csq, Form form) {
        return true;
    }

    public static String normalize(CharSequence csq, Form form) {
        return csq.toString();
    }
}
