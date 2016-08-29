# Multi-module project to test Sonar Stash plugin

If project which is analyzed is placed in different location then GIT ROOT, in Stash/Bitbucket the diff path looks like: 
``` 
src/lib/src/main/java/pl/com/bernas/sonar/stash/test/lib/DummyService.java
```
Sonar Stash plugin is not able to add comments, because  of message:

```
INFO: Comment "squid:S00112" cannot be pushed to Stash like it does not belong to diff view - lib/src/main/java/pl/com/bernas/sonar/stash/test/lib/DummyService.java (line: 21)
```
