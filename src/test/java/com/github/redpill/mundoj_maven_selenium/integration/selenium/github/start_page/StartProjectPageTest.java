package com.github.redpill.mundoj_maven_selenium.integration.selenium.github.start_page;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.github.redpill.mundoj_maven_selenium.core.category.SeleniumBasicCategory;

@Category(SeleniumBasicCategory.class)
public class StartProjectPageTest extends StartProjectPage {

    @Test
    public void openHomePageTest() {
	Assert.assertTrue(openHomePage());
    }

    @Test
    public void verifyReadmeTest() {
	Assert.assertTrue(verifyReadme());
    }

    @Test
    public void verifyIssuesLinkTest() {
	Assert.assertTrue(verifyIssuesLink());
    }

    @Test
    public void clickIssuesLinkTest() {
	Assert.assertTrue(verifyClickedIssuesLink());
    }

    public StartProjectPageTest() {
	super();
    }
}
