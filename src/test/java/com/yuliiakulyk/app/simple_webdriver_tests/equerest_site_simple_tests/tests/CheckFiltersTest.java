package com.yuliiakulyk.app.simple_webdriver_tests.equerest_site_simple_tests.tests;

import com.yuliiakulyk.app.simple_webdriver_tests.equerest_site_simple_tests.pages.ProjectsPage;
import com.yuliiakulyk.app.simple_webdriver_tests.BaseTests;
import org.junit.Test;

/**
 * Created by Yuliia Kulyk on 21.12.2016.
 */
public class CheckFiltersTest extends BaseTests {

    @Test
    public void checkFilterInvested() {
        ProjectsPage projectsPage = new ProjectsPage(driver);
    }
}
