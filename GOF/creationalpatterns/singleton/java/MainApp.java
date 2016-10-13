// Copyright (C) 2016 by iamslash

//import Singleton;

public class MainApp {
  public static void main(String[] args) {

    LoadBalancer b1 = LoadBalancer.GetLoadBalancer();
    LoadBalancer b2 = LoadBalancer.GetLoadBalancer();
    LoadBalancer b3 = LoadBalancer.GetLoadBalancer();
    LoadBalancer b4 = LoadBalancer.GetLoadBalancer();

    // Same instance?
    if (b1 == b2 && b2 == b3 && b3 == b4)
    {
      System.out.println("Same instance\n");
    }

    // Load balance 15 server requests
    LoadBalancer balancer = LoadBalancer.GetLoadBalancer();
    for (int i = 0; i < 15; i++)
    {
      String server = balancer.Server();
      System.out.println("Dispatch Request to: " + server);
    }

    try {
      // Wait for user
      System.in.read();
    }
    catch (Throwable e) {
      System.out.println("Error " + e.getMessage());
      e.printStackTrace();
    }


  }
}
