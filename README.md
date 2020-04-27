# play-config-merge
Demonstrate application.conf merge/resolution order conflict in Play/Lightbend Config

# setup
1) clone the repo
2) cd play-config-merge/projectA
3) sbt
4) run
5) visit http://localhost/ in your browser

# result
application.conf "myKey" in projectB takes precedence over parent projectA's 
application.config "myKey" value (we would expect the opposite, that the parent project/Play 
application runner takes precedence).

# workaround
convert dependent child projects from application.conf to reference.conf.

# related issue
https://github.com/lightbend/config/issues/680
