package com.example.fitnesstrener;

import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;
import static org.junit.Assert.*;

import android.widget.EditText;


import androidx.test.rule.ActivityTestRule;

import com.example.fitnesstrener.authorization.Login;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class LoginTest {
    @Rule
    public ActivityTestRule<Login> mActivityTestRule = new ActivityTestRule<Login>(Login.class);
    private Login login = null;

    @Before
    public void setUp() throws Exception {
        login = mActivityTestRule.getActivity();
    }
    @Test
    public void testLogin(){
        EditText email = login.findViewById(R.id.email_login);

        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                email.requestFocus();
            }
        });
        getInstrumentation().waitForIdleSync();
        getInstrumentation().sendStringSync("cam1@mail.ru");
        getInstrumentation().waitForIdleSync();

        assertEquals("cam1@mail.ru", email.getText().toString());

    }
    @Test
    public void testPassword(){
        EditText password = login.findViewById(R.id.password_login);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                password.requestFocus();
            }
        });
        getInstrumentation().waitForIdleSync();
        getInstrumentation().sendStringSync("111111");
        getInstrumentation().waitForIdleSync();

        assertEquals("111111", password.getText().toString());

    }

    @After
    public void tearDown() throws Exception {
        login = null;
    }
}