package com.emiliorodo

import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.HttpClientBuilder
import org.scalatest.{FlatSpec, Matchers}

class SampleIT extends FlatSpec with Matchers {

  behavior of "scala-ad-sdk-client"
  
  it should "respond to a call to its dummy endpoint" in {
    //Given
    val httpClient = HttpClientBuilder.create().build()
    val request = new HttpGet("http://localhost:8000/health")

    //When
    val response = httpClient.execute(request)
    
    //Then
    response.getStatusLine.getStatusCode shouldEqual 200
  }
}
