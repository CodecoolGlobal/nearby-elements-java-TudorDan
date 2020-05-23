#!/bin/sh

# TODO
find -name '*.java' | xargs javac -Xlint:all

java main.java.com.codecool.nearby.NearbyElementsChecker