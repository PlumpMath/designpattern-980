# 
CC  = c99
CXX = g++
MCS = mcs
JAVA = javac

all: TAGS a.out

a_cpp.exe: a.cpp
	$(CXX) $^ $(LDFLAGS) -o $@
a.exe: a.cs
	$(MCS) $^
a.out: a.o
	$(CXX) $^ $(LDFLAGS) -o $@

%.o: %.cpp
	$(CXX)  -c $(CXXFLAGS) -o $@ $< -MMD
%.o: %.c
	$(CC)  -c $(CFLAGS) -o $@ $<

TAGS:
	-@gtags
clean:
	-rm -f *.o
	-rm -f core GPATH GRTAGS GSYMS GTAGS
	-rm -f a.out a.exe

-include $(wildcard *.d)
