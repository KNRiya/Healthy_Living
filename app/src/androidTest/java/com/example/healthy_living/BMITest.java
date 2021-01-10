package com.example.healthy_living;

import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class BMITest {
    @Rule
    public ActivityTestRule<BMI> nActivityTestRule = new ActivityTestRule<BMI>(BMI.class);
    private BMI nActivity = null;

    
    @Before
    public void setUp() throws Exception {

        nActivity= nActivityTestRule.getActivity();

    }

    @Test
    public void testLaunch(){
        View view= nActivity.findViewById(R.id.result);
        assertNotNull(view);
    }

    @After
    public void tearDown() throws Exception {
        nActivity=null;
    }

    private class ActivityTestRule<T> {
        public ActivityTestRule(Class<T> bmiClass) {
        }

        public T getActivity() {
            return null;
        }
    }
}