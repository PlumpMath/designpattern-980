// Copyright (C) 2016 by iamslash

#include <cstdio>
#include <list>
#include <string>
#include <cstdlib>

class LoadBalancer {
 private:
  static LoadBalancer _instance;
  std::list<string> _servers;  
  
 public:
  void LoadBalancer() {
    _servers.push_back("");
    _servers.push_back("");
    _servers.push_back("");
    _servers.push_back("");
    _servers.push_back("");
    _servers.push_back("");
  }

  static LoadBalancer GetLoadBalancer() {
  }

  string GetServer() {
    int r = std::rand();
    return _servers[r];
  }
};

int main() {

  printf("Hello World");
}

