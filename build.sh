#!/bin/bash
cd octopus-parent
mvn clean install
echo "octopus-parent is in repo"
cd ..
cd octopus-shared
mvn clean install
echo "octopus-shared is in repo"
cd ..
cd octopus-ti
cd octopus-ti-parent
mvn clean install
echo "octopus-ti-parent is in repo"
echo "Then build all project"
cd ..
cd ..                 
mvn clean install
