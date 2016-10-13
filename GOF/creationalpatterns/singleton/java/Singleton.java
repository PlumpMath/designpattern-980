// Copyright (C) 2016 by iamslash

// import java.util.List;
// import java.util.ArrayList;

public final class Singleton {
  private static final Singleton instance = new Singleton();
  private Singleton() {}

  public static Singleton getInstance() {
    return instance;
  }

  public void SayHello() {
    System.out.println("Hello World");
  }
}
