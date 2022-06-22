package com.example.testmodulesresources.subpackage

import org.junit.Test
import org.junit.Assert.*
import com.example.testmodulesresources.R
import com.example.basemodule.R as RLib

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        R.string.material_motion_easing_accelerated
        com.google.android.material.R.string.material_motion_easing_accelerated
        R.string.first_fragment_label
        R.string.test_library_string2
        RLib.string.test_library_string
        RLib.string.test_library_string2
        com.example.basemodule.R.string.test_library_string2
        R.string.action_settings
        com.example.testmodulesresources.R.string.action_settings
//        R.string.app_name
//        R.string.test_library_string
        assertEquals(4, 2 + 2)
    }
}