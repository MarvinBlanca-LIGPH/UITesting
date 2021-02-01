package com.example.uitesting

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.*
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginTest{
    @JvmField
    @Rule
    var mActivityRule: ActivityTestRule<LoginActivity> = ActivityTestRule(LoginActivity::class.java)

    @Test
    fun successLoginTest() {
        onView(withId(R.id.username))
            .perform(typeText("username"))

        onView(withId(R.id.password))
            .perform(typeText("password"))

        onView(withId(R.id.button_login))
            .check(matches(isDisplayed()))
            .perform(click())
    }

    @Test
    fun failedLoginTest() {
        onView(withId(R.id.username))
            .perform(typeText("username"))

        onView(withId(R.id.password))
            .perform(typeText("pass"))

        onView(withId(R.id.button_login))
            .check(matches(isDisplayed()))
            .perform(click())
    }

    @Test
    fun failedLoginTest2() {
        onView(withId(R.id.username))
            .perform(typeText(""))

        onView(withId(R.id.password))
            .perform(typeText("password"))

        onView(withId(R.id.button_login))
            .check(matches(isDisplayed()))
            .perform(click())
    }
}