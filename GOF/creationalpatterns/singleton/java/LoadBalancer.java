// Copyright (C) 2016 by iamslash

// java.util.Vector;
import java.util.ArrayList;
import java.util.Random;

/// <summary>
/// The 'Singleton' class
/// </summary>
public  class LoadBalancer
{
  private static LoadBalancer _instance;
  private ArrayList<String> _servers = new ArrayList<String>();
  private Random _random = new Random();

  // Lock synchronization object
  private static Object syncLock = new Object();

  // Constructor (protected)
  protected LoadBalancer()
  {
    // List of available servers
    _servers.add("ServerI");
    _servers.add("ServerII");
    _servers.add("ServerIII");
    _servers.add("ServerIV");
    _servers.add("ServerV");
  }

  public static LoadBalancer GetLoadBalancer()
  {
    // Support multithreaded applications through
    // 'Double checked locking' pattern which (once
    // the instance exists) avoids locking each
    // time the method is invoked
    if (_instance == null)
    {
      synchronized(syncLock)
      {
        if (_instance == null)
        {
          _instance = new LoadBalancer();
        }
      }
    }

    return _instance;
  }

  // Simple, but effective random load balancer
  public String Server()
  {
    int r = _random.nextInt(_servers.size());
    return _servers.get(r);
  }
}
