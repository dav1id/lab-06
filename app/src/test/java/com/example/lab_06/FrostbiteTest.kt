package com.example.lab_06

import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class FrostbiteTest {
    private lateinit var evilWizard: Wizard // lateinit lets us assign it later in the code -> cant just define it

    @Before
    fun setUp() {
        evilWizard = Wizard("Evil Wizard", 30, 10)
    }

    @Test
    fun castSpell_frostbite_unsuccessful(){
        evilWizard.mana = 3
        val damageDealt = evilWizard.castSpell("Frostbite")

        assertEquals(0, damageDealt)
    }

}