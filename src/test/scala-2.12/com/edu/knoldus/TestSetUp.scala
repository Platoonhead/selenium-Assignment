package com.edu.knoldus

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.support.ui.WebDriverWait

/**
  * Created by knoldus on 3/2/17.
  */
trait TestSetUp {

  val BASE_URL = "https://www.flipkart.com/"
  val email = ""        //flipkart username/email
  val password = ""     // flipkart password
  System.setProperty("webdriver.chrome.driver", "/home/ankit/chromedriver")
  val capabilities = DesiredCapabilities.chrome()
val driver = new ChromeDriver(capabilities)
  val webdriverwait = new WebDriverWait(driver, 50)



}
