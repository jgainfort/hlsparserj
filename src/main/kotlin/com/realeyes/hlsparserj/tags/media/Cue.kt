/**
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
package com.realeyes.hlsparserj.tags.media

import com.realeyes.hlsparserj.tags.Tag
import com.realeyes.hlsparserj.tags.UnparsedTag

class Cue(override var tag: UnparsedTag?) : Tag {
    override var headerTag = false

    val duration: Float? by lazy { tag?.getAttributes()?.get(DURATION)?.toFloat() }

    val id: Int? by lazy { tag?.getAttributes()?.get(ID)?.toInt() }

    val type: String? by lazy { tag?.getAttributes()?.get(TYPE) }

    val time: Float? by lazy { tag?.getAttributes()?.get(TIME)?.toFloat() }

    val caid: String?  by lazy { tag?.getAttributes()?.get(CAID) }

    companion object {
        private const val DURATION = "DURATION"
        private const val ID = "ID"
        private const val TYPE = "TYPE"
        private const val TIME = "TIME"
        private const val CAID = "CAID"
    }
}
