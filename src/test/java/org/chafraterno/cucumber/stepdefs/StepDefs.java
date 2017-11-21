package org.chafraterno.cucumber.stepdefs;

import org.chafraterno.ChafraternoApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ChafraternoApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
