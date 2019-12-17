#!/bin/bash

java -jar jflex-1.6.1.jar Regex.jlex
java -jar java-cup-11b.jar -expect 4 Regex.cup
