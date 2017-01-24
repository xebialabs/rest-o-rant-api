package com.xebialabs.restorant.models;

public class Restaurant {

  private final String name;
  private final String snippet;

  public Restaurant(String name, String snippet) {
    this.name = name;
    this.snippet = snippet;
  }

  public String getName() {
    return name;
  }

  public String getSnippet() {
    return snippet;
  }

  public boolean matches(String q) {
    q = q.toLowerCase();
    return name.toLowerCase().contains(q) || snippet.toLowerCase().contains(q);
  }

}
