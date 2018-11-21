@Echo off

cd octopus-parent
call mvn clean install
echo "octopus-parent is in repo"

cd .. 
cd octopus-shared
call mvn clean install
echo "octopus-shared is in repo"

cd ..
cd octopus-ti
cd octopus-ti-parent
call mvn clean install
echo "octopus-ti-parent is in repo"

echo "Then build all project"
                                   
cd ..
cd ..                 
call mvn clean install
