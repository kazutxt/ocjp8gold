## mvn
#init 
mvn archetype:generate -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false -DgroupId=com.sample -DartifactId=maven-project
# compile
mvn compile
# clean
mvn clean
# execute
java -cp target/classes/ com.sample.App

## java8 install
sudo add-apt-repository ppa:webupd8team/java
sudo apt-get update
sudo apt-get install oracle-java8-installer 
sudo update-java-alternatives -s java-8-oracle
