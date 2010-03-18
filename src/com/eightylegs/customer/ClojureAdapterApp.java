package com.eightylegs.customer;

import com.eightylegs.customer.Default80AppPropertyKeys;
import com.eightylegs.customer.I80App;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import crawly.app;

import java.io.PrintWriter;
import java.io.StringWriter;



class ClojureAdapterApp implements I80App {
  private I80App app;
  
  public ClojureAdapterApp() {
    this.app = new crawly.app();
  }
  
  public String getVersion() {
    return app.getVersion();
  }
  
  public void initialize( Properties properties, byte[] data ) {
    app.initialize(properties, data);
  }
  
  public Collection<String> parseLinks(byte[] documentContent, String url, Map<String, String> headers, Map<Default80AppPropertyKeys, Object> default80AppProperties, String statusCodeLine) {
    return app.parseLinks(documentContent, url, headers, default80AppProperties, statusCodeLine);
  }
  
  public byte[] processDocument(byte[] documentContent, String url, Map<String, String> headers, Map<Default80AppPropertyKeys, Object> default80AppProperties, String statusCodeLine) {
    return app.processDocument(documentContent, url, headers, default80AppProperties, statusCodeLine);
  }
}