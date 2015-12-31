#作業内容
ソースを修正する        
mvn compile                         #compile
java -cp target/classes/ {filepath} #execute
mvn clean                           #clean(以下OKの場合)
git add -A                          #git add
git commit -m "comment"             #git commit
git push -u origin master           #git push

## git
git add -A
git commit -m "comment"
git push -u origin master

## mvn
#init 
mvn archetype:generate -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false -DgroupId=com.sample -DartifactId=maven-project
# compile
mvn compile
# clean
mvn clean
# execute
java -cp target/classes/ com.sample.App

#java8対応のためpom.xmlに以下を追加
    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <java.version>1.8</java.version>
    </properties>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.1</version>
                <configuration>
                    <source>${java.version}</source>
                    <target>${java.version}</target>
                </configuration>
            </plugin>
        </plugins>
    </build>
  

## java8 install
sudo add-apt-repository ppa:webupd8team/java
sudo apt-get update
sudo apt-get install oracle-java8-installer 
sudo update-java-alternatives -s java-8-oracle
